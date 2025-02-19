package com.ohgiraffers.chap04.section01.greedy;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/* 설명. 2차원 배열을 이용한 방법 */
public class Application3_1 {

    public static BufferedReader toBufferedReader(String str) {
        InputStream is = new ByteArrayInputStream(str.getBytes());
        return new BufferedReader(new InputStreamReader(is));
    }

    public static Integer solution(String input) throws IOException {
        int max_count = 0;
        BufferedReader br = toBufferedReader(input);
        int N = Integer.parseInt(br.readLine());                // 회의 수
        int[][] time = new int[N][2];                           // 회의 시간 배열(시작/종료)

        StringTokenizer st;

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            time[i][0] = Integer.parseInt(st.nextToken());     // 시작 시간
            time[i][1] = Integer.parseInt(st.nextToken());     // 종료 시간
        }

        Arrays.sort(time, (o1, o2) -> {
            /* 설명. 종료 시간이 같은 회의에 대해서는 */
            if (o2[1] == o1[1]) {       // 종료 시간이 같다면
                return o2[0] - o1[0];   // 시작 시간은 내림차순
            }

            /* 설명. 종료 시간이 다른 회의에 대해서는 */
            return o1[1] - o2[1];
        });

        int end = 0;
        int same = 0;

        /* 설명. 조건을 만족하는 회의들의 count를 증가시키는 반복문 */
        for (int i = 0; i < N; i++) {
            /* 설명. 최소한 앞선 회의의 끝나는 시간 이후에 열리는 i번째 회의라면 */
            if (end <= time[i][0] && same <= time[i][0]) {
                if (time[i][0] == time[i][1]) {
                    max_count++;
                    same = time[i][1];  // 종료 시간에 영향을 주지 않는다.
                    continue;
                }
                end = time[i][1];       // 진행된 회의의 end 시간으로 업데이트
                max_count++;
            }
        }

        return max_count;
    }
}
