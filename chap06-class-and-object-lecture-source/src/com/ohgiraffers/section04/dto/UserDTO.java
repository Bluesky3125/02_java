package com.ohgiraffers.section04.dto;

/* 설명. DTO(Data Transfer Object)
*   자바빈(Java Bean)이란?
*    JSP에서 사용되는 표준 액션 태그로 접근할 수 있게 만든 자바 클래스 형태이다.
*    자바 코드를 모르는 웹 퍼블리셔들도 자바 코드를 사용할 수 있도록 태그 형식으로 지원하는 문법을
*    의미하는데, 그 때 사용할 수 있도록 규칙을 지정해 놓은 java 클래스를 자바빈(java bean)이라고 부른다.
*    지금은 특정 목적 및 프레임워크를 위해 클래스를 작성하는 규칙이라고 보면 된다.
* */

/* 설명.
*   자바빈 작성 규칙
*   1. 자바빈은 특정 패키지에 속해 있어야 함(default 패키지 사용 금지)
*   2. 필드의 접근 제어자는 private로 선언해야 함(캡슐화 적용)
*   3. 기본 생성자가 명시적으로 존재해야 한다(매개변수 있는 생성자는 선택사항)
*   4. 모든 필드에 접근 가능한 설정자(setter)와 접근자(getter)가 public으로 작성되어 있어야 함
*   5. 직렬화(Serializable) 구현을 고려해야 한다.(선택사항)
* */

public class UserDTO {
    private String id;
    private String pwd;
    private String name;
    private java.util.Date enrollDate;

    public UserDTO() {
    }

    public UserDTO(String id, String pwd, String name, java.util.Date enrollDate) {
        this.id = id;
        this.pwd = pwd;
        this.name = name;
        this.enrollDate = enrollDate;
    }

    /* 설명. getter와 setter는 특정 목적을 위해 필요함(타 프레임워크 등에서 사용),
    *   백엔드에서는 쓰지 않는 것을 권장, 사용 시 캡슐화의 의미가 사라짐.
    * */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public java.util.Date getEnrollDate() {
        return enrollDate;
    }

    public void setEnrollDate(java.util.Date enrollDate) {
        this.enrollDate = enrollDate;
    }

    @Override
    public String toString() {
        return "UserDTO{" +
                "id='" + /*this.*/id + '\'' +
                ", pwd='" + pwd + '\'' +
                ", name='" + name + '\'' +
                ", enrollDate=" + enrollDate +
                '}';
    }
}
