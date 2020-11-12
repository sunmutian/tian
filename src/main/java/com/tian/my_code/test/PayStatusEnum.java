package com.tian.my_code.test;

/**
 * 欢迎关注公众号：java后端技术全栈
 *
 * @author 田维常
 * @date 2020/11/12 19:49
 */
public enum PayStatusEnum {
    DOING(0, "支付中"),
    SUCCESS(1, "支付成功"),
    FAIL(2, "支付失败"),
    ;

    private Integer status;
    private String describe;


    PayStatusEnum(Integer status, String describe) {
        this.status = status;
        this.describe = describe;
    }

    public Integer getStatus() {
        return status;
    }

    public String getDescribe() {
        return describe;
    }

    public static PayStatusEnum statusOf(Integer status) {
        for (PayStatusEnum payStatusEnum : values()) {
            if (payStatusEnum.status.equals(status)) {
                return payStatusEnum;
            }
        }
        return null;
    }
}
