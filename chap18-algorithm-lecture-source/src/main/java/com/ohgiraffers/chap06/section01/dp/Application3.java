package com.ohgiraffers.chap06.section01.dp;

public class Application3 {

    public static Integer[] dp = new Integer[101];

    public static Integer solution(Integer n) {
        dp[1] = 1;
        dp[2] = 1;
        dp[3] = 1;

        return padovan(n);
    }

    private static Integer padovan(Integer n) {

        /* 설명. 재귀 호출에 의한 stackoverflow를 막기 위해 null이 아닌 값을 만날 때까지만
         *  재귀 호출함(값이 비워져 있으면 점화식으로 채운다.)
         * */
        if (dp[n] == null) dp[n] = padovan(n - 2) + padovan(n - 3);
        return dp[n];
    }


//    public static Integer solution(Integer n) {
//        int[] dp = new int[n + 1];
//        dp[0] = 0;
//        dp[1] = 1;
//        dp[2] = dp[1];
//        dp[3] = dp[2];
//        dp[4] = dp[3] + dp[1];
//        for (int i = 5; i <= n; i++) {
//            dp[i] = dp[i - 5] + dp[i - 1];
//        }
//        return dp[n];
//    }
}
