package com.edu.test;

import java.util.ArrayList;
import java.util.List;

/*
 * 算法1
 * */
public class Test {

    /**
     * getNum(Integer num,Integer num1,Integer num2)：Integer
     *
     * @param num  总小球数
     * @param num1 需要组合的小球数
     *
     */
    public double getNum(Integer num, Integer num1) {
        double num3 = 1;
        Integer num2 = num - num1;
        for (Integer i = 1; i < num+1; i++) {
            if (num1 > 1 && num2 > 1) {
                num3 = num3 * i / num1 / num2;
            } else if (num1 <= 1 && num2 > 1) {
                num3 = num3 * i / num2;
            } else if (num1 <= 1 && num2 <= 1) {
                num3 = num3 * i;
            } else if (num1 > 1 && num2 <= 1) {
                num3 = num3 * i / num1;
            }
            num1--;
            num2--;
        }
        return num3;

    }

    /**
     * getNums第一题
     *
     * 伪代码
     * 定义数量标识 num
     * FOR(第一个号码 i=1;判断标识是否大于小球个数;标识++)
     *  FOR(第二个号码 j=i+;判断标识是否大于小球个数;标识++)
     *      FOR(第三个号码 k=j+;判断标识是否大于小球个数;标识++)
     *          输出组合 i,j,k
     *          num++
     * 输出数量
     *
     * */
    public void getNums(){
        int num = 0;
        for(int i=1;i<=18;i++){
            for (int j=i+1;j<=20;j++){
                for (int k=j+1;k<=20;k++){
                    System.out.println("["+i+","+j+","+k+"]");
                    num++;

                }
            }
        }
        System.out.println(num);
    }

    /**
     * 第二题
     * 伪代码
     * 定义标识num=0
     *  FOR遍历中奖号码列表
     *      FOR遍历自己号码列表
     *          if是否中奖
     *              标识加一
     * if标识是否三个号码都中奖
     *    return 恭喜你中奖了
     * return 很遗憾你未中奖
     * */
    public String getxx(List<Integer> list1,List<Integer> list2){
        int num=0;
        for (Integer num1:list1){
            for (Integer num2:list2){
                if (num1==num2){
                    num++;
                }
            }
        }
        if (num==3)
            return "恭喜你中奖了";
        return "很遗憾你未中奖";
    }

    public static void main(String[] args) {
        Test test = new Test();
//        int num =(int) test.getNum(20, 3);
//        System.out.println(num);
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        list1.add(6);
        list1.add(7);
        list1.add(8);
        list2.add(2);
        list2.add(4);
        list2.add(10);
        String getxx = test.getxx(list1, list2);
        System.out.println(getxx);
    }

}
