package com.moon.ancientpoetry.common.spider;

import com.moon.ancientpoetry.common.util.WriteToFile;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class AuthorUrlSpider {
    private WriteToFile writeToFile;
    Set<String> authorUrlSet = new HashSet();

    public AuthorUrlSpider() throws FileNotFoundException {
        writeToFile = new WriteToFile(
                "D:\\project\\idea_project\\ancient-poetry\\ancient-poetry-common\\src\\main\\resources\\author_source.txt");

    }


     int doSpider(String url){
        int i = 0;
        try {
            Document document = Jsoup.connect(url).get();
            Elements links = document.select("a[href]");

            for (Element link : links) {
                if(link.attr("href").contains("authorv_")) {
                    System.out.println("link : https://so.gushiwen.org" + link.attr("href"));
                    String authorUrl = "https://so.gushiwen.org" + link.attr("href") +"\r\n";
                    if(!authorUrlSet.contains(authorUrl)){
                        authorUrlSet.add(authorUrl);
                        i++;
                    }
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return i;
    }


    public void writeSetToFile(){
        for(String str : authorUrlSet){
            writeToFile.writeDataToFile(str);
        }
        System.out.println(authorUrlSet.size());
    }

    public static void main(String[] args) throws FileNotFoundException {
        AuthorUrlSpider AuthorUrlSpider = new AuthorUrlSpider();
        int count = 0;
        for (int i = 1; i <= 1000; i++) {
            count += AuthorUrlSpider.doSpider("https://so.gushiwen.org/authors/default.aspx?p=" + i + "&c=");
        }

        AuthorUrlSpider.writeSetToFile();
        System.out.println("count :" + count);

    }
}
