package com.ohgiraffers.section01.extend;

public class Car extends Object{    // 모든 객체는 Object를 부모로 가진다.

    private boolean runningStatus;      // 주행 상태

    public Car() {
        super();
        System.out.println("부모 클래스의 기본 생성자 호출됨...");
    }

    public void soundHorn() {
        if (runningStatus) System.out.println("빵! 빵!");
        else System.out.println("주행 중이 아니라면 경적을 울릴 수 없습니다.");
    }

    public void run() {
        runningStatus = true;
        System.out.println("자동차가 달리기 시작합니다.");
    }

    public void stop() {
        runningStatus = false;
        System.out.println("자동차가 멈춥니다!");
    }
}
