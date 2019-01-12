package com.moon.ancientpoetry.web.dto.convert;

import com.moon.ancientpoetry.common.po.UserBasic;
import com.moon.ancientpoetry.common.po.UserDetail;
import com.moon.ancientpoetry.web.dto.UserDto;

/**
 * @Author: zhipeng gong
 * @Date: 2019/1/11 17:03
 * @Description:
 */
public class UserDtoConvert {
    /**
     * 将 user basic 和 user detail 的信息组装成 userDto
     * @param userBasic
     * @param userDetail
     * @return
     */
    public static UserDto buildUserDto(UserBasic userBasic, UserDetail userDetail){
        UserDto userDto = new UserDto();

        // 用户基本信息里面的 18 个字段进行设值——除了 password
        userDto.setUserId(userBasic.getUserId());
        userDto.setPassword(userBasic.getPassword());
        userDto.setBirthDate(userBasic.getBirthDate());
        userDto.setAddressId(userBasic.getAddressId());
        userDto.setEmail(userBasic.getEmail());
        userDto.setFollowCount(userBasic.getFollowCount());
        userDto.setPenName(userBasic.getPenName());
        userDto.setUserName(userBasic.getUserName());
        userDto.setLikes(userBasic.getLikes());
        userDto.setFollowCount(userBasic.getFollowCount());
        userDto.setFollowerCount(userBasic.getFollowerCount());
        userDto.setUserCharacter(userBasic.getUserCharacter());
        userDto.setBriefIntroduce(userBasic.getBriefIntroduce());
        userDto.setDetailAddress(userBasic.getDetailAddress());
        userDto.setReadCount(userBasic.getReadCount());
        userDto.setWriteCount(userBasic.getWriteCount());
        userDto.setIp(userBasic.getIp());
        userDto.setUserImage(userBasic.getUserImage());

        // 用户详细信息的值设置
        userDto.setUserFame(userDetail.getUserFame());
        userDto.setUserCall(userDetail.getUserCall());
        userDto.setUserAlternativeName(userDetail.getUserAlternativeName());
        userDto.setFavoriteArticleId(userDetail.getFavoriteArticleId());
        userDto.setFavoriteArticleName(userDetail.getFavoriteArticleName());
        userDto.setFavoriteAuthorId(userDetail.getFavoriteAuthorId());
        userDto.setFavoriteAuthorName(userDetail.getFavoriteAuthorName());
        userDto.setFavoriteArticleId(userDetail.getFavoriteArticleId());
        return userDto;
    }
    
    public static UserBasic buildUserBaiscByUserDto(UserDto userDto){
        UserBasic userBasic = new UserBasic();
        userBasic.setUserId(userDto.getUserId());
        userBasic.setPassword(userDto.getPassword());
        userBasic.setBirthDate(userDto.getBirthDate());
        userBasic.setAddressId(userDto.getAddressId());
        userBasic.setEmail(userDto.getEmail());
        userBasic.setFollowCount(userDto.getFollowCount());
        userBasic.setPenName(userDto.getPenName());
        userBasic.setUserName(userDto.getUserName());
        userBasic.setLikes(userDto.getLikes());
        userBasic.setFollowCount(userDto.getFollowCount());
        userBasic.setFollowerCount(userDto.getFollowerCount());
        userBasic.setUserCharacter(userDto.getUserCharacter());
        userBasic.setBriefIntroduce(userDto.getBriefIntroduce());
        userBasic.setDetailAddress(userDto.getDetailAddress());
        userBasic.setReadCount(userDto.getReadCount());
        userBasic.setWriteCount(userDto.getWriteCount());
        userBasic.setIp(userDto.getIp());
        userBasic.setUserImage(userDto.getUserImage());

        return userBasic;
    }

    public static UserDetail buildUserDetailByUserDto(UserDto userDto){
        UserDetail userDetail = new UserDetail();
        // 用户详细信息的值设置
        userDetail.setUserId(userDetail.getUserId());
        userDetail.setUserFame(userDto.getUserFame());
        userDetail.setUserCall(userDto.getUserCall());
        userDetail.setUserAlternativeName(userDto.getUserAlternativeName());
        userDetail.setFavoriteArticleId(userDto.getFavoriteArticleId());
        userDetail.setFavoriteArticleName(userDto.getFavoriteArticleName());
        userDetail.setFavoriteAuthorId(userDto.getFavoriteAuthorId());
        userDetail.setFavoriteAuthorName(userDto.getFavoriteAuthorName());
        userDetail.setFavoriteArticleId(userDto.getFavoriteArticleId());
        return userDetail;
    }
}
