package com.hiagodev.course.entities.Enums;

public enum OrderStatus {
    WAITING_PAYMENT(1),
    PAID(2),
    SHPPED(3),
    DELIVERED(4),
    CANCELED(5);

    private int code;

    private OrderStatus(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public static OrderStatus valueOf(int code) {
        for (OrderStatus index : OrderStatus.values()) {
            if (code == index.getCode()) {
                return index;
            }
        }
        throw new IllegalArgumentException("Invalid OrderStatus code");
    }
}
