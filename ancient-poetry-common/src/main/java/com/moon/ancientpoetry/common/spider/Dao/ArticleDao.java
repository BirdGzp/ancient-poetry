package com.moon.ancientpoetry.common.spider.Dao;

import com.moon.ancientpoetry.common.po.AncientArticle;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ArticleDao {
    Connection connection = SqlConn.getConn();

    public ArticleDao() throws SQLException, ClassNotFoundException {
    }

    public void insert(AncientArticle article) throws SQLException {
        String sql = "INSERT INTO `ancient_article`(article_name, author_id, author_name, " +
                "dynasty_id, dynasty_name, article_content,article_tags, article_url) " +
                "VALUES (?,?,?,?,?,?,?,?)";

        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, article.getArticleName());
        preparedStatement.setInt(2, article.getAuthorId());
        preparedStatement.setString(3, article.getAuthorName());
        preparedStatement.setInt(4, article.getDynastyId());
        preparedStatement.setString(5, article.getDyanstyName());
        preparedStatement.setString(6 ,article.getArticleContent());
        preparedStatement.setString(7, article.getArticleTags());
        preparedStatement.setString(8, article.getArticleUrl());

        preparedStatement.execute();

        preparedStatement.close();
    }

    public void close(){
        try {
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
