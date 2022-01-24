package com.leetcode;

import java.util.HashMap;

public class RomanToInteger {

    public static void main(String[] args) {
        System.out.println(romanToInt("XCCDCM"));

    }

    public static int romanToInt(String s) {
        int result = 0, num1 = 0, num2 = 0;
        char[] ca = s.toCharArray();

        HashMap<Character, Integer> hm = new HashMap<>();
        hm.put('I', 1);
        hm.put('V', 5);
        hm.put('X', 10);
        hm.put('L', 50);
        hm.put('C', 100);
        hm.put('D', 500);
        hm.put('M', 1000);

        for (int i = 0; i < s.length(); i++) {
            num1 = hm.get(ca[i]);
            if (num1 > num2) {
                result = result - num2;
                num2 = num1 - num2;
            } else {
                num2 = num1;
            }
            result = result + num2;
        }
        return result;
    }
}
