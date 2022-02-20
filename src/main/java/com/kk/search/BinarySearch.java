package com.kk.search;

public class BinarySearch {

    public static void main(String[] args) {
        int[] ascArr = {-8, -5, -3, -1, 0, 12, 14, 18, 23};
        int[] dscArr = {8, 5, 3, 1, 0, -12, -14, -18, -23};
        int target = 18;
        System.out.println(searchTarget(ascArr, target));
        System.out.println(searchTarget(dscArr, target));
    }

    public static int searchTarget(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        boolean isAsc = arr[start] < arr[end];
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == arr[mid])
                return mid;
            else if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else if (target > arr[mid]) {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else if (target < arr[mid]) {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
