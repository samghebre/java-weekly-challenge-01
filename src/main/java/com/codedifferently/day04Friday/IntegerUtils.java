package com.codedifferently.day04Friday;

public class IntegerUtils {
    /**
     * @param n integer value input by client
     * @return the sum of all integers between 0 and not including `n`
     */
    public static Integer getSumOfN(Integer n) {
        Integer n1 = n;
        Integer n2 = n;
        Integer sum = 0;
        sum = n1 + n2;
        return sum;
    }

    /**
     * @param val integer value input by client
     * @return integer with identical digits in the reverse order
     */
    public static Integer reverseDigits(Integer val) {
        Integer reversedNum = 0;
        while (val > 0) {
            reversedNum = reversedNum * 10 + val % 10;
            val = val / 10;
        }
        return reversedNum;
    }

    /**
     * @param val integer value input by client
     * @return true if the integer is even and false if it is not even.
     */
    public static Boolean isEven(Integer val) {
        boolean value = true;
        if (val % 2 == 0) {
            value = true;
        } else {
            value = false;
        }
        return value;
    }
}
