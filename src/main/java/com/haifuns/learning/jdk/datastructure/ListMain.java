package com.haifuns.learning.jdk.datastructure;

import java.util.*;

/**
 * @author haifuns
 * @date 2022/6/6 22:16
 */
public class ListMain {

    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        arrayList.add("张三");
        arrayList.add("王五");
        arrayList.add(1, "赵六");
        arrayList.set(1, "王五");
        System.out.println(arrayList.get(1));
        arrayList.remove(1);

        List<String> linkedList = new LinkedList<>();
        linkedList.add("张三");
        linkedList.add("王五");
        linkedList.add(1, "赵六");
        linkedList.set(1, "王五");
        System.out.println(linkedList.get(1));
        linkedList.remove(1);

        Vector<String> vector = new Vector<>();
        vector.add("张三");
        vector.add("王五");
        System.out.println(vector.get(1));

        Stack<String> stack = new Stack<>();
        stack.push("张三");
        stack.push("李四");
        System.out.println(stack.pop());
    }
}
