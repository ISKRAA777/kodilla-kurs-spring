package com.example.M10.zadanie1002_calculator;

import org.springframework.stereotype.Component;

//spring_tylko jedna poniższa linia
@Component
public class Display {
    public void displayValue(double val){
        System.out.println(val);
    }
}
