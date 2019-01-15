package com.touchatoms.helloworld.web.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
        Calculator c  = context.getBean("calculator", Calculator.class);
        c.add(1, 2);

        CalculationService cs  = context.getBean("calculationService", CalculationService.class);
        System.out.println(cs.get("vip").discount(100.0));
        System.out.println(cs.get("normal").discount(100.0));
        System.out.println(cs.get("superVip").discount(100.0));
    }
}
