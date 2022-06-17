package com.haifuns.learning.jdk.datastructure;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author haifuns
 * @date 2022/6/13 8:11
 */
public class MapMain {

    public static void main(String[] args) {
        Map<Integer,String> hashmap = new HashMap<>();

        hashmap.put(2, "李四");
        hashmap.put(1, "张三");
        hashmap.put(3, "王五");

        System.out.println(hashmap.get(2));
        // 无序
        for (Map.Entry<Integer, String> entry : hashmap.entrySet()) {
            System.out.println(entry.getKey());
        }

        Map<Integer,String> linkedHashMap = new LinkedHashMap<>();

        linkedHashMap.put(2, "李四");
        linkedHashMap.put(3, "王五");
        linkedHashMap.put(1, "张三");

        System.out.println(linkedHashMap.get(2));
        // 有序
        for (Map.Entry<Integer, String> entry : linkedHashMap.entrySet()) {
            System.out.println(entry.getKey());
        }
    }
}
