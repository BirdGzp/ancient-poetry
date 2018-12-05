package com.moon.ancientpoetry.common.util.spider;

import com.moon.ancientpoetry.common.po.AncientAuthor;
import com.moon.ancientpoetry.common.util.spider.Dao.AuthorDao;
import com.moon.ancientpoetry.common.util.FileUtil;
import com.moon.ancientpoetry.common.util.UrlImageDownloadUtil;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class AuthorSpider {

    public static void main(String[] args)  {
        System.setProperty("http.maxRedirects", "50");
        System.getProperties().setProperty("proxySet", "true");
        System.getProperties().put("https.proxyHost", "proxy.piccnet.com.cn");
        System.getProperties().put("https.proxyPort", "3128");//注意端口为String类型。

        boolean flag = false;
        try {
            String str = FileUtil.readTxtFile("D:\\project\\idea_project\\ancient-poetry\\ancient-poetry-common\\src\\main\\resources\\author_source.txt");
            String[] temp = str.split("\r\n");
            AuthorDao authorDao = new AuthorDao();
            for (int i = 7114; i < temp.length; i++) {
                System.out.println(i);
                AncientAuthor author = getAuthorMessage(temp[i]);


                if(!flag && author.getAuthorName().equals("黄大受")){
                    flag = true;
                    continue;
                }

                if(flag) {
                    authorDao.insert(author);
                }

            }
        }catch (Exception e){
           e.printStackTrace();
        }

    }

    public static AncientAuthor getAuthorMessage(String url) throws IOException {
        AncientAuthor author = new AncientAuthor();

        String  agent="Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko)Chrome/56.0.2924.87 Safari/537.36" ;

        Document document = Jsoup.connect(url).userAgent(agent).ignoreHttpErrors(true).timeout(3000).get();
        Elements elements = document.select("b");
        for (Element element : elements) {
            author.setAuthorName(element.text());
            break;
        }
        elements = document.select("p[style]");
        for (Element element : elements) {
            String text = element.text();
            author.setAuthorIntroduce(text);
            try {
                String authorLifetime =  text.substring(text.indexOf('（') + 1, text.indexOf('）'));
                if((authorLifetime.contains("-") || authorLifetime.contains("——") ||authorLifetime.contains("—")) && authorLifetime.length() < 30){
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
                }else if(temp.contains("篇诗文")){
                    author.setAuthorArticleCount(Integer.parseInt(temp.substring(temp.indexOf("► ") + 2, temp.length() - 3)));
                }
                if(i == flag){
                    break;
                }
                i = flag;
                i++;
            }
            break;
        }
        elements = document.select("img[alt]");
        for (Element element : elements) {
            if(element.attr("src").contains("authorImg")){
                UrlImageDownloadUtil.getHtmlPicture(element.attr("src"));
            }
        }
        if(author.getAuthorArticleCount() == null){
            author.setAuthorArticleCount(0);
        }
        System.out.println(author.toString());
        return author;
    }

}
