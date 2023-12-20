package ru.ulstu.is.labIP.calculator.service;

import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;
import ru.ulstu.is.labIP.calculator.domain.Calc;

@Service
public class CalcService {
    private final ApplicationContext applicationContext;

    public CalcService(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }

    public int action(int num1, int num2, String act) {
        final Calc calc = (Calc) applicationContext.getBean(act);
        return calc.action(num1,num2);
    }
}
