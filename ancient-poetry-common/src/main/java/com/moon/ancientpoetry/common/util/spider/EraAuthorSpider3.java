package com.moon.ancientpoetry.common.util.spider;

import com.moon.ancientpoetry.common.util.UrlImageDownloadUtil;
import com.moon.ancientpoetry.common.util.WriteToFile;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class EraAuthorSpider3 {

    Set ahthorSet = new HashSet();
    List<Author> authors = new ArrayList<>();
    String  agent="Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko)Chrome/56.0.2924.87 Safari/537.36" ;

    private WriteToFile writeToFile;

    {
        try {
            writeToFile = new WriteToFile(
                    "D:\\project\\idea_project\\ancient-poetry\\ancient-poetry-common\\src\\main\\resources\\author_era_yuandai.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    ;


    public int spiderUrl(String url){
        int i = 0;
        try {
            Document document = Jsoup.connect(url).userAgent(agent).ignoreHttpErrors(true).timeout(3000).get();
            Elements authorNames = document.select("b");
            Elements authorIntroduce = document.select("p[style]");
            Elements authorArticleUrl = document.select("p > a");
            for (int j = 0; j < authorNames.size(); j++) {
                String temp = authorNames.get(j).text() + " #" + authorIntroduce.get(j * 2 + 1).text() + " #https://so.gushiwen.org" +
                        authorArticleUrl.get(j * 3 + 2).attr("href") + " #"+ authorArticleUrl.get(j * 3 + 2).text().substring(1);
                System.out.println(temp);

                writeToFile.writeDataToFile("元代 #" + temp + "\r\n");
            }

            Elements authorImage = document.select("img[alt]");
            for (Element element : authorImage) {
                if(element.attr("src").contains("authorImg")){

                    UrlImageDownloadUtil.getHtmlPicture(element.attr("src"));

                }
            }
            Thread.sleep(1000);

        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return i;
    }


    public static void main(String[] args) {
        System.setProperty("http.maxRedirects", "50");
        System.getProperties().setProperty("proxySet", "true");
        System.getProperties().put("https.proxyHost", "proxy.piccnet.com.cn");
        System.getProperties().put("https.proxyPort", "3128");//注意端口为String类型。


        EraAuthorSpider3 eraAuthorSpider = new EraAuthorSpider3();
        for (int i = 1; i <= 1000; i++) {
            eraAuthorSpider.spiderUrl("https://so.gushiwen.org/authors/Default.aspx?p=" + i + "&c=%E5%85%83%E4%BB%A3");
        }

    }
}
