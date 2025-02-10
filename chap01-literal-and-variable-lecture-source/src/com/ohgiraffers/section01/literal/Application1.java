package com.ohgiraffers.section01.literal;

public class Application1 {
    public static void main(String[] args) {

        // 한줄 주석(코드 설명)

        /*
        * 범위(개념 설명)
        * 주석
        * */

        /* 수업목표. 여러 가지 값의 형태를 출력할 수 있다. */
        /* 목차. 1. 숫자 형태의 값
            Java는 정적 타입 언어 */

        /* 목차. 1-1. 정수 형태의 값 출력 */
        System.out.println(123);

        /* 목차. 1-2. 실수 형태의 값 출력 */
        System.out.println(123.123);

        /* 목차. 2. 문자 형태의 값 출력 */
        System.out.println('a');
        System.out.println('1');
        System.out.println('\u0000'); // 값이 없는 문자

        /* 목차. 3. 문자열 형태의 값 출력*/
        System.out.println("안녕하세요");
        System.out.println("a");
        System.out.println("");

        /* 목차. 4. 논리 형태의 값 출력*/
        System.out.println(true);
//        System.out.println("true");  // 이건 문자열이지 논리형이 아니다.
        System.out.println(false);
    }
}
