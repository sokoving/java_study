package day16.api.time;

import utill.Utill;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class LocalDateExample {

    public static void main(String[] args) {

        // 현재 날짜 정보 얻기(연, 월, 일)
        LocalDate now = LocalDate.now(); // 운영체제에 설정된 표준시가 기준
        System.out.println("now = " + now);

        // 현재 시간 정보 얻기(시, 분, 초)
        LocalTime nowTime = LocalTime.now();
        System.out.println("nowTime = " + nowTime);

        // 현재 날짜와 시간 정보 얻기(연, 월, 일, 시, 분, 초)
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("localDateTime = " + localDateTime);

        // 특정 날짜와 시간 정보 얻기
        LocalDateTime beginDate = LocalDateTime.of(2022, 7, 1, 9, 0, 0);
        System.out.println("beginDate = " + beginDate);

        Utill.longLine();

        // 연도 추출하기 (다른 타입으로 리턴할 수 있는 메서드도 있다)
        int year = localDateTime.getYear();
        System.out.println("year = " + year);
        int month = localDateTime.getMonthValue();
        System.out.println("month = " + month);
        int week = localDateTime.getDayOfWeek().getValue();
        System.out.println("week = " + week);

        Utill.longLine();

        // 지금으로부터 3일 뒤
        LocalDateTime returnDate = localDateTime.plusDays(3);
        System.out.println("returnDate = " + returnDate);

        // 지금으로부터 1년 2개월 7일 뒤
        LocalDateTime d1 = localDateTime;
        System.out.println("오늘 d1 = " + d1);
        d1 = d1.plusYears(1).plusMonths(2).plusDays(7);
        System.out.println("plus d1 = " + d1);
        d1 = d1.minusYears(1).minusMonths(2).minusDays(7);
        System.out.println("minus d1 = " + d1);

        Utill.longLine();

        // 사이 날짜 연산
        LocalDate b = LocalDate.of(2020, 12, 30);
        LocalDate f = LocalDate.of(2022, 9, 14);
        long between = ChronoUnit.DAYS.between(b, f);
        System.out.println("between = " + between);

        Utill.longLine();

        // 날짜 포맷 변경하기
        System.out.println("localDateTime = " + localDateTime);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yy년 MM월 dd일 a hh시 mm분");
        // 오브패턴 포맷은 해당 문서 주석 가서 보기
        System.out.println(localDateTime.format(dtf));


    }

}
