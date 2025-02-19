package com.ohgiraffers.chap04.section01.greedy;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Application2 {

    public static BufferedReader toBufferedReader(String str) {
        InputStream is = new ByteArrayInputStream(str.getBytes());
        return new BufferedReader(new InputStreamReader(is));
    }

    public static int solution(String input) throws IOException {
        BufferedReader br = toBufferedReader(input);

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());


        int[] coin = new int[N];        // 동전의 종류들을 담을 배열
        for (int i = 0; i < coin.length; i++) {
            coin[i] = Integer.parseInt(br.readLine());
            System.out.println(coin[i]);
        }

        int count = 0;

        for (int i = coin.length - 1; i >= 0; i--) {
            /* 설명. 현재의 동전 종류로 최대 지불할 수 있는 금액 */
            count += K / coin[i];       // 문제를 해결하기 위한 동전이 2개 이상일 경우를 감안(누적)
            /* 설명. 큰 금액의 동전으로 처리하고 남는 금액을 K에 대입(다음 동전 단위를 위해) */
            K %= coin[i];
        }

        return count;
    }
}
