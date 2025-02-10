package com.ohgiraffers.section05.calendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Application2 {
    public static void main(String[] args) {

        /* 수업목표. java.util.Calendar 클래스 사용법을 이해하고 사용할 수 있다. */
        /* 설명.
        *   Date형 대비 개선점
        *    1. Timezone과 관련된 기능이 추가되었다.
        *    2. 윤년 관련 기능이 내부적으로 추가되었다.
        *    3. 날짜 및 시간 필드 개념을 추가해 불필요한 메소드명을 줄였다.
        * */
        Calendar calendar = Calendar.getInstance();
        System.out.println("calendar = " + calendar);

        Calendar calendar2 = new GregorianCalendar();
        System.out.println("calendar2 = " + calendar2);

        int year = 1987;
        int month = 9 - 1;
        int dayOfMonth = 15;
        int hour = 17;
        int min = 30;
        int second = 0;

        Calendar birthday = new GregorianCalendar(year, month, dayOfMonth, hour, min, second);
        System.out.println("birthday = " + birthday);

        System.out.println("태어난 해: " + birthday.get(Calendar.YEAR));
        System.out.println("태어난 월: " + birthday.get(Calendar.MONTH) + 1);
        System.out.println("태어난 일: " + birthday.get(Calendar.DAY_OF_MONTH) + 1);
        System.out.println("태어난 요일: " + birthday.get(Calendar.DAY_OF_WEEK) + 1);

        String day = "";
        int dayNum = birthday.get(Calendar.DAY_OF_WEEK);
        switch (dayNum) {
            case Calendar.SUNDAY: day = "일"; break;
            case 2: day = "월"; break;
            case 3: day = "화"; break;
            case 4: day = "수"; break;
            case 5: day = "목"; break;
            case 6: day = "금"; break;
            case 7: day = "토"; break;
        }

        System.out.println("내가 태어난 요일은 " + day + "요일이야~");

        System.out.println("AM/PM: " + birthday.get(Calendar.AM_PM));           // 0은 오전, 1은 오후
        System.out.println("hourOfDay: " + birthday.get(Calendar.HOUR_OF_DAY)); // 24시간 체계
        System.out.println("hour: " + birthday.get(Calendar.HOUR));             // 12시간 체계
        System.out.println("minute: " + birthday.get(Calendar.MINUTE));
        System.out.println("second: " + birthday.get(Calendar.SECOND));
    
        /* 설명. SimpleDateFormat 활용*/
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초 E요일");
        String birthdayString = sdf.format(new java.util.Date(birthday.getTimeInMillis()));
        System.out.println("birthdayString = " + birthdayString);
    
    }
}
