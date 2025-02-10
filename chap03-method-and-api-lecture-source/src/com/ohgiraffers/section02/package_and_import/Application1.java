package com.ohgiraffers.section02.package_and_import;

public class Application1 {
    public static void main(String[] args) {

        /* 수업목표. 패키지에 대해 이해할 수 있다. */
        /* 설명.
        *   패키지의 의미
        *   1. 클래스의 소속
        *   2. 원래는 클래스명의 일부분이다.
        *   3. 경우에 따라 생략 가능하다.
        * */

        /* 설명. non-static 메소드 호출을 위해 Calculator 인지(feat. 다른 패키지에서) */
        com.ohgiraffers.section01.method.Calculator cal
                = new com.ohgiraffers.section01.method.Calculator();

        int plusResult = cal.plusTwoNumbers(100, 20);
        System.out.println("100과 20의 합: " + plusResult);

        int maxResult = com.ohgiraffers.section01.method.Calculator.maxNumbersOf(100, 20);
        System.out.println("maxResult = " + maxResult);

        /* 설명. 다른 패키지에 있는 클래스의 이름을 간략히 적기 위해 import를 사용한다. */
    }
}
