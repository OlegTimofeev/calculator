package com.epam.calculator;

public class Calculator<T1 extends Number, T2 extends Number> {


    public Number add(T1 on, T2 tw) {
        if (Math.floor(on.doubleValue() + tw.doubleValue()) == on.doubleValue() + tw.doubleValue()) {
            return (int) Math.floor(on.doubleValue() + tw.doubleValue());
        } else {
            return on.doubleValue() + tw.doubleValue();
        }
    }

    public Number sub(T1 on, T2 tw) {
        if(Math.floor(on.doubleValue() - tw.doubleValue()) == on.doubleValue() - tw.doubleValue()) {
            return (int) Math.floor(on.doubleValue() - tw.doubleValue());
        }else{
            return on.doubleValue() - tw.doubleValue();
        }
    }

    public Number mult(T1 on, T2 tw) {
        if (on.getClass().equals(Integer.class) && tw.getClass().equals(Integer.class)) {
            return on.intValue() * tw.intValue();
        } else {
            double a = on.doubleValue() * tw.doubleValue();
            if (Math.floor(a) != a) {
                return on.doubleValue() * tw.doubleValue();
            } else {
                return (int) Math.round(a);
            }
        }
    }

    public Number div(T1 on, T2 tw) {
        if (on.intValue() != 0) {
            if (on.getClass().equals(Integer.class) && tw.getClass().equals(Integer.class)) {
                int a = on.intValue() / tw.intValue();
                double b = on.doubleValue() / tw.doubleValue();
                if ((double) a == b) {
                    return a;
                } else {
                    return b;
                }
            } else {
                return on.doubleValue() / tw.doubleValue();
            }
        } else {
            throw (new IllegalArgumentException("Деление на ноль"));
        }
    }

    public Number sqrt(T1 on) {
        if (on.intValue() > 0) {
            double d = Math.sqrt(on.doubleValue());
            if (Math.floor(d) != d) {
                return (double) Math.round(d * 10000) / 10000;
            }
            return (int) Math.round(d);
        }
        throw (new IllegalArgumentException("Корень из отрицательного числа"));
    }
}
