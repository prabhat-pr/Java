package com.practice;

import java.util.Scanner;

public class OddSum {
    public static void main(String[] args) {
oddSum();
    }

    public static void oddSum(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        int sum =0;

        if(num % 2!=0){

        for(int i=1;i<=num;i+=2) {

            sum += i;
        }System.out.println(sum);
        }
        else {
            System.out.println("Even number");

        }


    }
}
