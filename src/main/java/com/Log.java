
package com;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Log
{
    @Around(value = "execution(* com.michaelssss.*.*(..))")
    public void logger(ProceedingJoinPoint point)
        throws Throwable
    {
        System.out.println("I'm the logger of " + point.getSignature().getName());
        point.proceed();
    }
}
