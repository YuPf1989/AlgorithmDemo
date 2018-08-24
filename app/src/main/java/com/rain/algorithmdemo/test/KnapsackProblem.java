package com.rain.algorithmdemo.test;

import android.os.Build;
import android.support.annotation.RequiresApi;

import com.rain.algorithmdemo.Product;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * Author:rain
 * Date:2018/8/23 17:39
 * Description:
 * 背包问题（属于NP完全问题）
 * 说明
 * 有一个背包，可以承受4磅的重量，现在有四件商品
 * 1.吉他 1500元，重1磅
 * 2.音箱 3000元，重4磅
 * 3.笔记本 2000元，重3磅
 * 4.手机 1000元，重1磅
 * 问怎么使背包装的商品的价值最高？
 */
public class KnapsackProblem {
    // 最终背包的产品列表
    private static ArrayList<Product> finalList = new ArrayList<>();
    @RequiresApi(api = Build.VERSION_CODES.N)
    public static void main(String[] args) {
        getSelectedProducts(4,null);
    }

    @RequiresApi(api = Build.VERSION_CODES.N)
    private static void getSelectedProducts(int packageWeight, Product... products) {
        packageWeight = 4;
        // 背包剩余容量
        int surplusWeight = packageWeight;
        Product a = new Product(1500, 1);   // 1500
        Product b = new Product(3000, 4);   // 750
        Product c = new Product(2000, 3);   // 666
        Product d = new Product(1000, 1);   // 1000

        // 计算出每个商品的单位价值
        a.perValue = a.getPerValue();
        b.perValue = b.getPerValue();
        c.perValue = c.getPerValue();
        d.perValue = d.getPerValue();

        // 将商品单位价值由高到低排序
        ArrayList<Product> productss = new ArrayList<>();
        productss.add(a);
        productss.add(b);
        productss.add(c);
        productss.add(d);

        Comparator<Product> comparator = new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                // 按单位价值圣墟排列
                return Integer.compare(o2.perValue, o1.perValue);
            }
        };

        productss.sort(comparator);

        System.out.println("productss:"+productss);

        // TODO: 2018/8/24 算法存在问题，写不出来
        for (int i = 0; i < productss.size(); i++) {
            Product product = productss.get(i);
            if (product.weight <= surplusWeight) {
                surplusWeight = surplusWeight - product.weight;
                finalList.add(product);
            }

        }

        System.out.println("finalList:"+finalList);

//        for (int i = 0; i < products.length; i++) {
//            Product p0 = products[0];
//            Product p1 = products[1];
//            Product p2 = products[2];
//            Product p3 = products[3];
//        }
    }
}
