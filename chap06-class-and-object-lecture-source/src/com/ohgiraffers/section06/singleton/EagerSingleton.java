package com.ohgiraffers.section06.singleton;

/* 설명.
*   1개만 있어도 OK
*   리소스가 많이 드는 객체
* */

public class EagerSingleton {
    private static EagerSingleton eager = new EagerSingleton();

    private EagerSingleton() {
    }

    public static EagerSingleton getInstance() {
        return eager;
    }
}
