package com.tian.my_code.test;

public class JvmCodeDemo {
    public  Object testGC(){
        int op1 = 10;
        int op2 = 3;
        Object obj = new Object();
        Object result=obj;
        return result;
    }
}
