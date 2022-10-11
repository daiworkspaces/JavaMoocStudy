package com.dcm;

public class CharTestDemo {
    public static void main(String[] args) {
        char ch = 'a';
        int count = 1;//控制行数
        while (ch<='z'){
            System.out.print(ch+"");
            if (count % 13 == 0){
                System.out.println();
            }
            ch++;
            count+=1;

        }


    }
}
