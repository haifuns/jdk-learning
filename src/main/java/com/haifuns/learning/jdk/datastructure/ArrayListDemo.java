package com.haifuns.learning.jdk.datastructure;

import java.util.ArrayList;
import java.util.List;

/**
 * @author haifuns
 * @date 2022/6/6 22:16
 */
public class ArrayListDemo {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("张三");
        list.add("李四");
        list.set(1, "王五");

        System.out.println(list.get(1));

        list.add(2, "赵六");
        list.remove(1);
    }
}
