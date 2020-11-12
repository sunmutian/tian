package com.tian.my_code.test;

/**
 * 欢迎关注公众号：java后端技术全栈
 *
 * @author 田维常
 * @date 2020/11/12 20:01
 */
public class Client {
    public static void main(String[] args) {
        Integer payStatus = new Integer(1);
        PayStatusEnum payStatusEnum = PayStatusEnum.statusOf(payStatus);
        if (payStatusEnum != null) {
            System.out.println("支付状态：" + payStatusEnum.getDescribe());
        } else {
            System.out.println("支付状态异常");
        }
    }
}
