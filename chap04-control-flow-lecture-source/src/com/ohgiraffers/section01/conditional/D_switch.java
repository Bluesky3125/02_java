package com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class D_switch {
    public static void testSimpleSwitchStatement() {
        Scanner sc = new Scanner(System.in);

        System.out.print("등급을 입력하세요(G, S, B): ");
        char grade = sc.nextLine().charAt(0); // method chaining
        int point = 0;

        /* 설명. t/f 상황을 저장해서 나중에 활용할 용도로 flag 변수를 추가할 수 있다. */
        boolean flag = true;

        switch (grade) {
            case 'G':
                point += 10;
            case 'S':
                point += 10;
            case 'B':
                point += 10;
                break;
            default:
                System.out.println("입력 오류");
                flag = false;
        }

        /* 설명. if를 활용한 조건문에서 실행 구문이 하나라면 중괄호({})를 생략할 수 있다. */
        if (flag) System.out.println("당신의 등급은 " + grade + "이고, 현재 포인트는 " + point + "입니다.");
        else System.out.println("회원가입 권유");
    }
}
