package ru.ulstu.is.labIP.calculator.domain;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class CalcPlus implements Calc, InitializingBean, DisposableBean {
    private final Logger log = LoggerFactory.getLogger(CalcPlus.class);

    @Override
    public int action(int num1, int num2) {
        return num1+num2;
    }

    @Override
    public void afterPropertiesSet() {
        log.info("CalcPlus.afterPropertiesSet()");
    }

    @Override
    public void destroy() {
        log.info("CalcPlus.destroy()");

    }
}
