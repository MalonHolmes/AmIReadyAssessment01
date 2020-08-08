package com.stayready.assessment1.part2;

import com.stayready.assessment1.UnitTestingUtils;
import org.junit.Test;

/**
 * Created by Baron Von Rhino 07/01/2020.
 */
public class MultiplesDeleterTest {

    @Test
    public void deleteEvensTest() {
        // Given 
        Integer[] inputArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        Integer[] expected = { 1, 3, 5, 7, 9 };

        // When
        Integer[] actual = MultiplesDeleter.deleteEvens(inputArray);

        // Then
        UnitTestingUtils.assertArrayEquality(expected, actual);
    }

    @Test
    public void deleteOddsTest() {
        // Given 
        Integer[] inputArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        Integer[] expected = {  2, 4, 6, 8, 10 };

        // When
        Integer[] actual = MultiplesDeleter.deleteOdds(inputArray);

        // Then
        UnitTestingUtils.assertArrayEquality(expected, actual);
    }


    @Test
    public void deleteMultiplesOf3Test() {
        // Given 
        Integer[] inputArray = { 3, 6, 9, 12, 15, 4, 7, 10, 13, 16};
        Integer[] expected = {4, 7, 10, 13, 16};

        // When
        Integer[] actual = MultiplesDeleter.deleteMultiplesOf3(inputArray);

        // Then
        UnitTestingUtils.assertArrayEquality(expected, actual);
    }


    @Test
    public void deleteMultiplesOfNTest() {
        // Given
        Integer multiple = 6;
        Integer[] inputArray = { 6, 12, 18, 24, 30, 4, 7, 10, 13, 16};
        Integer[] expected = {4, 7, 10, 13, 16};

        // When
        Integer[] actual = MultiplesDeleter.deleteMultiplesOfN(inputArray, multiple);

        // Then
        UnitTestingUtils.assertArrayEquality(expected, actual);
    }

}
