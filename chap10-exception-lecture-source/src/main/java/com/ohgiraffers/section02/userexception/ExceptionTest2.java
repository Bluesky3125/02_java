package com.ohgiraffers.section02.userexception;

import com.ohgiraffers.section02.userexception.exception.MoneyNegativeException;
import com.ohgiraffers.section02.userexception.exception.NotEnoughMoneyException;
import com.ohgiraffers.section02.userexception.exception.PriceNegativeException;

public class ExceptionTest2 {
    public void checkEnoughMoney(int price, int money)
    throws PriceNegativeException, MoneyNegativeException, NotEnoughMoneyException {
        if (price < 0) {
            throw new PriceNegativeException("상품 가격은 음수일 수 없습니다.");
        }

        if (money < 0) {
            throw new MoneyNegativeException("소지금은 음수일 수 없습니다.");
        }

        if (price > money) {
            throw new NotEnoughMoneyException("소지금보다 상품 가격이 높습니다.");
        }

        /* 설명. 아무런 예외가 발생(throw)하지 않으면 실행되는 구문 */
        System.out.println("소지금이 충분합니다.");
    }
}
