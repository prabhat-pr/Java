package com.practice;

import java.util.Scanner;

public class MultiTable {
    public static void main(String[] args) {
        multiTable();

    }

    public static void multiTable(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Which multiplication table you want to print, enter number: ");
        int num =sc.nextInt();
        int i=1;
        while (i<=10){
            System.out.println(num + " X " + i + " = "+(num*i));
            i++;
        }
    }
}

