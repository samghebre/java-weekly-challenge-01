package com.codedifferently.day02Wednesday;
import java.io.*;
import java.util.*;

public class BasicStringUtils {
    /**
     * @param str string input from client
     * @return string with identical content, and the first character capitalized
     */
    public static String camelCase(String str) {
        int numberOfSpaces = 0;
        int lengthOfStr = str.length();
        char arrayOfCharacters[] = str.toCharArray();
        arrayOfCharacters[0] =  Character.toUpperCase(arrayOfCharacters[0]);

         for(int i = 0; i < lengthOfStr; i++) {
            if(arrayOfCharacters[i] == ' ') {
                numberOfSpaces++;
                arrayOfCharacters[i + 1] =  Character.toUpperCase(arrayOfCharacters[i + 1]);
            }
        }
        return String.valueOf(arrayOfCharacters, 0, lengthOfStr );

    }
    /**
     * @param str string input from client
     * @return string with identical contents, in the reverse order
     */
    public static String reverse(String str) {
        String[] stringArray= str.split(""); // split the string array
        for(int i = 0; i < str.length()/2; i++) {
            String temp = stringArray[i];
            stringArray[i] = stringArray[stringArray.length - i -1];
            stringArray[stringArray.length - i -1] = temp;

        }

        return String.join("",stringArray);

    }
    /**
     * @param str string input from client
     * @return string with identical contents, with each word individually in reverse order
     */
    public static String reverseWords(String str) {
        String stringArray[] = str.split(" ");
        int i = 0;
        String reversed = "";
        for (i =0; i < stringArray.length; i++) {
             reversed+= reverseAWord(stringArray[i]);
             reversed += " ";
        }

        return reversed.trim();
    }
    //create a helper method -> reverse a word
    public static String reverseAWord(String str){
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.reverse();
        return sb.toString();
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in reverse order, with first character capitalized
     */
    public static String reverseThenCamelCase(String str) {
        String reverseCamel = reverse(str);
        reverseCamel = camelCase(reverseCamel);

        return reverseCamel;
    }


    /**
     * @param str a string input from user
     * @return string with identical contents excluding first and last character
     */
    public static String removeFirstAndLastCharacter(String str) {
        str = str.substring(1, str.length() - 1);

        return str;
    }

    /**
     * @param str a string input from user
     * @return string with identical characters, each with opposite casing
     */
    public static String invertCasing(String str) {
        char[] ch = str.toCharArray(); // change string to character array first
        for (int i = 0; i < ch.length; i++) { // then loop through the chars
            char revert = ch[i];
            ch[i] = Character.isUpperCase(revert) ? Character.toLowerCase(revert) : Character.toUpperCase(revert);

            }
        return new String(ch);
        }

    }


