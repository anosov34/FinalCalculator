package pro.sky.java.course2.calculator.finalcalculator.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {

    public double countSum(double num1, double num2) {
        return num1 + num2;
    }

    public double countDifference(double num1, double num2) {
        return num1 - num2;
    }

    public double multiplyNumbers(double num1, double num2) {
        return num1 * num2;
    }

    public double divideNumbers(double num1, double num2) {
        return num1 / num2;
    }
}
