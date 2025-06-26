package Recursions;

import java.util.Scanner;

public class Factorialnum{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a non neg number");
        int number = scanner.nextInt();
        if(number<0){
            System.out.println("OOps wrong inputs try again");
        }
        else if(number>0)
        { System.out.println("Okay Factorial is :"+ factorial(number));}

        
        int number2 = scanner.nextInt();
        scanner.close();
        if(number2<0){
            System.out.println("Life gives you only 2 chances brooo");
        }
        
        else {
            System.out.println("Okay Btter you used second chance : "+factorial(number2));
        }


    }
    public static long factorial(int n){
        if(n==0){
            return 1;

        }
        else {
           long fact = n * factorial(n-1); // x=x*i
           return fact;
        }
        
    }
}

// int x = 1; 
// for ( int i = 1;i<=num ; i++){
//    int x = x* i ;
//    } 