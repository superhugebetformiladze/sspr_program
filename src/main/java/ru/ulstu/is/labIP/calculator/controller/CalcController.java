package ru.ulstu.is.labIP.calculator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.ulstu.is.labIP.calculator.service.CalcService;

@RestController
public class CalcController {
    private final CalcService calcService;

    public CalcController(CalcService calcService) {
        this.calcService = calcService;
    }

    @GetMapping("/")
    public int calc(@RequestParam(value = "num1") int num1,
                    @RequestParam(value = "num2") int num2,
                    @RequestParam(value = "act", defaultValue = "mult") String act) {
        return calcService.action(num1, num2, act);
    }

}
