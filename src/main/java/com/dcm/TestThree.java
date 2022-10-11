package com.dcm;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class TestThree {
    public static void main(String[] args) {

        int i =9,j =8,k =6,m = 10;
        if (!(i>j) || m<k++)
            k--;
        else
            k++;

        System.out.println("i:"+i);
        System.out.println("j:"+j);
        System.out.println("k:"+k);
        System.out.println("m:"+m);
    }

}