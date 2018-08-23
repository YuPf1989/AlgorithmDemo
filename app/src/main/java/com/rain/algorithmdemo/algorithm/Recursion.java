package com.rain.algorithmdemo.algorithm;

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
    // 阶乘算法
    public static int fact(int x){
        if (x == 1) {   // 基线条件
            return x;
        } else {        // 递归条件
            return x * fact(x - 1);
        }
    }
}
