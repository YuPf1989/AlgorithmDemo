package com.rain.algorithmdemo.algorithm;

import java.util.ArrayList;
import java.util.List;

/**
 * Author:rain
 * Date:2018/8/20 15:04
 * Description:快速排序
 * divide and conquer,简写D&C 分而治之，著名的递归问题解决办法
 * 使用D&C解决问题步骤：
 * 1.找出基线条件，这种条件必须尽可能简单
 * 2.不断将问题分解（或者说缩小规模），直到符合基线条件
 *
 */
public class QuickSort {
    private static final String TAG  = "QuickSort";

    // TODO: 2018/8/20 有错误
    public static List qSort(List<Integer> list) {
        int len = list.size();
        if (len < 2) {  // 基线条件，如果为空，或只包含一个的元素的数组是不需要排序的
            return list;
        } else {
            int base = list.get(0);// 基准值,递归条件
            ArrayList<Integer> less = new ArrayList<>();// 比基准值小的数组
            ArrayList<Integer> greater = new ArrayList<>();// 比基准值大的数组
            int k1 = 0;
            int k2 = 0;
            for (int i = 1; i < len; i++) {
                if (list.get(i) < base) {
                    less.add(k1,list.get(i)) ;
                    k1++;
                } else {
                    greater.add(k2,list.get(i)) ;
                    k2++;
                }
            }
            qSort(less);
            qSort(greater);
            less.add(base);
            less.addAll(greater);
            return less;
        }
    }
}
