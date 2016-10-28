package com.michaelssss;

import com.Funcs;
import org.springframework.stereotype.Component;

@Component
public class FuncsImpl implements Funcs
{
    private void A()
    {
        System.out.println("this is A");
    }

    protected void B()
    {
        System.out.println("this is B");
    }

    public void C()
    {
        System.out.println("this is C");
    }
}
