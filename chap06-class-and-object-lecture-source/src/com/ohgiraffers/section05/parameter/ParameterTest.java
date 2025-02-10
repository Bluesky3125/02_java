package com.ohgiraffers.section05.parameter;

import java.util.Arrays;

public class ParameterTest {
    public void testPrimitiveTypeParameter(int num) {
        num = 10;
        System.out.println("매개변수로 전달받아 수정한 값: " + num);
    }

    public void testPrimitiveArrayTypeParameter(int[] iArr2) {
        iArr2[0] = 100;
        System.out.println("매개변수로 전달받아 수정한 값: "+ Arrays.toString(iArr2));
    }

    public void testClassTypeParameter(Rectangle rectangle) {
        rectangle.calArea();
        rectangle.calRound();
    }

    /* 설명. 가변인자는 넘어온 인자들을 받아내어 배열로 바꿔준다. (가변인자는 맨 뒤에) */
    public void testVariableLengthArrayParameter(String... str) {
        System.out.println("넘어온 인자들 출력: " + Arrays.toString(str));
    }
}
