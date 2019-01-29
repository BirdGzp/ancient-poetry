/*
Navicat MySQL Data Transfer

Source Server         : root
Source Server Version : 50717
Source Host           : 127.0.0.1:3306
Source Database       : ancient_poetry

Target Server Type    : MYSQL
Target Server Version : 50717
File Encoding         : 65001

Date: 2019-01-29 18:11:20
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `address`
-- ----------------------------
DROP TABLE IF EXISTS `address`;
CREATE TABLE `address` (
  `address_id` int(11) unsigned NOT NULL AUTO_INCREMENT COMMENT '主键',
  `parent_id` int(11) unsigned DEFAULT '0' COMMENT '父ID',
  `path` varchar(255) DEFAULT NULL COMMENT '路径',
  `level` int(11) unsigned DEFAULT NULL COMMENT '层级',
  `name` varchar(255) DEFAULT NULL COMMENT '中文名称',
  `name_en` varchar(255) DEFAULT NULL COMMENT '英文名称',
  `name_zh` varchar(255) DEFAULT NULL COMMENT '中文拼音',
  `code` varchar(50) DEFAULT NULL COMMENT '代码',
  `data_modify_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `data_create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `data_is_deleted` tinyint(1) NOT NULL,
  PRIMARY KEY (`address_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='全球地区库，采集自腾讯QQ国内+国际版.ADD.JENA.20141221';

-- ----------------------------
-- Records of address
-- ----------------------------

-- ----------------------------
-- Table structure for `ancient_article`
-- ----------------------------
DROP TABLE IF EXISTS `ancient_article`;
CREATE TABLE `ancient_article` (
  `article_id` int(10) NOT NULL AUTO_INCREMENT,
  `article_name` varchar(60) NOT NULL,
  `author_id` int(10) NOT NULL,
  `author_name` varchar(20) NOT NULL,
  `dynasty_id` int(5) DEFAULT NULL,
  `dynasty_name` varchar(10) DEFAULT NULL,
  `article_content` varchar(10000) NOT NULL,
  `article_tag_ids` varchar(127) DEFAULT NULL,
  `article_tags` varchar(255) DEFAULT NULL,
  `article_url` varchar(255) DEFAULT NULL,
  `likes` int(10) unsigned NOT NULL DEFAULT '0',
  `visit_count` int(10) unsigned NOT NULL DEFAULT '0',
  `data_create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `data_modify_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `data_is_deleted` tinyint(1) unsigned NOT NULL DEFAULT '0',
  PRIMARY KEY (`article_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of ancient_article
-- ----------------------------

-- ----------------------------
-- Table structure for `ancient_article_sentence`
-- ----------------------------
DROP TABLE IF EXISTS `ancient_article_sentence`;
CREATE TABLE `ancient_article_sentence` (
  `ancient_article_sentennce_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `ancient_article_sentence` varchar(10230) NOT NULL,
  `ancient_article_sentence_translate` varchar(10230) NOT NULL,
  `ancient_article_sentence_line` int(10) unsigned DEFAULT NULL,
  `ancient_article_id` int(10) DEFAULT NULL,
  `ancient_article_name` varchar(60) DEFAULT NULL,
  `author_id` int(10) unsigned NOT NULL DEFAULT '0',
  `author_name` varchar(20) NOT NULL DEFAULT '',
  `read_count` int(10) unsigned NOT NULL DEFAULT '0',
  `likes` int(10) unsigned NOT NULL DEFAULT '0',
  `data_create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `data_modify_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `data_is_deleted` tinyint(1) NOT NULL DEFAULT '0',
  PRIMARY KEY (`ancient_article_sentennce_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of ancient_article_sentence
-- ----------------------------

-- ----------------------------
-- Table structure for `ancient_author`
-- ----------------------------
DROP TABLE IF EXISTS `ancient_author`;
CREATE TABLE `ancient_author` (
  `author_id` int(10) unsigned NOT NULL AUTO_INCREMENT COMMENT '主键标识',
  `author_name` varchar(255) NOT NULL COMMENT '作者名称',
  `author_image` varchar(511) DEFAULT NULL COMMENT '图片',
  `author_article_count` int(5) unsigned NOT NULL DEFAULT '0' COMMENT '作品数量',
  `author_lifetime` varchar(50) DEFAULT '' COMMENT '作者生涯',
  `author_address` varchar(100) DEFAULT NULL COMMENT '作者祖籍',
  `author_character` varchar(20) DEFAULT NULL COMMENT '字为 什么',
  `author_fame` varchar(20) DEFAULT NULL COMMENT '名 为 什么',
  `author_call` varchar(40) DEFAULT NULL COMMENT '谥号 是什么 ',
  `author_alternative_name` varchar(20) DEFAULT NULL COMMENT '号 什么',
  `author_dynasty_id` int(11) unsigned DEFAULT NULL,
  `author_dynasty_name` varchar(255) DEFAULT NULL,
  `author_introduce` varchar(2550) DEFAULT NULL COMMENT '详细介绍',
  `article_url` varchar(255) DEFAULT NULL,
  `likes` int(10) unsigned NOT NULL DEFAULT '0' COMMENT '点赞数',
  `visit_count` int(10) unsigned NOT NULL DEFAULT '0' COMMENT '访问数',
  `data_create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '数据创建时间',
  `data_modify_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '数据修改时间',
  `data_is_deteled` tinyint(1) NOT NULL DEFAULT '0' COMMENT '数据是否被删除',
  PRIMARY KEY (`author_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of ancient_author
-- ----------------------------

-- ----------------------------
-- Table structure for `ancient_dynasty`
-- ----------------------------
DROP TABLE IF EXISTS `ancient_dynasty`;
CREATE TABLE `ancient_dynasty` (
  `dynasty_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `dynasty_en` varchar(255) NOT NULL COMMENT '英文名',
  `dynasty_zh` varchar(255) NOT NULL COMMENT '中文名',
  `data_create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `data_modify_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `data_is_deleted` tinyint(1) NOT NULL DEFAULT '0',
  PRIMARY KEY (`dynasty_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of ancient_dynasty
-- ----------------------------

-- ----------------------------
-- Table structure for `ancient_word`
-- ----------------------------
DROP TABLE IF EXISTS `ancient_word`;
CREATE TABLE `ancient_word` (
  `word_id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `word` varchar(10) NOT NULL,
  `data_create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `data_modify_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `data_is_deleted` tinyint(1) NOT NULL DEFAULT '0',
  PRIMARY KEY (`word_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of ancient_word
-- ----------------------------

-- ----------------------------
-- Table structure for `ancient_word_translate`
-- ----------------------------
DROP TABLE IF EXISTS `ancient_word_translate`;
CREATE TABLE `ancient_word_translate` (
  `article_word_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `word_id` int(10) NOT NULL,
  `word` varchar(10) NOT NULL,
  `word_translate` varchar(255) NOT NULL,
  `word_from_article_id` int(11) unsigned DEFAULT NULL,
  `word_from_article_name` varchar(255) DEFAULT NULL,
  `word_from_sentence_id` int(10) unsigned DEFAULT NULL,
  `word_from_sentence` varchar(255) DEFAULT NULL,
  `data_create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `data_modify_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `data_is_deleted` tinyint(1) unsigned NOT NULL DEFAULT '0',
  PRIMARY KEY (`article_word_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of ancient_word_translate
-- ----------------------------

-- ----------------------------
-- Table structure for `article`
-- ----------------------------
DROP TABLE IF EXISTS `article`;
CREATE TABLE `article` (
  `article_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `article_name` varchar(20) NOT NULL,
  `article_path` varchar(255) NOT NULL,
  `article_state` tinyint(5) unsigned NOT NULL,
  `floder_id` int(11) NOT NULL,
  `floder_name` varchar(20) NOT NULL,
  `author_id` int(11) NOT NULL,
  `author_name` varchar(20) NOT NULL,
  `article_type_id` int(11) NOT NULL,
  `article_type_name` varchar(20) NOT NULL,
  `article_tag_ids` varchar(50) DEFAULT NULL,
  `article_tags` varchar(255) DEFAULT NULL,
  `likes` int(10) unsigned NOT NULL DEFAULT '0',
  `visit_count` int(10) unsigned NOT NULL DEFAULT '0',
  `data_create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `data_modify_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `data_is_deleted` tinyint(1) unsigned NOT NULL DEFAULT '0',
  PRIMARY KEY (`article_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of article
-- ----------------------------

-- ----------------------------
-- Table structure for `article_floder`
-- ----------------------------
DROP TABLE IF EXISTS `article_floder`;
CREATE TABLE `article_floder` (
  `floder_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `floder_name` varchar(255) NOT NULL,
  `user_id` int(10) NOT NULL,
  `user_name` varchar(20) NOT NULL,
  `brief_introduce` varchar(255) DEFAULT NULL,
  `parent_floader_id` int(10) DEFAULT NULL,
  `parent_floder_name` varchar(255) DEFAULT NULL,
  `article_count` varchar(255) DEFAULT NULL,
  `likes` int(10) unsigned NOT NULL DEFAULT '0',
  `read_count` int(10) unsigned NOT NULL DEFAULT '0',
  `data_create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `data_modify_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `data_is_deleted` tinyint(1) unsigned NOT NULL DEFAULT '0',
  PRIMARY KEY (`floder_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of article_floder
-- ----------------------------

-- ----------------------------
-- Table structure for `article_tag`
-- ----------------------------
DROP TABLE IF EXISTS `article_tag`;
CREATE TABLE `article_tag` (
  `article_tag_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `article_tag_name` varchar(15) NOT NULL,
  `article_parent_tag_id` int(10) DEFAULT NULL,
  `article_parent_tag` varchar(15) DEFAULT NULL,
  `data_create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建者 id  0表示系统',
  `data_modify_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `data_is_deleted` tinyint(1) NOT NULL DEFAULT '0',
  PRIMARY KEY (`article_tag_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of article_tag
-- ----------------------------

-- ----------------------------
-- Table structure for `comment`
-- ----------------------------
DROP TABLE IF EXISTS `comment`;
CREATE TABLE `comment` (
  `comment_id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `comment_content` varchar(255) NOT NULL,
  `article_id` int(11) unsigned NOT NULL,
  `user_id` int(11) NOT NULL,
  `user_name` varchar(255) NOT NULL,
  `likes` int(11) unsigned NOT NULL DEFAULT '0',
  `parent_comment_id` int(11) DEFAULT NULL,
  `data_create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `data_modify_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `data_is_deleted` tinyint(1) NOT NULL DEFAULT '0',
  PRIMARY KEY (`comment_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of comment
-- ----------------------------

-- ----------------------------
-- Table structure for `history_time_line`
-- ----------------------------
DROP TABLE IF EXISTS `history_time_line`;
CREATE TABLE `history_time_line` (
  `event_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `event_title` varchar(50) NOT NULL,
  `event_of_type` tinyint(5) NOT NULL,
  `event_of_id` int(11) DEFAULT NULL,
  `event_of_name` varchar(255) DEFAULT NULL,
  `show_name` tinyint(1) unsigned NOT NULL DEFAULT '1',
  `upload_user_id` int(10) unsigned NOT NULL,
  `upload_user_name` varchar(20) NOT NULL,
  `event_content` varchar(10230) DEFAULT NULL,
  `data_create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `data_modify_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `data_is_deleted` tinyint(1) unsigned NOT NULL DEFAULT '0',
  PRIMARY KEY (`event_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of history_time_line
-- ----------------------------

-- ----------------------------
-- Table structure for `like`
-- ----------------------------
DROP TABLE IF EXISTS `like`;
CREATE TABLE `like` (
  `like_id` int(11) NOT NULL,
  `user_id` int(11) NOT NULL,
  `user_name` varchar(255) NOT NULL,
  `from_type` tinyint(4) unsigned NOT NULL,
  `from_id` int(10) unsigned NOT NULL,
  `data_create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `data_modify_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `data_is_deleted` tinyint(1) unsigned NOT NULL DEFAULT '0',
  PRIMARY KEY (`like_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of like
-- ----------------------------

-- ----------------------------
-- Table structure for `operation_history`
-- ----------------------------
DROP TABLE IF EXISTS `operation_history`;
CREATE TABLE `operation_history` (
  `operation_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `operation_user_id` int(10) unsigned NOT NULL,
  `article_id` int(10) unsigned NOT NULL,
  `operation_type` tinyint(5) NOT NULL,
  `data_create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `data_modify_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `data_is_deleted` tinyint(1) NOT NULL,
  PRIMARY KEY (`operation_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of operation_history
-- ----------------------------

-- ----------------------------
-- Table structure for `user_baisc`
-- ----------------------------
DROP TABLE IF EXISTS `user_baisc`;
CREATE TABLE `user_baisc` (
  `user_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `user_name` varchar(255) DEFAULT NULL,
  `pen_name` varchar(255) DEFAULT NULL,
  `user_character` varchar(255) DEFAULT NULL,
  `sex` tinyint(4) DEFAULT NULL,
  `birth_date` date DEFAULT NULL,
  `telephone` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `ip` varchar(255) DEFAULT NULL,
  `user_image` varchar(255) DEFAULT NULL,
  `likes` int(11) DEFAULT NULL,
  `read_count` int(11) DEFAULT NULL,
  `brief_introduce` varchar(255) DEFAULT NULL,
  `address_id` int(11) DEFAULT NULL,
  `detail_address` varchar(255) DEFAULT NULL,
  `last_login_time` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `data_create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `data_modify_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `data_is_deleted` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user_baisc
-- ----------------------------
INSERT INTO `user_baisc` VALUES ('1', null, null, null, null, null, '15797631631', null, 'ef20c44fb65029e42b45891f1877bd78', null, null, null, null, null, null, null, '2019-01-29 18:03:17', '2019-01-29 17:46:05', '2019-01-29 18:03:17', null);

-- ----------------------------
-- Table structure for `user_detail`
-- ----------------------------
DROP TABLE IF EXISTS `user_detail`;
CREATE TABLE `user_detail` (
  `user_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `writing_count` int(11) DEFAULT NULL,
  `follow_count` int(11) DEFAULT NULL,
  `follower_count` int(11) DEFAULT NULL,
  `user_fame` varchar(255) DEFAULT NULL,
  `user_call` varchar(255) DEFAULT NULL,
  `user_alternative_name` varchar(255) DEFAULT NULL,
  `favorite_author_id` int(11) DEFAULT NULL,
  `favorite_author_name` varchar(255) DEFAULT NULL,
  `favorite_article_id` int(11) DEFAULT NULL,
  `favorite_article_name` varchar(255) DEFAULT NULL,
  `data_create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `data_modify_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `data_is_deleted` tinyint(4) DEFAULT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user_detail
-- ----------------------------
