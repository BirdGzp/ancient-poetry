package com.moon.ancientpoetry.common.cache;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.Cache;
import org.springframework.cache.caffeine.CaffeineCacheManager;
import org.springframework.cache.support.SimpleValueWrapper;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: zhipeng gong
 * @Date: 2018/12/14 19:50
 * @Description:
 */
@Component
public class CaffeineCacheUtils {

    // @Autowired
    // private CacheManager cacheManager;
    @Autowired
    private  CaffeineCacheManager caffeineCacheManager;


    // 添加本地缓存 (相同的key 会直接覆盖)
    public  void set(String cacheName, String key, Object value) {
        //caffeineCacheManager.setCacheNames(cacheName);
        Cache cache = caffeineCacheManager.getCache(cacheName);
        if(cache == null){
            List list = new ArrayList();
            list.add(cacheName);
            caffeineCacheManager.setCacheNames(list);
        }
        cache.put(key, value);
    }

    // 获取本地缓存
    public  String get(String cacheName, String key) {
        Cache cache = caffeineCacheManager.getCache(cacheName);
        if(cache == null){
            List list = new ArrayList();
            list.add("userCache");
            caffeineCacheManager.setCacheNames(list);
            return null;
        }
        System.out.println(cache);
        SimpleValueWrapper valueWrapper = (SimpleValueWrapper) cache.get(key);
        if(valueWrapper == null){
            return null;
        }
        return (String) valueWrapper.get();
    }

    /**
     * 使本地缓存失效
     * @param cacheName
     * @param key
     */
    public  void remove(String cacheName, String key) {
        Cache cache = caffeineCacheManager.getCache(cacheName);
        cache.evict(key);
    }

}