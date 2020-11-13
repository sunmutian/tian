package com.tian.my_code.test;

/**
 * 欢迎关注公众号：java后端技术全栈
 *
 * @author 田维常
 * @date 2020/11/12 19:30
 */
public class IntegerDemo {
    public static void main(String[] args) {
        Integer a = new Integer(128);
        Integer b = Integer.valueOf(128);
        Integer c = 128;
        System.out.println(a.equals(b));
        System.out.println(a.equals(c));
        System.out.println(b.equals(c));

        System.out.println(a == b);
        System.out.println(a == c);
        System.out.println(b == c);
    }
}
