package com.calculator;

// import java.util.Scanner;

public class calculator 
{

    // Adding numbers

    public static int addTwoNumbers(int num1, int num2){        
        return num1 + num2;
    }

    public static int addMultipleNumbers(int... numbers){
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }

    // Multipliying numbers

    public static int MultiplyTwoNumbers(int n1, int n2){        
        return n1 * n2;
    }

    public static int MultiplyMultipleNumbers(int... numbers){
        int product = 1;
        for (int number : numbers) {
            product *= number;
        }
        return product;
    }

    // public static void main( String[] args )
    // {
    //     System.out.println( "Hello World!" );
    //     Scanner in = new Scanner(System.in);
    //     System.out.println("Enter number 1");
    //     int a = in.nextInt();
    //     int b = in.nextInt();
    //     add(a,b);
    // }
}
