
package com.harman.batch4;

import java.sql.SQLOutput;
import java.util.Scanner;

public class calculator {
    public int AdditionOperation(int x,int y){
        int z=x+y;
        return z;
    }
    public static void main(String[] args) {
        calculator calc=new calculator();
        Scanner input=new Scanner(System.in);
        int n1,n2, result;
        System.out.println("enter num1");
        n1 = input.nextInt();
        System.out.println("enter num2");
        n2 = input.nextInt();
        result=calc.AdditionOperation(n1,n2);
        System.out.println(result);
    }
}
