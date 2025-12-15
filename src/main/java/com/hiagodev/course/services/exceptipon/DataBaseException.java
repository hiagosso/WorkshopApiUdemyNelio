package com.hiagodev.course.services.exceptipon;

public class DataBaseException extends RuntimeException {
    public DataBaseException(String message) {
        super(message);
    }
}
