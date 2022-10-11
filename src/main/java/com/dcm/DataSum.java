package com.dcm;

public class DataSum {
    public static void main(String[] args) {
        int n = 1;
        int sum = 0;
        while (n<=15){
            if (n % 2 ==1)
            {
                sum +=n;
                System.out.println(n);
            }
            n++;

        }
        System.out.println(sum);

    }
}
