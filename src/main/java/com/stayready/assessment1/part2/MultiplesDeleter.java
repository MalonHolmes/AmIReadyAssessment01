package com.stayready.assessment1.part2;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class MultiplesDeleter {
    /**
     * @param ints array of Integer objects
     * @return all ints which are not divisible by 2
     * given an array of integers, named `ints` return an identical array with evens removed
     */
    public static Integer[] deleteEvens(Integer[] ints) {

        /*
        ArrayList<Integer> result = new ArrayList<>();

        for (int idx = 0; idx < ints.length; idx++){
            if (ints[idx] % 2 == 1){
                result.add(ints[idx]);
            }
        }
        Integer[] arr = (Integer[]) result.toArray();
        Integer[] arr2 = Arrays.copyOf(arr);
        //System.out.println(arr);
        return arr2;
        */
        return null;
    }

    /**
     * @param ints array of Integer objects
     * @return all ints which are divisible by 2
     * given an array of integers, named `ints` return an identical array with odds removed
     */
    public static Integer[] deleteOdds(Integer[] ints) {

        /*
        ArrayList<Integer> result = new ArrayList<>();
        for (int idx = 0; idx < ints.length; idx++){
            if (ints[idx] % 2 == 0){
                result.add(ints[idx]);
            }
        }
        Integer[] arr = (Integer[]) result.toArray();
        return arr;
        */
        return null;
    }

    /**
     * @param ints array of Integer objects
     * @return all ints which are not divisible by 3
     * given an array of integers, named `ints` return an identical array with numbers indivisible by 3 removed
     */
    public static Integer[] deleteMultiplesOf3(Integer[] ints) {
        return null;
    }

    /**
     * @param ints array of Integer objects
     * @param multiple the multiple to evaluate divisibility against
     * @return all ints which are not divisible by the `multiple` specified
     * given an array of integers, named `ints` return an identical array with numbers indivisible by `multiple` removed
     */
    public static Integer[] deleteMultiplesOfN(Integer[] ints, int multiple) {
        return null;
    }
}
