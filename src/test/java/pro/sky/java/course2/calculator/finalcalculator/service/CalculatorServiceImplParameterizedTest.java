package pro.sky.java.course2.calculator.finalcalculator.service;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static pro.sky.java.course2.calculator.finalcalculator.constants.CalculatorServiceImplTestConstants.*;

class CalculatorServiceImplParameterizedTest {
    private final CalculatorServiceImpl out = new CalculatorServiceImpl();

    @ParameterizedTest
    @MethodSource("provideParamsForTests")
    public void shouldCalculatorCountSumCorrect(double num1, double num2) {
        double result = out.countSum(num1, num2);
        assertEquals(num1 + num2, result);
    }

    @ParameterizedTest
    @MethodSource("provideParamsForTests")
    public void shouldCalculatorCountDifferenceCorrect(double num1, double num2) {
        double result = out.countDifference(num1, num2);
        assertEquals(num1 - num2, result);
    }

    @ParameterizedTest
    @MethodSource("provideParamsForTests")
    public void shouldCalculatorMultiplyCorrect(double num1, double num2) {
        double result = out.multiplyNumbers(num1, num2);
        assertEquals(num1 * num2, result);
    }

    @ParameterizedTest
    @MethodSource("provideParamsForTests")
    public void shouldCalculatorDivideCorrect(double num1, double num2) {
        double result = out.divideNumbers(num1, num2);
        assertEquals(num1 / num2, result);
    }

    public static Stream<Arguments> provideParamsForTests() {
        return Stream.of(
                Arguments.of(NUM_1, NUM_1),
                Arguments.of(NUM_2, NUM_2)
        );
    }
}