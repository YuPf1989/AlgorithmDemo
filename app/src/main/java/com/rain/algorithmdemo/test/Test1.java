package com.rain.algorithmdemo.test;

/**
 * Author:rain
 * Date:2018/8/22 9:17
 * Description:
 * 主要用于编写验证一些算法
 * 有A、B、C、D、E 5个字符，可以挨个取，两两取，三个一块取，四个一块取，5个一块取，
 * 问总共一共有多少种取值方式？
 * 先建立数据模型
 * 取1个：5种方式
 * 取2个：4+3+2+1 10种方式
 * 取3个：3+2+1 6种方式
 * 取4个：2+1 3种方式
 * 取5个：1种方式
 * 总共 1+（1+2）+（1+2+3）+（1+2+3+4）+5 25种方式
 */
public class Test1 {

    /**
     * @param num 总共有几个字符
     */
    private static int getResult(int num) {

        int result = 0;
        int end = 1;
        int sum = 0;
        while (end != num ) {
            result += end ;
            sum += result;
            end++;
            System.out.println(sum);
        }
        return sum + num;
    }

    public static void main(String[] args) {
        System.out.println("共有："+getResult(32)+"种");
    }
}
