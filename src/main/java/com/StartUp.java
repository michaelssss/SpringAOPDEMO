
package com;

import com.Caller.Caller;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StartUp
{
    public static void main(String[] args)
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        try
        {
            context.getBean(Caller.class).call();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
