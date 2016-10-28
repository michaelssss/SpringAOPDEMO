
package com.Caller;

import com.Funcs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

@Component
public class Caller
{
    @Autowired
    private Funcs funcs;

    public void call()
        throws Exception
    {

        Method method = funcs.getClass().getMethod("C");
        method.invoke(funcs);
        //this will throw a Error 
        
        Method B = funcs.getClass().getMethod("B");
        B.setAccessible(true);
        B.invoke(funcs);
    }

}
