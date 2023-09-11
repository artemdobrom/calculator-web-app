package pro.sky.calculatorwebapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.calculatorwebapp.service.CalculatorService;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {

    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping
    public String showGreetings() {
        return "<b>Добро пожаловать в калькулятор</b>";
    }

    @GetMapping("/plus")
    public String sum(@RequestParam int number1, @RequestParam int number2) {
        int result = calculatorService.sum(number1, number2);
        return showResult(number1, number2, '+', result);
    }
    @GetMapping("/subtract")
    public String subtract(@RequestParam int number1, @RequestParam int number2) {
        int result = calculatorService.subtract(number1, number2);
        return showResult(number1, number2, '-', result);
    }
    @GetMapping("/multiply")
    public String multiply(@RequestParam int number1, @RequestParam int number2) {
        int result = calculatorService.multiply(number1, number2);
        return showResult(number1, number2, '*', result);
    }
    @GetMapping("/divide")
    public String divide(@RequestParam int number1, @RequestParam int number2) {
        int result = calculatorService.divide(number1, number2);
        return showResult(number1, number2, '/', result);
    }

    private String showResult(int number1, int number2, char action, int result) {
        return String.format("%d %c %d=%d", number1, action, number2, result);

    }
}

