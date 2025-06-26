package Recursions;

import java.util.Scanner;

public class Power {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println(" Whats the num??? : ");
        int num = sc.nextInt();
        System.out.println("Okay whats the power raise required : ");
        int pow = sc.nextInt();
        sc.close();

        if(num<0){
            System.out.println("woah...come onn but yeah i get you :" + powerr(num, pow));
        }
        else{
            System.out.println("okay ... lemme see it :"+"here you gooo : "+ powerr(num,pow));
        }
    }
    public static long powerr(int num, int pow){
    // power(x,n-1) == x^n-1 
       if (pow == 0){
        return 1;
       }
       else{
        long powerofnum = num*powerr(num, pow-1);
        return powerofnum;
       }

        
    }
}

// int x = 1;
// for ( int  i = 1; i =<num ; i ++){
//          int x = x *  i               } /// 4^3 = 4*4*4
