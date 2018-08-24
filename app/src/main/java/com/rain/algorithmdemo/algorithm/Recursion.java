package com.rain.algorithmdemo.algorithm;

import java.util.ArrayList;
import java.util.List;

/**
 * Author:rain
 * Date:2018/8/20 11:51
 * Description:递归算法
 * 在某个函数体内调用自己函数的函数
 * 基线条件：跳出递归的条件
 * 递归条件：引发调用自己函数的条件
 * 注意每个fact x都有自己的x变量，在一个函数调用中，不能访问另一个x变量
 */
public class Recursion {
    private static ArrayList list = new ArrayList();

    public static void main(String[] args) {
        initData();
//        int sum = getSum(list);
//        System.out.println("sum:"+sum);
//        System.out.println("count:"+getCount(list));
        System.out.println("max:" + getLargest(list));
//        System.out.println("i:" + countDown(5));

    }

    private static void initData() {
//        for (int i = 0; i < 5; i++) {
//            list.add(i);
//        }
        list.add(3);
        list.add(8);
        list.add(7);
        list.add(4);
        list.add(4);
        list.add(6);
        list.add(10);
        list.add(9);
        list.add(9);
        list.add(1);
    }

    // 阶乘算法
    public static int fact(int x) {
        if (x == 1) {   // 基线条件
            return x;
        } else {        // 递归条件
            return x * fact(x - 1);
        }
    }

    // 找出列表中最大的数字，使用递归算法
    private static int getLargest(List<Integer> list) {
        int len = list.size();
        if (len == 0) {
            return 0;
        }
        int max = list.get(0);
        if (len == 1) {
            return max;
        }
        int second = list.get(1);
        if (max <= second) {
            list.remove(0);
        } else {
            list.remove(1);
        }
        max = getLargest(list);
        return max;
    }

    // 使用递归来求和，主要是练习递归算法
    private static int getSum(List<Integer> list) {
        if (list.size() == 0) {
            return 0;
        }
        return list.get(0) + getSum(getNewList(list));
    }

    private static <T> List<T> getNewList(List<T> oldList) {
        oldList.remove(0);
        return oldList;
    }

    // 使用递归计算包含的元素数
    private static int getCount(List<Integer> list) {
        if (list.size() == 0) {
            return 0;
        }
        return 1 + getCount(getNewList(list));
    }

    // 给定一个值，让其递减，直到为0
    private static int countDown(int i) {
        if (i > 0) {
            // 注意比较两种写法，打印出的i的值
            // 注意最终返回的i值的个数，最终retrun的i值为最后出栈的i值
//            i = countDown(i - 1);
            countDown(i - 1);
        }
        System.out.println(i);// 上边第一种写法输出5次，i值都为0；上边第二种写法输出5次，i值为0，1,2,3,4,5
        return i;
    }

}
