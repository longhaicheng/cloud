package com.example.cloudcore.exceptions.system;

import com.example.cloudcore.exceptions.base.BaseException;

/**
 * @author haicheng.long@androidmov.com
 * @ClassName SystemException
 * @Description 业务异常
 * @date 2020/12/4 下午 2:07
 */
public class SystemException extends BaseException {
    public SystemException(String message) {
        super(message);
    }

    public SystemException(String message, Throwable cause) {
        super(message, cause);
    }
}
