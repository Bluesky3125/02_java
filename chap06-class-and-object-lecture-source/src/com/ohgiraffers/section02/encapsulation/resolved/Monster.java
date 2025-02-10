package com.ohgiraffers.section02.encapsulation.resolved;

public class Monster {
    private String name;    // 정보 은닉의 한 종류
    private int hp;

    public void setInfo1(String info1) {
        this.name = info1;
    }

    public void setInfo2(int info2) {
        this.hp = info2;
    }
}
