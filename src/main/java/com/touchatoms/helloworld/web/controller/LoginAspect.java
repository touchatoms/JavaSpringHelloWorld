package com.touchatoms.helloworld.web.controller;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoginAspect {
    @Before("execution(* com.touchatoms.helloworld.web.controller.Calculator.*(..)) && args(a, ..)")
    private void log(JoinPoint jp, int a) {
        System.out.println(jp.toString());
        System.out.println("Hello Aspect");
        System.out.println(a);
    }
}
