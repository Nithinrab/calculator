
package com.harman.batch4;

import java.sql.SQLOutput;
import java.util.Scanner;

public class calculator extends Parentcalculator {

    public static void main(String[] args) {
     calculator ob=new calculator();

        Scanner input=new Scanner(System.in);
        int n1,n2, result1,result2,result3;
        System.out.println("enter num1");
        n1 = input.nextInt();
        System.out.println("enter num2");
        n2 = input.nextInt();
        result1=ob.AddOperation(n1,n2);
        result2=ob.SubOperation(n1,n2);
        result3=ob.MulOperation(n1,n2);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }
}
