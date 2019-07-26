package com.epam.calculator;

import org.apache.log4j.Logger;

public class Calculator {

    final static Logger logger = Logger.getLogger(Calculator.class);

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
        if (tw != 0) {
            return on / tw;
        } else {
            logger.error("Деление на ноль");
            throw (new IllegalArgumentException());
        }
    }

    public Number sqrt(double on) {
        if (on > 0) {
                return Math.sqrt(on);
        }
        logger.error("Деление на ноль");
        throw (new IllegalArgumentException());
    }
}
