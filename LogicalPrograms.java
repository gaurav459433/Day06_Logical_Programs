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
}
