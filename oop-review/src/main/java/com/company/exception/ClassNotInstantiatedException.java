package com.company.exception;

public class ClassNotInstantiatedException extends Exception {
    public ClassNotInstantiatedException(String message, Throwable cause){
        super(message, cause);
    }
}
