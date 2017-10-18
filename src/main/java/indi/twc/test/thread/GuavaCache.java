package indi.twc.test.thread;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;

public class GuavaCache {
    private static Map<String, Integer> map = new HashMap<String, Integer>();

    public static Integer getValueByKey(String key){
        System.out.println("通过key：" + key + "获取值");
        return map.get(key);
    }

    @Test
    public void loadingCache() throws ExecutionException {
        map.put("key1", 1);
        map.put("key2", 2);
        map.put("key3", 3);

        LoadingCache cahceBuilder = CacheBuilder.newBuilder().maximumSize(2).build(
                new CacheLoader<String, Integer>() {
                    @Override
                    public Integer load(String key) throws Exception {
                        return getValueByKey(key);
                    }
                });
        System.out.println(cahceBuilder.get("key1"));
        System.out.println(cahceBuilder.get("key2"));
        System.out.println(cahceBuilder.get("key3"));
        System.out.println(cahceBuilder.get("key1"));
        System.out.println(cahceBuilder.get("key3"));
        cahceBuilder.put("key1", 4);
        System.out.println(cahceBuilder.get("key1"));
    }
}
