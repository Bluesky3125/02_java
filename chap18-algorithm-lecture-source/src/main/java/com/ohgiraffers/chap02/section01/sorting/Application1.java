package com.ohgiraffers.chap02.section01.sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.stream.IntStream;

/* 수업목표. 버블 정렬을 이해할 수 있다. */
/* 설명.
 *  정렬 알고리즘
 *   데이터를 특정 순서대로 배열하는데 사용한다.(일반적으로는 배열의 정렬을 뜻함)
 *  　
 *  버블 정렬(Bubble Sort)
 *   두 인접한 데이터의 크기를 비교해 정렬하는 방법이다.
 *   버블의 모든 요소에 대해 반복하면서, 각 반복마다 가장 큰(작은) 요소가 배열의 끝으로
 *   "버블링(이동)"된다.
 *   시간 복잡도는 O(n^2)이라 효율적이지는 않다.
 * */
public class Application1 {
    /* 설명.
     *  문제 내용
     *   : N개의 정수가 주어졌을 때, 버블 정렬 알고리즘을 사용하여 오름차순으로 정렬하는 프로그램을 작성하시오.
     *  입력
     *   - 첫 번째 줄에 자연수 N(1 <= N <= 100)이 주어진다.
     *   - 두 번째 줄에 N개의 정수가 공백으로 구분되어 입력된다. 각 정수는 -10^9 이상, 10^9 이하이다.
     *  출력
     *   - 오름차순으로 정렬된 수열을 공백으로 구분하여 출력한다.
     *
     *  설명.
     *   예시 입력 1
     *     - 7
     *       34 23 5 24 1 9 12
     *   예시 출력 1
     *     - 1 5 9 12 23 24 34
     *
     *  설명.
     *   예시 입력 2
     *     - 6
     *       40 47 38 8 33 35
     *   예시 출력 2
     *     - 8 33 35 38 40 47
     * */
    public static void main(String[] args) {

        int length; //= 7;
        int[] arr; //= {34, 23, 5, 24, 1, 9, 12};
        /* 설명. 입력 데이터 받기 */
        /* 목차. 1. Scanner */
//        Scanner sc = new Scanner(System.in);
//        length = sc.nextInt();
//        arr = new int[length];
//        for (int i = 0; i < length; i++) {
//            arr[i] = sc.nextInt();      // 공백 전까지 파싱해 문자열 -> int형으로 변환 작업까지 완료
//        }

        /* 목차. 2. BufferedReader */
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            length = Integer.parseInt(br.readLine());

            /* 설명. 1. split 활용 */
//            String[] strArr = br.readLine().split(" ");
//            arr = new int[length];
//            for (int i = 0; i < length; i++) {
//                arr[i] = Integer.parseInt(strArr[i]);
//            }

            /* 설명. 2. StringTokenizer 활용 */
//            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
//            arr = new int[st.countTokens()];
//            int index = 0;
//            while (st.hasMoreTokens()) {
//                arr[index] = Integer.parseInt(st.nextToken());
//                index++;
//            }

            /* 설명. 3. Stream 활용 */
            IntStream intStream = Arrays.stream(br.readLine().split(" "))
                                     .mapToInt(Integer::parseInt);
            arr = intStream.toArray();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        Solution(length, arr);

        System.out.println("length = " + length);
        System.out.println("arr = " + Arrays.toString(arr));
    }

    /* 설명. 넘어온 데이터를 가지고 버블 정렬 알고리즘 작성 시작 */
    public static void Solution(int length, int[] arr) {

        /* 설명. 전부 탐색 */
        for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j < length /* 설명. 가장 큰 수부터 정렬시 */ /* - i*/ - 1; j++) {
//                System.out.println(j + "와 " + (j + 1) + "를 비교");
                if (arr[j] > arr[j + 1]) {

                    /* 설명. j번째와 그 다음인 (j + 1)번째의 위치를 서로 바꾼다.(swap)*/
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

//        /* 설명. 가장 작은 수부터 정렬 */
//        for (int i = 0; i < length; i++) {
//            for (int j = i + 1; j < length; j++) {
//                // System.out.println(i + "와 " + j + "를 비교");
//                if (arr[i] > arr[j]) {
//                    int temp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = temp;
//                }
//            }
//        }
    }
}
