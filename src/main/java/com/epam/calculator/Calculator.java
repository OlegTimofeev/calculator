package com.epam.calculator;

public class Calculator {


    public Number add(double on, double tw) {
            return on + tw;
    }

    public Number sub(double on, double tw) {
            return on - tw;
    }

    public Number mult(double on, double tw) {
            return on * tw;
    }

    public Number div(double on, double tw) {
        if (on != 0) {
            return on / tw;
        } else {
            throw (new IllegalArgumentException("Деление на ноль"));
        }
    }

    public Number sqrt(double on) {
        if (on > 0) {
                return Math.sqrt(on);
        }
        throw (new IllegalArgumentException("Корень из отрицательного числа"));
    }
}
