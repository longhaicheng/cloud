package com.example.cloudcore.exceptions.base;

/**
 * @author haicheng.long@androidmov.com
 * @ClassName BaseException
 * @Description 基础异常
 * @date 2020/12/4 下午 2:06
 */
public class BaseException extends RuntimeException {

    public BaseException(String message) {
        super(message);
    }

    public BaseException(String message, Throwable cause) {
        super(message, cause);
    }
}
