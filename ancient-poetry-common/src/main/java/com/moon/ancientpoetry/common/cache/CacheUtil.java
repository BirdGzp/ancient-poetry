package com.moon.ancientpoetry.common.cache;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Author: zhipeng gong
 * @Date: 2018/12/15 15:07
 * @Description:
 */
public class CacheUtil {

    @Autowired
    private static CaffeineCacheUtils caffeineCacheUtils;

    @Autowired
    private static RedisCacheUtil redisCacheUtil;

    /**
     * redis 默认过期时长
     */
    public static final long REDIS_DEFAULT_EXPIRE = 60 * 60 * 10;

    /**
     * 不设置过期时长
     */
    public static final long NOT_EXPIRE = -1;

    /**
     * 先查询本地缓存，然后查询 redis 缓存
     * @param cacheType
     * @param key
     * @return
     */
    public static String get(String cacheType, String key){
        String result =  caffeineCacheUtils.get(cacheType, key);
        System.out.println("本地缓存: " + result);
        if(null == result){
            result = redisCacheUtil.getString(key);
            System.out.println("分布式缓存: " + result);

            //如果查询结果成功， 将结果存入本地缓存
            if(result != null){
                caffeineCacheUtils.set(cacheType, key, result);
            }
        }
        return  result;

    }

    /**
     * 设置 缓存  默认时间
     * @param cacheType
     * @param key
     * @param value
     * @return
     */
    public static int setWithDefaultTime(String cacheType, String key, String value){
        try {
            caffeineCacheUtils.set(cacheType, key, value);
            redisCacheUtil.set(key, value, REDIS_DEFAULT_EXPIRE);
        }catch (Exception exception){
            exception.printStackTrace();
            return 0;
        }
        return 1;
    }

    /**
     * 设置 缓存
     * @param cacheType
     * @param key
     * @param value
     * @return
     */
    public static int setWithTime(String cacheType, String key, String value, long time){
        try {
            caffeineCacheUtils.set(cacheType, key, value);
            redisCacheUtil.set(key, value, time);
        }catch (Exception e){
            e.printStackTrace();
            return 0;
        }
        return 1;
    }

    /**
     * 删除 缓存
     * @param cacheType
     * @param key
     * @return
     */
    public static int remove(String cacheType, String key){
        try {
            caffeineCacheUtils.remove(cacheType, key);
            redisCacheUtil.remove(key);
        }catch (Exception e){
            e.printStackTrace();
            return 0;
        }
        return 1;
    }



    public static String keyGenerator(String domainName, String keyName, String key){
        return new StringBuilder(domainName).append("_").append(key).append("_")
                .append(key).toString();
    }
}
