package com.moon.ancientpoetry.common.enums;

/**
 * @Author: zhipeng gong
 * @Date: 2018/12/12 15:14
 * @Description:
 */
public enum  LikeFromType {
    ARTICLE(1, "article"),
    COMMENT(2, "comment"),
    ANCIENT_ARTICLE(3, "ancient_article"),
    ANCIENT_AUTHOR(4, "ancient_author");



    private Integer id;
    private String fromType;

    LikeFromType(Integer id, String fromType) {
        this.id = id;
        this.fromType = fromType;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFromType() {
        return fromType;
    }

    public void setType(String fromType) {
        this.fromType = fromType;
    }

    public static int getIdByFromType(String fromType){
        switch (fromType) {
            case "article":
                return LikeFromType.ARTICLE.getId();
            case "comment":
                return LikeFromType.COMMENT.getId();
            case "ancient_article":
                return LikeFromType.ANCIENT_ARTICLE.getId();
            case "ancient_author":
                return LikeFromType.ANCIENT_AUTHOR.getId();
            default:
                return 0;
        }
    }
}
