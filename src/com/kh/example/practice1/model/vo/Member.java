package com.kh.example.practice1.model.vo;
// 패키지 이름을 길게 하면 클래스 이름이 같아도 구분할 수 있음
//com.kh : group id (우리 회사 도메인을 거꾸로 쓴다 > 우리 회사 클래스야~)

public class Member {

    String memberId;
    String memberPwd;
    String memberName;
    int age;
    char gender;
    String phone;
    String email;

    public Member() {}

    public void changeName(String name){
        memberName = name;
    }

    public void printName(){
        System.out.printf("이름: %s\n", memberName);
    }
}
