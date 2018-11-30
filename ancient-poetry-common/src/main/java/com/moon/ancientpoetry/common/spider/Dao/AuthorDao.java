package com.moon.ancientpoetry.common.spider.Dao;

import com.moon.ancientpoetry.common.po.Author;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AuthorDao {
    Connection connection = SqlConn.getConn();

    public AuthorDao() throws SQLException, ClassNotFoundException {
    }

    public void insert(Author author) throws SQLException {
        String sql = "INSERT INTO `ancient_author`(author_name, author_article_count, author_lifetime, " +
                "author_address, author_character, author_fame, author_call, author_alternative_name, author_dynasty_id, " +
                "author_dynasty_name, author_introduce, article_url) " +
                "VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";

        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, author.getAuthorName());
        preparedStatement.setInt(2, author.getAuthorAritcleCount());
        preparedStatement.setString(3, author.getAuthorLifetime());
        preparedStatement.setString(4, author.getAuthorAddress());
        preparedStatement.setString(5, author.getAuthorCharacter());
        preparedStatement.setString(6 ,author.getAuthorFame());
        preparedStatement.setString(7, author.getAuthorCall());
        preparedStatement.setString(8, author.getAuthorAlternativeName());
        preparedStatement.setInt(9, author.getAuthorDynastyId());
        preparedStatement.setString(10, author.getAuthorDynstyName());
        preparedStatement.setString(11,author.getAuthorIntroduce());
        preparedStatement.setString(12, author.getArticleUrl());

        System.out.println(preparedStatement.toString());
        preparedStatement.execute();
    }

    public Author getAuthor(int id) throws SQLException {
        String sql = "select * from ancient_author where author_id='" + id + "'";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        ResultSet resultSet = preparedStatement.executeQuery();
        resultSet.next();
        Author author = new Author();
        author.setAuthorId(resultSet.getInt(1));
        author.setAuthorName(resultSet.getString(2));
        author.setAuthorAritcleCount(resultSet.getInt(4));
        author.setAuthorDynastyId(resultSet.getInt(11));
        author.setAuthorDynstyName(resultSet.getString(12));
        author.setArticleUrl(resultSet.getString(14));

        preparedStatement.close();
        return author;
    }

    public void close(){
        try {
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
