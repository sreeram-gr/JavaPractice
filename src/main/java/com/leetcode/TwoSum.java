package com.leetcode;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

	static int num[] = {2,7,11,15}; 
	public static void main(String[] args) {
		System.out.println(Arrays.toString(twoSum(num, 9)));
	}

    public static int[] twoSum(int[] nums, int target) {
        int value=0;
        int[] index = new int[2];
        int count=0;
        for(int i=0;i<nums.length;i++){
            value=target-nums[i];
            for(int j=i+1;j<nums.length;j++){
                if(value==nums[j]){
                    index[0]=i;
                    index[1]=j;
                    count++;
                    break;
                }
            }
            if(count==1)
            	break;
        }
        return index;
    }
    
    public int[] twoSum2(int[] nums, int target) { 
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i=0;i<nums.length;i++){ 
            int value = target-nums[i];
            if(hm.containsKey(value)){
                return new int[]{hm.get(value),i};
            }
            else{
                hm.put(nums[i],i);
            }
        }
        return new int[]{-1,-1};
    }
}
