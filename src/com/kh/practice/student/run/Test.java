package com.kh.practice.student.run;

import com.kh.hw.member.controller.MemberController;
import com.kh.hw.member.model.vo.Member;

public class Test {
    public static void main(String[] args) {

        MemberController mc = new MemberController();

        Member[] ms = mc.printAll();


        Member[] a = mc.searchName("김철수");

        System.out.println(a[0].inform());




    }
}
