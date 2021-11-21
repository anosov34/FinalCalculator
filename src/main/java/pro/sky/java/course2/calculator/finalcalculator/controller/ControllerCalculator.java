package pro.sky.java.course2.calculator.finalcalculator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.java.course2.calculator.finalcalculator.service.CalculatorService;

@RestController
public class ControllerCalculator {
    public final CalculatorService calculatorService;

    public ControllerCalculator(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;

    }

    @GetMapping
    public String showWelcome() {
        return calculatorService.welcome();
    }

    @GetMapping(path = "/calculator")
    public String showAnswerWelcome() {
        return calculatorService.answerWelcome();
    }

    @GetMapping(path = "/calculator/plus")
    public Object showCountSum(@RequestParam double num1, double num2) {
        return calculatorService.countSum(num1, num2);
    }

    @GetMapping(path = "/calculator/minus")
    public Object showCountDifference(@RequestParam double num1, double num2) {
        return calculatorService.countDifference(num1, num2);
    }

    @GetMapping(path = "/calculator/multiply")
    public Object showMultiplyNumbers(@RequestParam double num1, double num2) {
        return calculatorService.multiplyNumbers(num1, num2);
    }
//    Сразу оговорюсь по поводу штуки ниже. Я пока с трудом представляю, что конкретно я сделал, но цель заключалась
//    в том, чтобы при делении на ноль передать пользователю, что так делать не нужно. Но поскольку и строку и дабл один
//    метод не принимает, мне идея подсказала вот эту штуку с Обджектом. Я ещё не до конца понимаю, что это всё значит,
//    но код работает и это греет мне сердце=)

    @GetMapping(path = "/calculator/divide")
    public Object showDivideNumbers(@RequestParam double num1, double num2) {
        return calculatorService.divideNumbers(num1, num2);

    }
}

