package com.ohgiraffers.section02.extend.vo;

public class RabbitOnlyFarm<T> {
    private T rabbit;

    public RabbitOnlyFarm() {
    }

    public RabbitOnlyFarm(T rabbit) {
        this.rabbit = rabbit;
    }

    public T getRabbit() {
        return rabbit;
    }

    public void setRabbit(T rabbit) {
        this.rabbit = rabbit;
    }
}
