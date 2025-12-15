package com.hiagodev.course.services.exceptipon;

public class ResourceNotFoundException extends RuntimeException {
    public ResourceNotFoundException(Object id) {
        super("Resource not found. id " + id);
    }
}
