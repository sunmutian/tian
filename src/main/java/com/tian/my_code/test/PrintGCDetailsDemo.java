package com.tian.my_code.test;

/**
 * 打印垃圾回收日志案例
 * 参数设置： -XX:+PrintGCDetails
 * @author 田维常
 * @version 1.0
 * @date 2020/11/9 8:22
 */
public class PrintGCDetailsDemo {
    public static void main(String[] args) {
        System.out.println("Xmx=" + Runtime.getRuntime().maxMemory() / 1024.0 / 1024 + "M");    //系统的最大空间
        System.out.println("free mem=" + Runtime.getRuntime().freeMemory() / 1024.0 / 1024 + "M");   //系统的空闲空间
        System.out.println("total mem=" + Runtime.getRuntime().totalMemory() / 1024.0 / 1024 + "M");   //当前可用的总空间
    }
}
