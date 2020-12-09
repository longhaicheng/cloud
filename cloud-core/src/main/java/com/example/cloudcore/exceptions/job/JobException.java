package com.example.cloudcore.exceptions.job;

import com.example.cloudcore.exceptions.base.BaseException;

/**
 * @author haicheng.long@androidmov.com
 * @ClassName JobException
 * @Description 定时任务异常
 * @date 2020/12/4 下午 2:08
 */
public class JobException extends BaseException {
    public JobException(String message) {
        super(message);
    }
}
