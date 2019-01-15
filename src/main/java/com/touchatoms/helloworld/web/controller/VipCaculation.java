package com.touchatoms.helloworld.web.controller;

import org.springframework.stereotype.Component;

@Component
public class VipCaculation implements CalculationInterface {

    public String type() {
        return "vip";
    }
    public double discount(double price) {

        return price * 0.7;
    }
}
