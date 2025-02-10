package com.ohgiraffers.section02.looping;

import java.util.Scanner;

public class C_while {
    public void testSimpleWhileStatement() {
        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }
    }

    public void testWhileExample() {
        Scanner sc = new Scanner(System.in);

        /* 설명. 'y' 또는 'Y'를 입력하면 반복을 멈추는 while문 작성 */
        char answer = '\0';
        while (!(answer == 'y' || answer == 'Y')) {
            System.out.println("'y' 또는 'Y'를 눌러 종료");
            answer = sc.next().charAt(0);
        }
        System.out.println("종료되었습니다.");
    }
}
