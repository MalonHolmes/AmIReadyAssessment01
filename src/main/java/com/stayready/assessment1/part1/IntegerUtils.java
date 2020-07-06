package com.stayready.assessment1.part1;


/**
 * OYYYYYYYYY!!! Did Tariq know he made this many classes??
 * He probably chilling right now smoking hookah lollllllll
 */
public class IntegerUtils {
    /**
     * @param n integer value input by client
     * @return the sum of all integers between 0 and not including `n`
     */
    public static Integer getSumOfN(Integer n) {
        Integer result = 0;
        for(int num = 1; num < n; num++){
            result += num;
        }
        return result;
    }

    /**
     * @param val integer value input by client
     * @return integer with identical digits in the reverse order
     */
    public static Integer reverseDigits(Integer val) {
        Integer result = 0;
        while (val != 0){
            result = result * 10; // To put the grabbed digits in the proper place
            result = result + val % 10; // To grab the next digit
            val /= 10; // To break down val all the way down to the ones place
        }
        return result;
    }

    /**
     * @param val integer value input by client
     * @return true if the integer is even and false if it is not even.
     */
    public static Boolean isEven(Integer val) {
        return val % 2 == 0 ? true : false; // using that FANCY ternary operator ayyeeeeeee
    }
}

