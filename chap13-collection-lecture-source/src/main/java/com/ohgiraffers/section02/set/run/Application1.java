package com.ohgiraffers.section02.set.run;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Application1 {
    public static void main(String[] args) {

        /* 수업목표. Set 자료구조의 특성을 이해하고 hashSet을 이용할 수 있다. */
//        HashSet<String> hSet = new HashSet<>();
        Set<String> hSet = new HashSet<>(); // 다형성 적용

        hSet.add(new String("java"));
        hSet.add(new String("mariaDB"));
        hSet.add(new String("servlet"));
        hSet.add(new String("spring"));
        hSet.add(new String("html"));

        /* 설명. Set에 저장된 자료는 넣는 순서를 보장할 수 없다.(넣는 순서와 다르다.)*/
        /* 설명. 넣은 순서는 보장하지 않지만, 알고리즘 상 순서가 정해져 있다.(HashCode 순)*/
        System.out.println("HashSet에 저장된 값: " + hSet);

        /* 설명. 중복되는 데이터 추가(feat. 중복은 동등 객체를 말한다.) */
        hSet.add(new String("mariaDB"));

        System.out.println("mariaDB를 가진 String 추가 후: " + hSet);
        System.out.println();

        /* 설명. Set은 인덱스 개념이 없어 Iterator(반복자)를 활용해야 한다. */
        Iterator<String> iter = hSet.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
        System.out.println();

        /* 설명. Set을 배열로 바꿀 수는 있다.(권장하지 않음) */
        Object[] arr = hSet.toArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.println((String)arr[i]);
        }
        System.out.println();

        System.out.println("size(): " + hSet.size());
        hSet.clear();
        System.out.println("size(): " + hSet.size());
        System.out.println("isEmpty(): " + hSet.isEmpty());
    }
}
