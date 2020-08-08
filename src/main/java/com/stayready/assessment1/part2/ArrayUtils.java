package com.stayready.assessment1.part2;


import java.util.ArrayList;

/**
 * This one look maddd complicated
 */
public class ArrayUtils {

    /**
     * @param objectArray   an array of any type of Object
     * @param objectToCount any non-primitive value
     * @return the number of times the specified `value` occurs in the specified `objectArray`
     * Given an array of objects, named `objectArray`, and an object `objectToCount`, return the number of times the `objectToCount` appears in the `objectArray`
     */
    public static Integer getNumberOfOccurrences(Object[] objectArray, Object objectToCount) {
        Integer count = 0;
        for (Object obj : objectArray){
            if(obj.equals(objectToCount)){
                count++;
            }
        }
        return count;
    }

    /**
     * @param objectArray    an array of any type of Object
     * @param objectToRemove a value to be removed from the `objectArray`
     * @return an array with identical content excluding the specified `objectToRemove`
     * Given an array of objects, name `objectArray`, and an object `objectToRemove`, return an array of objects with identical contents excluding `objectToRemove`
     */
    public static Object[] removeValue(Object[] objectArray, Object objectToRemove) {
        Object[] result = new Object[objectArray.length];
        for(int idx = 0; idx < objectArray.length; idx++){
            if(objectArray[idx] != objectToRemove){  
                result[idx] = objectArray[idx];        
            }
        }
        return result;
    }

    /**
     * @param objectArray an array of any type of Object
     * @return the most frequently occurring object in the array
     * given an array of objects, named `objectArray` return the most frequently occuring object in the array
     */
    public static Object getMostCommon(Object[] objectArray) { // Oyyyy this one is tough, skipping for now
        /*
        Integer mostCommon;
        for(int idx = 0; idx < objectArray.length; idx++){

        }
        return mostCommon;
        */
        return null;
    }


    /**
     * @param objectArray an array of any type of Object
     * @return the least frequently occurring object in the array
     * given an array of objects, named `objectArray` return the least frequently occuring object in the array
     */
    public static Object getLeastCommon(Object[] objectArray) { // Same as above
        return null;
    }

    /**
     * @param objectArray      an array of any type of Object
     * @param objectArrayToAdd an array of Objects to add to the first argument
     * @return an array containing all elements in `objectArray` and `objectArrayToAdd`
     * given two arrays `objectArray` and `objectArrayToAdd`, return an array containing all elements in `objectArray` and `objectArrayToAdd`
     */
    public static Object[] mergeArrays(Object[] objectArray, Object[] objectArrayToAdd) { // Oyyyy this hurt me 
        Object[] mergedArr = new Object[objectArray.length + objectArrayToAdd.length];
        for(int idx = 0; idx < objectArray.length; idx++){
            mergedArr[idx] = objectArray[idx];
        } 
        int jdx = objectArray.length;
        for(int idx = 0; idx < objectArrayToAdd.length; idx++){
            mergedArr[jdx] = objectArray[idx];
            jdx++;
        }
        return mergedArr;
    }
}
