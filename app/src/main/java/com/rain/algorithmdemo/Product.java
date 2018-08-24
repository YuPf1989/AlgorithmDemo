package com.rain.algorithmdemo;

/**
 * Author:rain
 * Date:2018/8/23 17:46
 * Description:
 */
public class Product {
    // 商品价值
    public int value;
    // 重量
    public int weight;
    // 单位价值
    public int perValue;

    public Product(int value, int weight) {
        this.value = value;
        this.weight = weight;
    }

    public Product() {
    }

    // 商品的单位价值
    public int getPerValue() {
        if (value != 0 && weight != 0) {
            return value / weight;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Product{" +
                "value=" + value +
                ", weight=" + weight +
                ", perValue=" + perValue +
                '}';
    }
}
