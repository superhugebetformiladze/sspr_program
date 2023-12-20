package ru.ulstu.is.labIP.calculator.configuration;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.ulstu.is.labIP.calculator.domain.Calc;
import ru.ulstu.is.labIP.calculator.domain.CalcMinus;
import ru.ulstu.is.labIP.calculator.domain.CalcPlus;

@Configuration
public class CalcConfiguration {
    private final Logger log = LoggerFactory.getLogger(CalcConfiguration.class);

    @Bean(value = "minus", initMethod = "init", destroyMethod = "destroy")
    public CalcMinus createCalcMinus() {
        log.info("Call createCalcMinus()");
        return new CalcMinus();
    }

    @Bean(value = "plus")
    public Calc createCalcPlus() {
        log.info("Call createCalcPlus()");
        return new CalcPlus();
    }
}
