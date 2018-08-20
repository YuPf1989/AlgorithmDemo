package com.rain.algorithmdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.rain.algorithmdemo.algorithm.BinaryAlgorithm;
import com.rain.algorithmdemo.algorithm.Recursion;
import com.rain.algorithmdemo.algorithm.SelectSort;

import java.util.Arrays;

/**
 * 主要是学习一些算法
 * 1.大O表示法 O(n)，注意最大时间这个关键词
 * O(n) 表示有n个元素时，查找其中一个元素所需要操作的最大次数为n次
 * 准确的说，是随着元素n的增加，查找某个元素所需要的最大时间的函数
 * 比如简单查找为O(n)，二分法查找为O(logN),注意这里的log指log2
 * 2.数据结构
 * 数组：数组在内存存储时，是一块连续的内存，每个元素都有单独的内存地址，在表现上是查询快增删慢
 * 链表：元素在内存中可以不连续，每个元素保存有下一个元素的内存地址，增删快，但是查询慢
 * 栈：先进先出（排队），先进后出（排队）
 * 3.递归
 * 在某个函数体内调用自己函数的函数
 * 基线条件：跳出递归的条件
 * 递归条件：引发调用自己函数的条件
 */
public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private static final String TAG = "MainActivity";
    int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7};
    int[] arr2 = new int[]{7, 6, 5, 4, 3, 2, 1};
    private TextView tv_content;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn_binary_search).setOnClickListener(this);
        findViewById(R.id.btn_select_sort).setOnClickListener(this);
        findViewById(R.id.btn_recursion).setOnClickListener(this);
        tv_content = findViewById(R.id.tv_content);
    }

    @Override
    public void onClick(View v) {
        tv_content.setText("");
        switch (v.getId()) {
            case R.id.btn_binary_search:

                // 测试二分法查找
                int search = BinaryAlgorithm.binarySearch(arr, 3);
                Log.e(TAG, "search: " + search);
                break;

            case R.id.btn_select_sort:
                int[] sort = SelectSort.selectSort(arr2);
                Log.e(TAG, "SelectSort: " + Arrays.toString(sort));
                tv_content.setText(Arrays.toString(sort));
                break;

            case R.id.btn_recursion:
                // 递归算法
                int fact = Recursion.fact(5);
                tv_content.setText(fact + "");
                break;
        }
    }
}
