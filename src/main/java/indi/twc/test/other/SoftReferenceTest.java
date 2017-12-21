package indi.twc.test.other;

import java.lang.ref.SoftReference;
import java.util.HashMap;

/**
 * Created by Administrator on 2017/6/5 0005.
 */
public class SoftReferenceTest {
    public static void main(String[] args) {
        HashMap<SoftReference<Integer>, byte[]> hashMap = new HashMap<>();
        for (int i = 0; i < 1000000; i++) {
            Integer integer = new Integer(i);
            SoftReference<Integer> sr = new SoftReference<>(integer);
            hashMap.put(sr, new byte[i]);
            System.out.println(hashMap.size());
        } 
    }
}