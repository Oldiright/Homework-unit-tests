package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SumCalculatorTest {
    private SumCalculator calculator;
    @BeforeEach
    public void beforeEarch() {
        calculator = new SumCalculator();
    }

    @Test
    public void TestThatSumWorksCorrectWithOne() {

        //When
        int firstActualSum = calculator.sum(1);
        int secondActualSum = calculator.sum(3);

        //Then
        Assertions.assertEquals(1, firstActualSum);

    }

    @Test
    public void TestThatSumWorksCorrectWithThree() {

        //When
        int secondActualSum = calculator.sum(3);

        //Then
        Assertions.assertEquals(6, secondActualSum);
    }

    @Test
    void TestThatSumWorksCorrectWithZero()  {

        IllegalArgumentException thrown = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            calculator.sum(0);
        }, "You tried to enter zero!");

        Assertions.assertEquals("You tried to enter zero!", thrown.getMessage());
    }


}
