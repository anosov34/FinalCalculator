package pro.sky.java.course2.calculator.finalcalculator.service;

public interface CalculatorService {
    String welcome();
    String answerWelcome();
    Object countSum(double num1, double num2);
    Object countDifference(double num1, double num2);
    Object multiplyNumbers(double num1, double num2);
    Object divideNumbers(double num1, double num2);
}
