package com.rain.algorithmdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.rain.algorithmdemo.algorithm.BinaryAlgorithm;
import com.rain.algorithmdemo.algorithm.QuickSort;
import com.rain.algorithmdemo.algorithm.Recursion;
import com.rain.algorithmdemo.algorithm.SelectSort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * 主要是学习一些算法
 * 1.大O表示法 O(n)，注意最大时间这个关键词
 * O(n) 表示有n个元素时，查找其中一个元素所需要操作的最大次数为n次
 * 准确的说，是随着元素n的增加，查找某个元素所需要的最大时间的函数
 * 比如简单查找为O(n)，二分法查找为O(logN),注意这里的log指log2
 * 2.数据结构
 * 数组：数组在内存存储时，是一块连续的内存，每个元素都有单独的内存地址，在表现上是查询快增删慢
 * 链表：元素在内存中可以不连续，每个元素保存有下一个元素的内存地址，增删快，但是查询慢
 * 栈：后进先出
 * 队列：先进先出
 * hash:哈希表、散列表，时间复杂度几乎为O(1)，就是找到一种数据内容和数据存放地址之间的映射关系
 * 散列法：元素特征转变为数组下标的方法
 * 散列函数：数据键值中键与地址的映射关系的函数
 * 3.递归
 * 在某个函数体内调用自己函数的函数
 * 基线条件：跳出递归的条件
 * 递归条件：引发调用自己函数的条件
 * 4.广度优先算法
 * 是一种图形搜索演算法。
 * 简单的说，BFS是从根节点开始，沿着树的宽度遍历树的节点，如果发现目标，则演算终止。
 * 广度优先搜索的实现一般采用open-closed表。适用于搜索最短路径
 * 5.狄克斯特拉算法，适用于最短时间、最便宜路径
 * 步骤：
 * 1.找出最便宜的节点，即可在最短时间内到达的节点
 * 2.对于该节点的邻居，检查是否有前往他们的最短路径，如果有就更新其开销
 * 3.重复这个过程，直到对每个节点都这样做了
 * 4.计算最终路径
 *
 * 广度优先：用于在非加权图中查找最短路径
 * 狄克斯特拉算法：用于在加权图中查找最短路径
 * 仅当加权为正时狄克斯特拉算法才管用
 *
 * 6.贪婪算法
 * 贪心算法（又称贪婪算法）是指，在对问题求解时，总是做出在当前看来是最好的选择。
 * 也就是说，不从整体最优上加以考虑，他所做出的是在某种意义上的局部最优解
 *
 * 7.近似算法
 * 在获得精确解太长时，可采用近似算法，判断近似算法优劣的标准如下：
 * 1.速度有多快
 * 2.得到近似解与最优解的精确程度
 *
 * 8.费曼算法
 * 将问题写下来
 * 好好思考
 * 写出答案
 *
 * 9.K最近邻算法（KNN）
 * K：与该事物有相似特征的K个事物
 * KNN用于分类和回归
 * 分类就是编组，回归就是预测结果
 * 特征抽取意味着将物品转换为一系列可供比较的数字
 * 能否挑选合适的特征事物关乎KNN算法的成败
 *
 *
 * 10.
 *
 */
public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private static final String TAG = "MainActivity";
    int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7};
    int[] arr2 = new int[]{7, 6, 5, 4, 3, 2, 1};
    private List<Integer> list = Arrays.asList(7, 6, 5, 4, 3, 2, 1);
    private TextView tv_content;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn_binary_search).setOnClickListener(this);
        findViewById(R.id.btn_select_sort).setOnClickListener(this);
        findViewById(R.id.btn_recursion).setOnClickListener(this);
        findViewById(R.id.btn_quick_sort).setOnClickListener(this);
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
                // 选择排序
                int[] sort = SelectSort.selectSort(arr2);
                Log.e(TAG, "SelectSort: " + Arrays.toString(sort));
                tv_content.setText(Arrays.toString(sort));
                break;

            case R.id.btn_recursion:
                // 递归算法
                int fact = Recursion.fact(5);
                tv_content.setText(fact + "");
                break;

            case R.id.btn_quick_sort:
                // 快速排序
                List list = QuickSort.qSort(this.list);
                tv_content.setText(list.toString());
                break;
        }
    }
}
