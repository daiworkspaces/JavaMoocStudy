package com.dcm;

import java.util.Random;
import java.util.Scanner;

public class CaiData {
    public static void main(String[] args) {
        // Math返回数据[0,1) 加1 后就是1到10 的随机数 1是不包含
        int r1 = (int) (Math.random()*10+1);
        int r2 = 0;

        do {
            //提示语
            System.out.println("请输入一个介于1到10之间的数字");
            //输入数
            Scanner sc = new Scanner(System.in);
             r2 = sc.nextInt();
            //随机数


            if (r2 < r1) {
                System.out.println("输入的数字偏小");
            } else if (r2 > r1){
                System.out.println("输入的数字偏大");
            }

        }while (r2 != r1);

        System.out.println("恭喜数据一致");
        System.out.println("猜测值是：" + r1);
    }
}