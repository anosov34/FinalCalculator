package pro.sky.java.course2.calculator.finalcalculator.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {

    public String welcome() {
        return "Please, choose the operation";
    }

    public String answerWelcome() {
        return "Welcome to the calculator";
    }

    public Object countSum(double num1, double num2) {
        String plus = " + ";
        String equal = " = ";
        return num1 + plus + num2 + equal + (num1 + num2);
    }

    public Object countDifference(double num1, double num2) {
        String minus = " - ";
        String equal = " = ";
        return num1 + minus + num2 + equal + (num1 - num2);
    }


    public Object multiplyNumbers(double num1, double num2) {
        String multiply = " * ";
        String equal = " = ";
        return num1 + multiply + num2 + equal + num1 * num2;
    }

    public Object divideNumbers(double num1, double num2) {
        String divide = " / ";
        String equal = " = ";
        if (num2 == 0) {
            return "Don't do this, bro";
        }
        return num1 + divide + num2 + equal + num1 / num2;
    }
}
