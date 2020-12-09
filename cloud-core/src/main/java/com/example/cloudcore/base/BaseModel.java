package com.example.cloudcore.base;

import cn.hutool.json.JSONUtil;

/**
 * @author haicheng.long@androidmov.com
 * @ClassName BaseController
 * @Description TODO
 * @date 2020/12/4 下午 2:00
 */
public class BaseModel {

    @Override
    public String toString() {
        return JSONUtil.toJsonStr(this);
    }
}
