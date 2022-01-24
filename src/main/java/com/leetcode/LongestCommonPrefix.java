package com.leetcode;

public class LongestCommonPrefix {

    public static void main(String[] args) {
        System.out.println(longestCommonPrefixArraySort(new String[]{"flower", "flow", "flight"}));
    }

    public static String longestCommonPrefixArraySort(String[] strs) {
        String prefix = "", firstKey = "", temp = "";
        boolean flag = false;
        for (int i = 1; i < strs.length; i++) {
            if (strs[i].length() < strs[i - 1].length()) {
                temp = strs[i - 1];
                strs[i - 1] = strs[i];
                strs[i] = temp;
            }
        }
        firstKey = strs[0];
        for (int i = 0; i < strs.length; i++) {
            while (!flag) {
                if (strs[i].startsWith(firstKey)) {
                    if (prefix != firstKey)
                        prefix = firstKey;
                    break;
                } else {
                    firstKey = firstKey.substring(0, firstKey.length() - 1);
                    if (prefix != firstKey)
                        prefix = firstKey;
                }
            }
        }
        return prefix;
    }
}
