package com.ohgiraffers.section04.constructor;

public class User {
    /* 설명. 속성(필드) */
    private String id;
    private String pwd;
    private String name;
    private java.util.Date enrollDate /*= new java.util.Date()*/;

    /* 설명. 기본 생성자(매개변수가 없는)를 활용한 객체 생성
    *   반드시 명시적으로 쓰자!(자동으로 생성해주지 않을 수 있다.)
    *   매개변수 있는 생성자 등을 따로 만들면 기본 생성자를 생성해주지 않음.
    *  */
    public User() {
        /* 설명. 생성자: 반환형이 없는 메소드 형태 */
        System.out.println("기본 생성자 호출");
    }

    /* 설명. 원하는 필드를 초기화하기 위한 매개변수 있는 생성자를 활용해 객체를 생성할 수 있다. */
    public User(String id, String pwd, String name) {
        System.out.println("매개변수 3개 있는 생성자 호출");

        /* 설명. 생성자 안에서의 this.은 이 생성자로 만들어질 객체에 접근하는 것이다.
        *   매개변수와 클래스의 필드 명이 같다면 this.를 생략할 수 없다. 생략 시 서로를 구분할 수 없다.
        *  */
        this.id = id;
        this.pwd = pwd;
        this.name = name;
    }

    public User(String id, String pwd, String name, java.util.Date enrollDate) {
//        this.id = id;
//        this.pwd = pwd;
//        this.name = name;

        /* 설명. 기존에 생성된 생성자를 호출 */
        /* 설명. this()는 항상 첫 줄에 작성되어야 하며 2개 이상 작성할 수 없다. */
        this(id, pwd, name);

        this.enrollDate = enrollDate;
    }

    public String information() {
        return "id: " + this.id + ", pwd: " + this.pwd + ", name: "
               + this.name + ", enrollDate: " + this.enrollDate;
    }
}
