package pro.sky.java.course2.calculator.finalcalculator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.java.course2.calculator.finalcalculator.service.CalculatorService;

@RequestMapping("/calculator")
@RestController
public class ControllerCalculator {
    public final CalculatorService calculatorService;

    public ControllerCalculator(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;

    }

    @GetMapping
    public String answerWelcome() {
        return "Welcome to the calculator";
    }


    @GetMapping(path = "/plus")
    public String showCountSum(@RequestParam double num1, double num2) {
        return num1 + " + " + num2 + " = " + calculatorService.countSum(num1, num2);
    }

    @GetMapping(path = "/minus")
    public String showCountDifference(@RequestParam double num1, double num2) {
        return num1 + " - " + num2 + " = " + calculatorService.countDifference(num1, num2);
    }

    @GetMapping(path = "/multiply")
    public String showMultiplyNumbers(@RequestParam double num1, double num2) {
        return num1 + " * " + num2 + " = " + calculatorService.multiplyNumbers(num1, num2);
    }


    @GetMapping(path = "/divide")
    public String showDivideNumbers(@RequestParam double num1, double num2) {

        return num1 + " / " + num2 + " = " + calculatorService.divideNumbers(num1, num2);

    }
}


