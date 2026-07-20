package com.activity;

import java.util.Scanner;

public class Activity4 {

    public static void main(String[] args) {

        System.out.println("URK23CS1241");

        Scanner sc = new Scanner(System.in);

        int count[] = new int[101];

        System.out.println("Enter marks of 30 students:");

        for (int i = 0; i < 30; i++) {

            int mark = sc.nextInt();

            if (mark >= 0 && mark <= 100) {
                count[mark]++;
            }
        }

        System.out.println("Marks\tStudents");

        for (int i = 0; i <= 100; i++) {

            if (count[i] > 0) {
                System.out.println(i + "\t" + count[i]);
            }
        }

        sc.close();
    }
}
