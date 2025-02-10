package com.ohgiraffers.section03.interfaceImplements;

import java.io.Serializable;

public class Product implements InterProduct, Serializable/*마커 인터페이스: 다른 타입 둘을 하나로 합치는 방법*/
{        // 인터페이스는 다중 구현(상속같은 느낌) 가능
    @Override
    public void nonStaticMethod() {
        System.out.println("InterProduct의 nonStaticMethod 오버라이딩 메소드...");
    }
}
