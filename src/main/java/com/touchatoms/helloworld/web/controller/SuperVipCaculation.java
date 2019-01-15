package com.touchatoms.helloworld.web.controller;

import org.springframework.stereotype.Component;

@Component
public class SuperVipCaculation implements CalculationInterface {

    public String type() {
        return "superVip";
    }
    public double discount(double price) {

        return price * 0.5;
    }
}
