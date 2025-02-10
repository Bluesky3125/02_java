package com.ohgiraffers.section02.userexception;

import com.ohgiraffers.section02.userexception.exception.MoneyNegativeException;
import com.ohgiraffers.section02.userexception.exception.NotEnoughMoneyException;
import com.ohgiraffers.section02.userexception.exception.PriceNegativeException;

public class Application1 {
    public static void main(String[] args) {

        /* 수업목표. 사용자 정의형 예외 클래스 정의 후 발생한 사용자 예외들을 처리할 수 있다. */
        /* 설명.
        *   catch 블록은 이어서 여러 개를 쓸 수 있다.(각각의 예외 처리를 다르게 하고자 할 때)
        *   try 블록에서 예외가 발생하면 catch 블록들은 순차적으로 실행되며
        *   이 때 부모 예외 클래스가 먼저 작성되면 이후 catch 블록은 실행되지 않을 수 있으므로
        *   자식 예외 클래스의 catch 구문을 먼저 작성해야 한다.
        * */
        ExceptionTest et = new ExceptionTest();

        try {
            et.checkEnoughMoney(30000, 40000);
//            et.checkEnoughMoney(-30000, 40000);
//            et.checkEnoughMoney(30000, -40000);
//            et.checkEnoughMoney(130000, 40000);
        } catch (PriceNegativeException e) {
            System.out.println(e.getMessage());
        } catch (MoneyNegativeException e) {
            System.out.println(e.getMessage());
        } catch (NotEnoughMoneyException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("상정되지 않은 예외");
            System.out.println(e.getMessage());
        }

        System.out.println("프로그램을 종료합니다.");
    }
}
