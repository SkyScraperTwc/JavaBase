package indi.twc.test.thread;

import java.util.concurrent.ConcurrentHashMap;

/**
 * ConcurrentHashMap实现一个本地缓存
 */
public class ConcurrentHashMapTestCache {

    public static void main(String[] args) {
        LocalCache.putCache("twc","ppppp");
        System.out.println(LocalCache.getCacheValue("twc"));
    }
}

class LocalCache{
    /**线程安全的map*/
    private static ConcurrentHashMap<String,String> cacheMap = new ConcurrentHashMap<String, String>();

    /**
     * 添加缓存
     */
    public static void putCache(String id, String value) {
        String key = getCacheKey(id);
        cacheMap.put(key, value);
    }

    /**
     * 获取缓存
     */
    public static String getCacheValue(String id) {
        String key = getCacheKey(id);
        /**如果缓存中有该key，则返回value*/
        if(cacheMap.containsKey(key)){
            return cacheMap.get(key);
        }else{
            return null;
        }
    }

    /**
     * 构建缓存key
     */
    private static String getCacheKey(String id){
        return Thread.currentThread().getId()+"---"+id;
    }

    /**
     * 移除缓存
     */
    public static void removeCache(String id) {
        String key = getCacheKey(id);
        cacheMap.remove(key);
    }
}