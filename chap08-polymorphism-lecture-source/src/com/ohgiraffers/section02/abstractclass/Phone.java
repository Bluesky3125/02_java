package com.ohgiraffers.section02.abstractclass;

public class Phone extends Product {
    public Phone() {
        /* 설명. 추상 클래스인 부모 클래스를 일시적으로 객체화해서 자식 클래스가 참조(?)한다. */
        super();
    }

    @Override
    public void abstractMethod() {
        System.out.println("안 뺴먹고 오버라이딩 완료");
    }
}
