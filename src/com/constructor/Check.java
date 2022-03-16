package com.constructor;

public class Check {
    public static void main(String[] args) {
        try{
            String name = null;
            System.out.println(name.length());
        }
        catch(ArithmeticException e)
        {
            System.out.println("Divide by Zero is not possible");
        }
        catch(NullPointerException e)
                {
            System.out.println("NULL VALUE is not accepted");
        }
    }
}
