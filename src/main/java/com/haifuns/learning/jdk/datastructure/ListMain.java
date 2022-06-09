package com.haifuns.learning.jdk.datastructure;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author haifuns
 * @date 2022/6/6 22:16
 */
public class ListMain {

    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        arrayList.add("张三");
        arrayList.add(2, "赵六");
        arrayList.set(1, "王五");
        System.out.println(arrayList.get(1));
        arrayList.remove(1);

        List<String> linkedList = new LinkedList<>();
        linkedList.add("张三");
        linkedList.add(2, "赵六");
        linkedList.set(1, "王五");
        System.out.println(linkedList.get(1));
        linkedList.remove(1);
    }
}
