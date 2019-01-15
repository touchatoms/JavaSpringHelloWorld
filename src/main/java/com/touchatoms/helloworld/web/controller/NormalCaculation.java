package com.touchatoms.helloworld.web.controller;

import org.springframework.stereotype.Component;

@Component
public class NormalCaculation implements CalculationInterface {

    public String name = "normal";

    public double discount(double price) {
        return price * 0.99;
    }

    public String type() {
        return "normal";
    }
}
