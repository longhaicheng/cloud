package com.example.cloudcore.exceptions.auth;

import com.example.cloudcore.exceptions.base.BaseException;

/**
 * @author haicheng.long@androidmov.com
 * @ClassName AuthException
 * @Description 认证异常
 * @date 2020/12/4 下午 2:09
 */
public class AuthException extends BaseException {
    public AuthException(String message) {
        super(message);
    }

    public AuthException(String message, Throwable cause) {
        super(message, cause);
    }
}
