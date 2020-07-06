package com.stayready.assessment1.part1;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Baron Von Rhino 07/01/2020.
 */
public class IntegerArrayUtilsTest {
    @Test
    public void getSumTest() {
        // : Given
        Integer[] input = { 1, 2, 3, 4, 5};
        Integer expected = 15;

        // : When
        Integer actual = IntegerArrayUtils.getSum(input);

        // : Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getProductTest() {
        // : Given
        Integer[] input = { 1, 2, 3, 4, 5};
        Integer expected = 120;

        // : When
        Integer actual = IntegerArrayUtils.getProduct(input);

        // : Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getAverageTest() {
        // : Given
        Integer[] input = { 1, 2, 3, 4, 5};
        Double expected = 3.0;

        // : When
        Double actual = IntegerArrayUtils.getAverage(input);

        // : Then
        Assert.assertEquals(expected, actual, 0.01);
    }

    @Test
    public void getLargest() {
        // : Given
        Integer[] input = { 1, 2, 3, 4, 5};
        Integer expected = 5;

        // : When
        Integer actual = IntegerArrayUtils.getLargest(input);

        // : Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getLargestTest2() {
        // : Given
        Integer[] input = {2};
        Integer expected = 2;

        // : When
        Integer actual = IntegerArrayUtils.getLargest(input);

        // : Then
        Assert.assertEquals(expected, actual);
    }

}
