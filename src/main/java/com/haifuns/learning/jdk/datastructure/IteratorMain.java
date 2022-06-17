package com.haifuns.learning.jdk.datastructure;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author haifuns
 * @date 2022/6/17 23:18
 */
public class IteratorMain {

    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        arrayList.add("张三");
        arrayList.add("王五");
        arrayList.add(1, "赵六");
        arrayList.set(1, "王五");

        // iterator多线程并发修改fail-fast机制

        Iterator<String> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
