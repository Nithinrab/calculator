package com.harman.batch4;
import java.sql.SQLOutput;
import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n1,n2,result;
        System.out.println("enter num1");
        n1=input.nextInt();
        System.out.println("enter num2");
        n2=input.nextInt();
        result=n1+n2;
        System.out.println(result);
    }
}
