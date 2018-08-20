package com.rain.algorithmdemo.algorithm;

import android.util.Log;

/**
 * Author:rain
 * Date:2018/8/17 11:28
 * Description:
 * 二分算法
 * 对于包含n个元素的列表，二分查找最多需要log2 n步
 * 简单算法，即一个一个查找，需要n步
 */
public class BinaryAlgorithm {
    private static final String TAG = "BinaryAlgorithm";

    /**
     * 二分查找
     *
     * @param arr  要查找的有序的int数组
     * @param item 要查找的数字
     * @return 当前item的下标
     */
    public static int binarySearch(int[] arr, int item) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            Log.e(TAG, "mid: " + mid);
            int guess = arr[mid];
            if (guess == item) {
                Log.e(TAG, "binarySearch: guess:" + guess);
                return mid;
            }
            if (guess < item) {
                low = mid + 1;
            }
            if (guess > item) {
                high = mid - 1;
            }
        }
        return -1;
    }
}
