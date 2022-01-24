package com.leetcode;

public class MaximumSubarray {

    public static void main(String[] args) {
        System.out.println(maxSubArray(new int[]{-2, 1}));

    }

    public static int maxSubArray(int[] nums) {
        int maxSum = nums[0], maxValue = 0;
        for (int i = 0; i < nums.length; i++) {
            maxValue = maxValue + nums[i];
            if (maxSum < maxValue) {
                maxSum = maxValue;
            }
            if (maxValue < 0) {
                maxValue = 0;
            }
        }
        return maxSum;
    }

}
