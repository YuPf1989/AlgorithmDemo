package com.rain.algorithmdemo.algorithm;

/**
 * Author:rain
 * Date:2018/8/20 10:17
 * Description:
 * 选择排序,从小到大排列
 */
public class SelectSort {
    public static int[] selectSort(int[] arr) {
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            int smallestIndex = i;
            // 找到最小值的下标
            for (int j = i + 1; j < len; j++) {
                if (arr[smallestIndex] > arr[j]) {
                    smallestIndex = j;
                }
            }

            // 将最小值放在第一位,并与其交换位置
            if (smallestIndex > i) {
                int temp = arr[i];
                arr[i] = arr[smallestIndex];
                arr[smallestIndex] = temp;
            }
        }
        return arr;
    }
}
