package com.tian.my_code.test;

import java.util.ArrayList;
import java.util.List;

/**
 * TODO
 *
 * @author 田维常
 * @version 1.0
 * @date 2020/11/10 7:29
 */
public class JhatTest {
    static List<String> list = new ArrayList<>();

    public static void main(String[] args) {
        while (true) {
            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            list.add("11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
        }
    }
}
