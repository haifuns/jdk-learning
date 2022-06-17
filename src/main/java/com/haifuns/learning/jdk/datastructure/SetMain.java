package com.haifuns.learning.jdk.datastructure;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author haifuns
 * @date 2022/6/17 22:55
 */
public class SetMain {

    public static void main(String[] args) {
        // 底层是HashMap
        Set<String> hashSet = new HashSet<>();
        hashSet.add("张三");
        hashSet.add("李四");
        hashSet.add("王五");
        hashSet.add("张三");

        // 无序
        for (String s : hashSet) {
            System.out.println(s);
        }

        System.out.println("=======");

        Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("张三");
        linkedHashSet.add("李四");
        linkedHashSet.add("王五");
        linkedHashSet.add("张三");

        // 插入顺序
        for (String s : linkedHashSet) {
            System.out.println(s);
        }

        System.out.println("=======");

        Set<String> treeSet = new TreeSet<>();
        treeSet.add("张三");
        treeSet.add("李四");
        treeSet.add("王五");
        treeSet.add("张三");

        // key有序
        for (String s : treeSet) {
            System.out.println(s);
        }
     }
}
