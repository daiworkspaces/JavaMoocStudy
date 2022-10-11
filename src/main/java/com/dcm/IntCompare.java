package com.dcm;

import java.util.Scanner;

public class IntCompare {


    public static void main(String[] args) {
        System.out.print("请输入正整数x：");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        System.out.print("请输入正整数y：");
        int y = sc.nextInt();


        if(x != y){
            if (x > y){
                System.out.println(x +"大于"+y);
            }else {
                System.out.println(x +"小于"+y);
            }

        }else {
            System.out.println(x +"等于"+y);
        }
    }
}
