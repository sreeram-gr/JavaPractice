package com.kk.search;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class LinearSearch {

    public static void main(String[] args) {
        int[] intArr = {13, 14, 10, 1, 17, -7, 5, 7, 0, -5};
        System.out.println("Min : " + minSearch(intArr));
        System.out.println("Max : " + maxSearch(intArr));
        String str = "sreeram";
        System.out.println(charSearch(str, 'e'));
        System.out.println(charCount(str));
    }

    public static int minSearch(int[] intArr) {
        if (intArr.length == 0) {
            return Integer.MIN_VALUE;
        } else {
            int min = intArr[0];
            for (int i = 1; i < intArr.length; i++) {
                if (min > intArr[i]) {
                    min = intArr[i];
                }
            }
            return min;
        }
    }

    public static int maxSearch(int[] intArr) {
        if (intArr.length == 0) {
            return Integer.MIN_VALUE;
        } else {
            int max = intArr[0];
            for (int i = 1; i < intArr.length; i++) {
                if (max < intArr[i]) {
                    max = intArr[i];
                }
            }
            return max;
        }
    }

    public static boolean charSearch(String str, char ch) {
        char[] charArr = str.toCharArray();
        for (char character : charArr) {
            if (character == ch) {
                return true;
            }
        }
        return false;
    }

    public static HashMap<Character,Integer> charCount(String str) {
        char[] charArr = str.toCharArray();

        HashMap<Character, Integer> charMap = new LinkedHashMap<>();

        for (char c : charArr) {
            if (!charMap.containsKey(c)) {
                charMap.put(c, 1);
            } else {
                charMap.put(c, charMap.get(c) + 1);
            }
        }

        return charMap;
    }
}
