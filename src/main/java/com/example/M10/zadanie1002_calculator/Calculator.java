package com.example.M10.zadanie1002_calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//W tym samym pakiecie utwórz klasę Calculator, która będzie komponentem Springa i będzie posiadała pole Display display
// . Użyj wstrzykiwania przez właściwość klasy do powiązania obiektów klas Calculator oraz Display ze sobą.
//Zaimplementuj cztery podstawowe działania matematyczne (zrób metody add(double a, double b), (double a, double b),
// mul(double a, double b) oraz div(double a, double b)) - obsługujące odpowiednio dodawanie, odejmowanie, mnożenie
// i dzielenie. Każda metoda powinna przed zwróceniem wyniku wywołać metodę displayValue(double val) obiektu display.
@Component
public class Calculator {

    @Autowired
    private Display display;
    //metoda add
    public double add(double a, double b ){
        double result = a + b;
        display.displayValue(result);
        return result;
    }

    //metoda sub(odejmowanie)
    public double sub(double a , double b ){
        double result = a - b;
        display.displayValue(result);
        return result;

    }
    //kolejna metoda mnozenie (mul)
    public double mul(double a , double b ){
        double result = a * b;
        display.displayValue(result);
        return result;
    }
    //kolejna 4 klasa div
    public double div(double a , double b ){
        double result = a / b;
        display.displayValue(result);
        return result;

    }
}
