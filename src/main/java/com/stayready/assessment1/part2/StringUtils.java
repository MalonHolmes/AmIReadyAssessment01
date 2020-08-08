package com.stayready.assessment1.part2;

import com.stayready.assessment1.part1.BasicStringUtils;

import java.util.ArrayList;
import java.util.Arrays;

public class StringUtils {

    /**
     * @param sentence a string containing words delimited by spaces, representative of a sentence
     * @return an array of strings, representative of each word in the sentence
     * given a string containing words delimited by spaces, representative of a sentence, return an array of strings, each element representative of a respective word in the sentence
     */
    public static String[] getWords(String sentence) {
        return sentence.split(" ");
    }

    /**
     * @param sentence a string containing words delimited by spaces, representative of a sentence
     * @return the first word in the specified sentence
     * given a string containing words delimited by spaces, representative of a sentence, return the first word of the sentence
     */
    public static String getFirstWord(String sentence) {
        String[] result = sentence.split(" ");
        return result[0];
    }

    /**
     * @param sentence a string containing words delimited by spaces, representative of a sentence
     * @return the specified sentence with the first word in reverse order
     * given a string containing words delimited by spaces, representative of a sentence, return the first word with identical contents in reverse order
     */
    public static String reverseFirstWord(String sentence) {
        String[] strArr = sentence.split(" ");
        String firstWord = BasicStringUtils.reverse(getFirstWord(sentence));
        strArr[0] = firstWord;
        String result = "";
        for (String word : strArr){
            result += word + " ";
        }
        return result.trim();
    }

    /**
     * @param sentence a string containing words delimited by spaces, representative of a sentence
     * @return the specified sentence with the first word capitalized and in reverse order
     * given a string containing words delimited by spaces, representative of a sentence, return the first word with identical contents in reverse order with the first character capitalized
     */
    public static String reverseFirstWordThenCamelCase(String sentence) {

        String[] words = sentence.toLowerCase().split(" ");
        System.out.println(words);


        return null;
    }

    /**
     * @param str string input from client
     * @param index the index of the character to be removed from `str`
     * @return string with identical contents, excluding the character at the specified index
     * given a string and index, return an identical string excluding the character at the specified index
     */
    public static String removeCharacterAtIndex(String str, int index) {
        ArrayList<Character> chars = new ArrayList<>();

        for (int i = 0; i < str.length(); i++)
        {
            chars.add(str.charAt(i));
        }
        chars.remove(index);
        String new_word = "";
        for(int i = 0; i < chars.size(); i++)
        {
            new_word = new_word + chars.get(i);
        }
        return new_word;
    }

}
