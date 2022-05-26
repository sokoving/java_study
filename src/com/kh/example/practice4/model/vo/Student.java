package com.kh.example.practice4.model.vo;

public class Student {

    // 필드
    int grade;  // 학년
    int classroom;  // 학급
    String name;    // 이름
    double height;  // 키
    char gender;  // 성별

    // 생성자
    public Student() {
    }

    public Student(int sGrade, int sClassroom, String sName, double sHeight, char sGender) {
        grade = sGrade;
        classroom = sClassroom;
        name = sName;
        height = sHeight;
        gender = sGender;
    }

    // 메서드
    public void information() {
        System.out.printf("%d학년 %d반 %s 정보: 키 - %.2fCM, 성별 - %c", grade, classroom, name, height, gender);
    }

}
