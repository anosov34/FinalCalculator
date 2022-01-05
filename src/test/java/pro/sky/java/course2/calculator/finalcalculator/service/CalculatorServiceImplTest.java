package pro.sky.java.course2.calculator.finalcalculator.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


import static pro.sky.java.course2.calculator.finalcalculator.constants.CalculatorServiceImplTestConstants.*;

class CalculatorServiceImplTest {
    private final CalculatorServiceImpl out = new CalculatorServiceImpl();

    @Test
     public void shouldCalculatorCountSumCorrect() {
        double result = out.countSum(NUM_1, NUM_2);
        Assertions.assertEquals(30, result);
    }
    @Test
    public void shouldCalculatorCountDifferenceCorrect() {
        double result = out.countDifference(NUM_1, NUM_2);
        Assertions.assertEquals(10, result);
    }

    @Test
    public void shouldCalculatorMultiplyCorrect() {
        double result = out.multiplyNumbers(NUM_1, NUM_2);
        Assertions.assertEquals(200, result);
    }

    @Test
    public void shouldCalculatorDivideCorrect() {
        double result = out.divideNumbers(NUM_1, NUM_2);
        Assertions.assertEquals(2, result);
    }
    @Test
    public void shouldThrowIllegalArgumentExceptionWhenDividesByZero() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> out.divideNumbers(NUM_1,ZERO));
    }
}