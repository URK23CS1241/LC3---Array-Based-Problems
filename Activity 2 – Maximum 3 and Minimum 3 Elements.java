package com.activity;

import java.util.Arrays;
import java.util.Scanner;

public class Activity2 {

    public static void main(String[] args) {

        System.out.println("URK23CS1241");

        Scanner sc = new Scanner(System.in);

        int arr[] = new int[20];

        System.out.println("Enter 20 elements:");

        for (int i = 0; i < 20; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        System.out.println("Minimum 3 Elements:");

        for (int i = 0; i < 3; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        System.out.println("Maximum 3 Elements:");

        for (int i = 17; i < 20; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
