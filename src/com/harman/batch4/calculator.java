
package com.harman.batch4;

import java.sql.SQLOutput;
import java.util.Scanner;

public class calculator {

    public static void main(String[] args) {
        Addition adCalc=new Addition();
        Subtraction subCalc = new Subtraction();
        Multiplication mulCalc = new Multiplication();
        Division divCalc = new Division();
        Scanner input=new Scanner(System.in);
        int n1,n2, result1,result2,result3,result4;
        System.out.println("enter num1");
        n1 = input.nextInt();
        System.out.println("enter num2");
        n2 = input.nextInt();
        result1=adCalc.AdditionOperation(n1,n2);
        result2=subCalc.SubtractionOperation(n1,n2);
        result3=mulCalc.MultiplicationOperation(n1,n2);
        result4=divCalc.DivisionOperation(n1,n2);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
    }
}
