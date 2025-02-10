package com.ohgiraffers.section01.exception;

public class Application {
    public static void main(String[] args) throws ArithmeticException {

        /* 수업목표. 예외에 대해 이해하고 이를 처리하기 위한 문법을 활용할 수 있다. */
        /* 설명.
         *  1. throws를 통한 위임
         *  2. try-catch를 통한 처리
         */

        ExceptionTest et = new ExceptionTest();

        /* 목차. 1. throws로 처리 시 */
//        et.checkEnoughMoney(50000, 10000);

        /* 목차. 2. try-catch로 처리 시 */
//        try {   /* 설명. 트랜잭션의 성격을 지님, try에서 예외가 발생하면 이후는 실행되지 않고 catch로 넘어감 */
            /* 설명. try 블럭은 처리할 예외가 발생할 적당한 범위를 감싼다. */
//            et.checkEnoughMoney(10000, 50000);
//            et.checkEnoughMoney(50000, 10000);
//            System.out.println("예외가 없습니다. 돈이 충분하시군요.");
//        } catch (ArithmeticException e) {
//
//            /* 설명.
//             *  try 블록에서 발생한 예외(객체)를 처리하는 부분
//             *  예외 객체를 활용하게 되면 해당 예외 객체의 메소드를 사용할 수 있다.
//             */
////            System.out.println("예외가 발생했군요!");
//
////            System.out.println("그 예외는 " + e.getMessage() + " 때문이군요!");
////            System.out.println("...");
//
//            /* 설명. 예외 메시지와 발생한 문제들을 추적할 수 있게 빨간 글씨의 메시지로 처리되는 방식 */
//            e.printStackTrace();
//
////            System.exit(0);             // 자바 어플리케이션이 즉시 종료되도록 처리
//        }

        try {
            int num = 10;
            System.out.println(num / 0);
        } catch (/*Arithmetic*/Exception e) {
            System.out.println("0으로 나눴습니다.");
            System.out.println(e.getMessage());
        }

        System.out.println("프로그램을 종료합니다.");
    }
}
