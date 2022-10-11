package com.dcm;

public class SumDataTest {
    public static void main(String[] args) {

        int n = 1;
        int sum = 0;

        do {
            System.out.println(n);
            sum += n;
            n++;
        }while (n<=5);
        System.out.println("sum: "+sum);
    }
}
