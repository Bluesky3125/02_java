package com.ohgiraffers.chap06.section01.dp;

import java.util.Arrays;
import java.util.Scanner;

public class Application4_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n + 1][n + 1];
        for (int i = 1; i <= n; i++) {
            arr[i][1] = 1;
            arr[i][i] = 1;
        }
        for (int i = 2; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
            }
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
//            System.out.println(Arrays.toString(arr[i]));
        }
    }
}
