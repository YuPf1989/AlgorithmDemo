package com.rain.algorithmdemo;

import java.util.ArrayList;
import java.util.List;

/**
 * Author:rain
 * Date:2018/8/17 11:37
 * Description:
 * 算法测试
 * 递归调用性能往往比循环低
 */
public class Test {
    private static ArrayList list = new ArrayList();

    public static void main(String[] args) {
        initData();
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



}
