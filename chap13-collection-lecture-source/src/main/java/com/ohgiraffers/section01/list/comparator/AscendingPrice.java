package com.ohgiraffers.section01.list.comparator;

import com.ohgiraffers.section01.list.dto.BookDTO;

import java.util.Comparator;

/* 설명. BookDTO에 대해 추가적인 정렬 기준(가격 오름차순)을 위한 클래스 */
/* 설명. 제네릭 타입 생략 시 추가 다운캐스팅 필요 */
public class AscendingPrice implements Comparator<BookDTO> {

    @Override
    public int compare(BookDTO o1, BookDTO o2) {
        return o1.getPrice() - o2.getPrice();
    }
}
