
package com;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class Log
{
    @Around(value = "")
    public Object logger(ProceedingJoinPoint point)
        throws Throwable
    {
        System.out.println("I'm the logger of ");
        return point.proceed();
    }
}
