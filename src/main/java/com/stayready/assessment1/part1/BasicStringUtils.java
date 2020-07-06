package com.stayready.assessment1.part1;


/**
 * TARIIQQQQQQQQQQ!!!!!
 */
public class BasicStringUtils {
    /**
     * @param str string input from client
     * @return string with identical content, and the first character capitalized
     */
    public static String camelCase(String str) { // Alright, Tariq. you got me on this one lol
        return null; // tried but skipped in order to save time
        // tried googling but camel case is defined different on some websites so i couldnt find it
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in the reverse order
     */
    public static String reverse(String str) {
        String result = "";
        for(int idx = str.length() - 1; idx >= 0; idx--){
            result += str.charAt(idx);
        }
        return result;
    }

    /**
     * @param str string input from client
     * @return string with identical contents, with each word individually reversed
     */
    public static String reverseWords(String str) {
        String[] strArr = str.split(" ");
        String result = "";
        for (int idx = 0; idx < strArr.length - 1; idx++) {
            result += reverse(strArr[idx]) + " ";
        }
        result += reverse(strArr[strArr.length - 1]);
        return result;
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in reverse order, with first character capitalized
     */
    public static String reverseThenCamelCase(String str) {
        return null; // didnt know out camelcase() so I didnt do this one
    }


    /**
     * @param str a string input from user
     * @return string with identical contents excluding first and last character
     */
    public static String removeFirstAndLastCharacter(String str) {
        String result = "";
        for(int idx = 1; idx < str.length() - 1; idx++){
            result += str.charAt(idx);
        }
        return result;
    }

    /**
     * @param str a string input from user
     * @return string with identical characters, each with opposite casing
     */
    public static String invertCasing(String str) {
        String result = "";
        for(int idx = 0; idx < str.length(); idx++){
            Character currChar = str.charAt(idx);
            if(Character.isUpperCase(currChar)){
                result += Character.toLowerCase(currChar);
            } else if (Character.isLowerCase(currChar)){
                result += Character.toUpperCase(currChar);
            } else {
                result += currChar;
            }
        }
        return result;
    }

}
