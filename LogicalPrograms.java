package com.bridgelabz.assignmentsrfp259.day06.logicalprograms;

import java.util.Scanner;

public class LogicalPrograms {
    public static void main(String[] args) {
        System.out.println("Welcome To Logical Programs");
        LogicalPrograms logicalPrograms = new LogicalPrograms();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number: ");
        int n = sc.nextInt();
        logicalPrograms.fibonacciSeries(n);
        logicalPrograms.perfectNumber(n);
        logicalPrograms.primeNumber(n);
    }

    // Program For Fibonacci Series
    public void fibonacciSeries(int n) {
        int a = 0, b = 1, c = 0;
        System.out.println(a);
        System.out.println("1");
        for (int i = 0; i < n; i++) {
            a = b + c;
            System.out.println(a);
            c = b;
            b = a;
        }
    }

    // Program For Perfect Number
    public void perfectNumber(int n) {
        int ans = 0;
        if (n > 0) {
            for (int i = 1; i < n; i++) {
                if (n % i == 0) {
                    System.out.println(i);
                    ans += i;
                }
            }
            if (ans == n) {
                System.out.println(n + " " + "is A Perfect Number");
            } else {
                System.out.println(n + " " + "is Not A Perfect Number");
            }
        }
    }


    // Program For Prime Number
    public void primeNumber(int n) {
        int i = 1, cf = 0;
        do {
            if (n % i == 0) //It means i is the factor of n
                cf++;
            if (cf > 2)
                break;
            i++;
        }
        while (i <= n);
        if (cf == 2)
            System.out.println(n + " is A Prime Number");
        else
            System.out.println(n + " is Not Prime Number");
    }
}
