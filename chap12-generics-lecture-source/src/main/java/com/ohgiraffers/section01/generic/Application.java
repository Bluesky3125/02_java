package com.ohgiraffers.section01.generic;

import java.util.Date;

public class Application {
    public static void main(String[] args) {

        /* 수업목표. 제네릭(generic)에 대해 이해할 수 있다. */
        MyGenericTest mgt = new MyGenericTest();

        mgt.setValue("Hello World");
        mgt.setValue(1);
        mgt.setValue(3.14);
//        mgt.setValue(new Date());

        System.out.println(mgt.getValue().toString());
        System.out.println(mgt.getValue());
        double dNum = (Double) mgt.getValue();      //  런타임 에러 발생

//        GenericTest<Double> gt1 = new GenericTest<Double>();
        GenericTest<Double> gt1 = new GenericTest<>();  // 다이아몬드 연산자는 한번만 타입까지 작성하면 된다.
        gt1.setValue(1.0);    // 타입의 안정성이 높다.(다이아몬드 연산자 안 참조 자료형을 위반하지 않는다.
        double dNNum = gt1.getValue();     // 다이아몬드 연산자 안의 참조 자료형을 반환하게 되는 것을 확인할 수 있다.

        /* 설명.
        *   제네릭 클래스는 다양한 자료형으로 변할 수 있어 클래스 하나만으로 활용 가치가 높아진다.(구현의 편의성)
        *   매개변수나 반환형도 제네릭 타입으로 지정되어 명확히 해당 타입에 대해 처리할 수 있다.(타입의 안정성)
        * */
    }
}
