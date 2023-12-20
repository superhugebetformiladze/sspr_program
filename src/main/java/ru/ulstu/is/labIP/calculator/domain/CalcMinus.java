package ru.ulstu.is.labIP.calculator.domain;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CalcMinus implements Calc {
    private final Logger log = LoggerFactory.getLogger(CalcMinus.class);

    @Override
    public int action(int num1, int num2) {
        return num1 - num2;
    }

    public void init() {
        log.info("CalcMinus.init()");
    }

    public void destroy() {
        log.info("CalcMinus.destroy()");
    }
}
