package com.ohgiraffers.section02.extend.run;

import com.ohgiraffers.section02.extend.vo.*;

public class Application2 {
    public static void main(String[] args) {

        /* 수업목표. 와일드카드에 대해 이해할 수 있다. */
        WildCardFarm wildCardFarm = new WildCardFarm();

        Rabbit r = new Rabbit();
        RabbitFarm<Rabbit> rFarm = new RabbitFarm<>(r);
        wildCardFarm.anyType(rFarm);
        /* 위와 아래는 거의 같은 뜻이다. */
        wildCardFarm.anyType(new RabbitFarm<>(new Rabbit()));
        wildCardFarm.anyType(new RabbitFarm<>(new Bunny()));
        wildCardFarm.anyType(new RabbitFarm<>(new DrunkenBunny()));
        System.out.println();

        wildCardFarm.extendsType(new RabbitFarm<>(new Bunny()));
//        wildCardFarm.extendsType(new RabbitFarm<>(new Rabbit()));
//        wildCardFarm.extendsType(new RabbitFarm<>(new DrunkenBunny()));
        System.out.println();

        wildCardFarm.superType(new RabbitFarm<>(new Bunny()));
        wildCardFarm.superType(new RabbitFarm<>(new Rabbit()));
//        wildCardFarm.superType(new RabbitFarm<>(new DrunkenBunny()));
    }
}
