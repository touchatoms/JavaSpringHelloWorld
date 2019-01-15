package com.touchatoms.helloworld.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service(value= "calculationService")
public class CalculationService {

    HashMap<String, CalculationInterface> map = new HashMap<String, CalculationInterface>();

    public CalculationInterface get(String name) {
        return map.get(name);
    }

    @Autowired
    public CalculationService(List<CalculationInterface> list) {
        for (CalculationInterface item : list) {
            map.put(item.type(), item);
        }
    }
}
