package com.haifuns.learning.jdk.datastructure;

import java.util.*;

/**
 * @author haifuns
 * @date 2022/6/13 8:11
 */
public class MapMain {

    public static void main(String[] args) {
        // 底层是数组+链表/红黑树
        Map<Integer,String> hashmap = new HashMap<>();

        hashmap.put(2, "李四");
        hashmap.put(1, "张三");
        hashmap.put(3, "王五");

        System.out.println(hashmap.get(2));
        // 无序
        for (Map.Entry<Integer, String> entry : hashmap.entrySet()) {
            System.out.println(entry.getKey());
        }

        // 相对hashmap额外用双向链表记录顺序
        Map<Integer,String> linkedHashMap = new LinkedHashMap<>();

        linkedHashMap.put(2, "李四");
        linkedHashMap.put(3, "王五");
        linkedHashMap.put(1, "张三");

        System.out.println(linkedHashMap.get(2));
        // 操作顺序
        for (Map.Entry<Integer, String> entry : linkedHashMap.entrySet()) {
            System.out.println(entry.getKey());
        }

        // 底层是红黑树
        Map<Integer,String> treeMap = new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });

        treeMap.put(3, "王五");
        treeMap.put(2, "李四");
        treeMap.put(1, "张三");

        System.out.println(treeMap.get(2));
        // key有序, key实现Comparator
        for (Map.Entry<Integer, String> entry : treeMap.entrySet()) {
            System.out.println(entry.getKey());
        }
    }
}
