package com.tian.my_code.test;

import java.util.HashMap;
import java.util.Map;

/**
 * 欢迎关注公众号：java后端技术全栈
 *
 * @author 田维常
 * @date 2020/11/12 19:49
 */
public enum PayStatusEnum2 {
    DOING(0,"支付中"),
    SUCCESS(1,"支付成功"),
    FAIL(2,"支付失败"),
    ;

    private Integer status;
    private String describe;

    private static Map<Integer, PayStatusEnum2> payStatusEnumMap = new HashMap<>();

    static {
        for (PayStatusEnum2 payStatusEnum : values()) {
            payStatusEnumMap.put(payStatusEnum.getStatus(), payStatusEnum);
        }
    }

    PayStatusEnum2(Integer status, String describe) {
        this.status = status;
        this.describe = describe;
    }

    public Integer getStatus() {
        return status;
    }

    public String getDescribe() {
        return describe;
    }

    public static PayStatusEnum2 statusOf(Integer status) {
        return payStatusEnumMap.get(status);
    }
}
