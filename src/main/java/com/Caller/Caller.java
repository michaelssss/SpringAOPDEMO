/**
 * 文 件 名:  Caller.java
 * 版    权:  Huawei Technologies Co., Ltd. Copyright 2009-2011,  All rights reserved
 * 描    述:  <描述>
 * 创 建 人:  lWX364284
 * 创建时间:  2016-10-27
 */
package com.Caller;

import com.michaelssss.funcs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * <一句话功能简述>
 * <功能详细描述>
 *
 * @author lWX364284
 * @version [华为终端云统一账号模块, 2016-10-27]
 * @see [相关类/方法]
 */
@Component
public class Caller
{
    @Autowired
    private funcs funcs;

    public void call()
        throws Exception
    {
        Method[] methods = funcs.getClass().getDeclaredMethods();
        for (Method method : methods)
        {
            method.setAccessible(true);
            method.invoke(method);
        }
    }

}
