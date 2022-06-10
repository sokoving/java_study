package com.kh.practice.chap01_poly.run;

import com.kh.practice.chap01_poly.controller.LibraryController;
import com.kh.practice.chap01_poly.model.vo.*;
import com.kh.practice.chap01_poly.view.LibraryMenu;
import utill.Utill;

public class Run {

    public static void main(String[] args) {
        LibraryMenu lm = new LibraryMenu();
        lm.mainMenu();
/*
lc 테스트
        LibraryController lc = new LibraryController();

        Utill.msgLine("생성 후 가입");
        lc.insertMember(new Member("박신우", 13, 'F'));

        Utill.msgLine("회원 조회");
        System.out.println(lc.myInfo());

        Utill.msgLine("도서 목록 전체 조회");
        for (Book book : lc.selectAll()) {
            System.out.println(book.toString());
        }

        Utill.msgLine("책 찾기");
        Book[] searchBooks = lc.searchBook("의");
        for (Book searchBook : searchBooks) {
            System.out.println(searchBook.toString());
        }

        Utill.msgLine("책 빌리기");
        int result1 = lc.rentBook(0); // 쿠폰 O
        int result2 = lc.rentBook(3); // 쿠폰 X
        int result3 = lc.rentBook(1); // 대여 실패
        int result4 = lc.rentBook(2); // 대여 성공
        System.out.print(result1+ "  "+ result2+ "  "+ result3+ "  "+ result4+ "  ");

*/


    }

}
