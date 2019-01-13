package com.onlineshoppingmall.common;

import com.onlineshoppingmall.util.PropertiesUtil;
import redis.clients.jedis.JedisPool;

public class RedisPool {
    private static JedisPool pool; //jedis连接池
    private static Integer maxTotal = Integer.parseInt(PropertiesUtil.getProperty("redis.max.total", "20")); //最大连接数
    private static Integer maxIdle = Integer.parseInt(PropertiesUtil.getProperty("redis.max.idle", "10")); //jedispool中，处于空闲状态的最大jedis实例个数
    private static Integer minIdle = Integer.parseInt(PropertiesUtil.getProperty("redis.min.idle", "2")); //jedispool中，处于空闲状态的最小jedis实例个数
    private static Boolean testOnBorrow = Boolean.parseBoolean(PropertiesUtil.getProperty("redis.test.borrow", "true")); //在borrow一个jedis实例时，是否要进行验证操作，如果赋值为True，则得到的jedis实例一定是可用的。
    private static Boolean testOnReturn = Boolean.parseBoolean(PropertiesUtil.getProperty("redis.test.return", "true")); //在return一个jedis实例时，是否要进行验证操作，如果赋值为True，则放回jedispool的jedis实例一定是可用的。
}