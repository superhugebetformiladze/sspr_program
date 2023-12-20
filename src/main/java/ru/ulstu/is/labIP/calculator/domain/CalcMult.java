package ru.ulstu.is.labIP.calculator.domain;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component(value = "mult")
public class CalcMult implements Calc{
    private final Logger log = LoggerFactory.getLogger(CalcMult.class);

    @Override
    public int action(int num1, int num2) {
        return num1*num2;
    }

    @PostConstruct
    public void init() {
        log.info("CalcMult.init()");
    }

    @PreDestroy
    public void destroy() {
        log.info("CalcMult.destroy()");
    }
}
