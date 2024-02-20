package com.haifuns.learning.jdk.thread;

/**
 * @author haifuns
 * @date 2024/2/20 22:27
 */
public class ThreadLocalMain {
    private static ThreadLocal<String> threadLocal = new ThreadLocal<>();

    public static void main(String[] args) {
        // 在主线程中设置值
        threadLocal.set("Main Thread Value");

        // 创建子线程
        Thread childThread = new Thread(() -> {
            // 子线程无法访问主线程设置的值
            System.out.println("Child Thread Value: " + threadLocal.get());
        });

        // 启动子线程
        childThread.start();

        try {
            // 等待子线程执行完成
            childThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // 主线程可以访问设置的值
        System.out.println("Main Thread Value: " + threadLocal.get());
    }
}
