package pro.sky.calculatorwebapp.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    @Override
    public int sum(int number1, int number2) {
        return number1+number2;
    }

    @Override
    public int subtract(int number1, int number2) {
        return number1-number2;
    }

    @Override
    public int multiply(int number1, int number2) {
        return number1*number2;
    }

    @Override
    public int divide(int number1, int number2) {
        return number1/number2;
    }
}
