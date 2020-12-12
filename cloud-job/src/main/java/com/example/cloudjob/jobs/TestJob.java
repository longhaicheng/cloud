package com.example.cloudjob.jobs;

import com.xxl.job.core.biz.model.ReturnT;
import com.xxl.job.core.handler.IJobHandler;

/**
 * @author haicheng.long@androidmov.com
 * @ClassName TestJob
 * @Description TODO
 * @date 2020/12/12 下午 4:35
 */
public class TestJob extends IJobHandler {
    @Override
    public ReturnT<String> execute(String s) throws Exception {
        return null;
    }
}
