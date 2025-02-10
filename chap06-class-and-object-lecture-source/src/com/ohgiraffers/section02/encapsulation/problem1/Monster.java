package com.ohgiraffers.section02.encapsulation.problem1;

public class Monster {
    String name;
    int hp;

    public void setHp(int hp) {
        this.hp = Math.max(hp, 0);
    }
}
