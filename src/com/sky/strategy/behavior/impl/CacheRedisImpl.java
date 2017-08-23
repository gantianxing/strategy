package com.sky.strategy.behavior.impl;

import com.sky.strategy.behavior.CacheBehavior;

/**
 * Created by gantianxing on 2017/8/23.
 */
public class CacheRedisImpl implements CacheBehavior {

    @Override
    public void handerCache(String key,String content,String cdnUrl) {

        //redis.set(key,content)
        System.out.println("第一步：采用redis缓存"+key);

        //cdn.clear(cdnUrl)
        System.out.println("第二步：清除cdn缓存"+cdnUrl);
    }
}
