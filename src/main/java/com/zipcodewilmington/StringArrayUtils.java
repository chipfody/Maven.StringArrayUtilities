package com.zipcodewilmington;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import javax.naming.MalformedLinkException;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {

        String firstElement = array[0];

        return firstElement;
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {

        String secondElement = array[1];

        return secondElement;
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {

        int arraySize = array.length - 1;
        String lastElement = array[arraySize];

        return lastElement;
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {

        int arrayLength = array.length;
        String secondToLastElement = array[arrayLength - 2];
        return secondToLastElement;

    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {

        boolean isInArray = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                isInArray = true;
            }
        }
        return isInArray;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {

        String[] reverseArray = new String[array.length];
        int j = array.length;
        for (int i = 0; i < array.length; i++) {
            reverseArray[i] = array[j - 1];
            j--;
        }
        return reverseArray;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        String[] palindromeArray = reverse(array);
        boolean isPalindrome = false;

        for (int i = 1; i < array.length; i++) {
            isPalindrome = array[i].equals(palindromeArray[i]);

        }
        return isPalindrome;
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {

        String arrayString = Arrays.toString(array);
        String lcString = arrayString.toLowerCase();
        String alphaString = "abcdefghijklmnopqrstuvwxyz";
        int alphaCounter = 0;

        for (int i = 0; i< 26; i++) {
            for (int j = 0; j < lcString.length(); j++) {
                if (alphaString.substring(i, i + 1).equals(lcString.substring(j, j + 1))) {
                    alphaCounter++;
                    break;
                }
            }
        }
        return alphaCounter == 26;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int stringCount = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(value)) {
                stringCount++;
            }
        }
        return stringCount;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(valueToRemove)) {
                array[i] = null;
                break;
            }
        }

        String[] newArray = new String[array.length - 1];
        for (int j = 0; j < array.length; j++) {
            if (array[j] != null) {
                newArray[index] = array[j];
                index++;
            }
        }
        return newArray;
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {

        String temp = array[0];
        int nullCount = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i].equals(temp)) {
                array[i] = null;
                nullCount++;
            } else {
               temp = array[i];
            }
        }
        String[] lessConsecutive = new String[array.length - nullCount];
        int index = 0;
        for (int j = 0; j < array.length; j++) {
            if (array[j] != null) {
                lessConsecutive[index] = array[j];
                index++;
            }
        }
        return lessConsecutive;
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        int index = 0;
        String temp = array[0];
        String tempString = temp;
        String[] strArray = new String[array.length];

        for (int i = 1; i < array.length; i++) {
            if (array[i].equals(temp)) {
                tempString += temp;
            } else {
                strArray[index] = tempString;
                temp = array[i];
                tempString = temp;
                index++;
            }
            strArray[index] = tempString;


        }
        String[] finalArray = new String[index + 1];
        for (int j = 0; j < index + 1; j++) {
            finalArray[j] = strArray[j];}


        return finalArray;
    }

}
