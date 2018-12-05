package com.moon.ancientpoetry.common.util.spider.article.spider;

import com.moon.ancientpoetry.common.po.AncientArticle;
import com.moon.ancientpoetry.common.po.AncientAuthor;
import com.moon.ancientpoetry.common.util.spider.Dao.ArticleDao;
import com.moon.ancientpoetry.common.util.spider.Dao.AuthorDao;
import com.moon.ancientpoetry.common.util.WriteToFile;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.HashSet;

public class AritcleSpider {
    public  static  AuthorDao authorDao;
    public static ArticleDao articleDao;
    public static WriteToFile writeToFile;

    static {
        try {
            writeToFile = new WriteToFile("D:\\project\\idea_project\\ancient-poetry\\ancient-poetry-common\\src\\main\\resources\\article.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            authorDao = new AuthorDao();
            articleDao = new ArticleDao();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {


        for (int i = 5; i <= 15655; i++) {
            AncientAuthor author = null;
            try {
                author = authorDao.getAuthor(i);
                new AritcleSpider(author.getAuthorId(), author.getAuthorName(),
                        author.getAuthorDynastyId(), author.getAuthorDynastyName())
                        .parseUrl(author.getArticleUrl(), 1000);
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }
    }

    private Integer authorId;

    private String authorName;

    private Integer dynastyId;

    private String dynastyName;

    HashSet articles = new HashSet();

    public AritcleSpider(Integer authorId, String authorName, Integer dynastyId, String dynastyName) {
        this.authorId = authorId;
        this.authorName = authorName;
        this.dynastyId = dynastyId;
        this.dynastyName = dynastyName;
    }

    public  void parseUrl(String url, int count){
        System.setProperty("http.maxRedirects", "50");
        System.getProperties().setProperty("proxySet", "true");
        System.getProperties().put("https.proxyHost", "proxy.piccnet.com.cn");
        System.getProperties().put("https.proxyPort", "3128");//注意端口为String类型。
        String  agent="Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko)Chrome/56.0.2924.87 Safari/537.36" ;


        int counts = 0;
        for (int i = 0; i < count ; i++) {
            String tempUrl = url.replaceAll("A1.aspx", "A" + i +".aspx");
            try {
                if( -1 == parseHtml(Jsoup.connect(tempUrl).userAgent(agent).ignoreHttpErrors(true).timeout(3000).get())){
                    counts ++;
                }else{
                    counts /= 2;
                }
                if(counts > 5){
                    break;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public  int parseHtml(Document document){

        Elements articleNames = document.select("b");
        Elements articleContent = document.select("div.contson");
        Elements articleUrl = document.select("a[style]");
        Elements articleTag = document.select("div.tag");
        int count = 0;

        for (int j = 0; j < articleNames.size() - 1; j++) {
            if(articles.contains(articleNames.get(j).text())){
                count++;
                System.out.print("continue ");
                if(count > 4 || count > articles.size()){
                    System.out.println("break + author: + 1" + authorName);
                    return -1;
                }
                continue;
            }
            articles.add(articleNames.get(j).text());
            AncientArticle ancientArticle = new AncientArticle();
            ancientArticle.setArticleName(articleNames.get(j).text());
            ancientArticle.setArticleContent(articleContent.get(j).text());

            ancientArticle.setArticleUrl("https://so.gushiwen.org" + articleUrl.get(j + 3).attr("href"));
            ancientArticle.setAuthorId(authorId);
            ancientArticle.setAuthorName(authorName);
            ancientArticle.setDynastyName(dynastyName);
            ancientArticle.setDynastyId(dynastyId);
            if(articleTag.size() > j) {
                ancientArticle.setArticleTags(articleTag.get(j).text());
            }

            try {
                AritcleSpider.articleDao.insert(ancientArticle);
                writeToFile.writeDataToFile(ancientArticle.toString());
            }catch (Exception e){
                e.printStackTrace();
            }

        }
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println();
        return 0;
    }

}
