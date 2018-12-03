package com.moon.ancientpoetry.common.util.spider.Parse;

import com.moon.ancientpoetry.common.enums.Dynasty;
import com.moon.ancientpoetry.common.util.spider.Dao.AuthorDao;
import com.moon.ancientpoetry.common.util.FileUtil;

import java.io.IOException;
import java.sql.SQLException;
import java.util.HashMap;

public class FileParse {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        System.setProperty("http.maxRedirects", "50");
        System.getProperties().setProperty("proxySet", "true");
        System.getProperties().put("https.proxyHost", "proxy.piccnet.com.cn");
        System.getProperties().put("https.proxyPort", "3128");//注意端口为String类型。

        HashMap<String, String> authors = new HashMap<>();


        boolean flag = true;
        Author author = null;
        String str = null;
        try {
            str = FileUtil.readTxtFile("D:\\project\\idea_project\\ancient-poetry\\ancient-poetry-common\\src\\main\\resources\\author_era_urls.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
        String[] temp = str.split("\r\n");
        AuthorDao authorDao = new AuthorDao();
        for (int i = 0; i < temp.length; i++) {
            author = new Author();
            String[] info = temp[i].split(" #");
            if(info.length < 4){
                continue;
            }

            if(authors.get(info[1]) != null && info[0].equals(authors.get(info[1]))){
                continue;
            }
            authors.put(info[1], info[0]);
            author.setAuthorDynstyName(info[0]);
            author.setAuthorDynastyId(Dynasty.getDynasty(info[0]));
            author.setAuthorName(info[1]);
            author.setAuthorIntroduce(info[2]);
            author.setArticleUrl(info[3]);
            author.setAuthorAritcleCount(Integer.parseInt(info[4].substring(1, info[4].indexOf("篇"))));
            parseIntroduce(info[2], author);
            if(!flag && author.getAuthorName().equals("黄大受")){
                flag = true;
                continue;
            }

            if(flag) {
                try {
                    authorDao.insert(author);
                }catch (Exception e){
                    e.printStackTrace();
                    System.out.println("插入异常，跳过");
                }
            }

        }
    }

    public static void parseIntroduce(String text, Author author){
        try {
            String authorLifetime =  text.substring(text.indexOf('（') + 1, text.indexOf('）'));
            if((authorLifetime.contains("－") || authorLifetime.contains("——") ||authorLifetime.contains("—")) && authorLifetime.length() < 30){
                author.setAuthorLifetime(authorLifetime);
            }
        }catch (Exception e){
        }

        for (int i = 0; i < text.length();) {

            int flag = text.indexOf("，", i  ) > text.indexOf("。", i ) ? text.indexOf("。", i  ) : text.indexOf("，", i);
            if(flag == -1){
                flag = text.indexOf("。", i);
                if(flag == -1) {
                    flag = text.length();
                }
            }
            String temp = text.substring(i, flag);
            if(temp.indexOf('号') == 0){
                if(temp.contains("（")) {
                    author.setAuthorAlternativeName(temp.substring(1, temp.indexOf("（")));
                }else {
                    if(temp.length() < 20) {
                        author.setAuthorAlternativeName(temp.substring(1));
                    }
                }
            }else if(temp.indexOf('字') == 0){
                if(temp.contains("（")) {
                    author.setAuthorCharacter(temp.substring(1, temp.indexOf("（")));
                }else {
                    if (temp.length() < 20) {
                        author.setAuthorCharacter(temp.substring(1));
                    }
                }
            }else if(temp.indexOf("谥号") == 0){
                author.setAuthorCall(temp.substring(2));
            }else if(temp.indexOf("人") == temp.length() - 1){
                author.setAuthorAddress(temp);
            }else if(temp.contains("祖籍")){
                author.setAuthorAddress(temp.substring(2));
            }else if(temp.indexOf("名") == 0){
                if(temp.contains("（")) {
                    author.setAuthorFame(temp.substring(1, temp.indexOf("（")));
                }else {
                    if(temp.length() < 20) {
                        author.setAuthorFame(temp.substring(1));
                    }
                }
            }
            if(i == flag){
                break;
            }
            i = flag;
            i++;
        }
    }
}
