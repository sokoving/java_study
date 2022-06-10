package com.kh.practice.chap01_poly.controller;

import com.kh.practice.chap01_poly.model.vo.*;

import java.util.LinkedList;
import java.util.Queue;

public class LibraryController {
    private Member mem; // 회원 정보 (null로 명시초기화)
    private Book[] bList; // 모든 책 정보 (크기 5 할당)

    // 필요한 상수 선언
    public static final int RENT_FAIL = 1;
    public static final int RENT_SUCCESS = 0;
    public static final int RENT_SUCCESS_WITH_COUPON = 2;


    public LibraryController() {
        mem = null;
        bList = new Book[5];
        bList[0] = new CookBook("백종원의 집밥", "백종원", "tvN", true);
        bList[1] = new AniBook("한번 더 해요", "미티", "원모어", 19);
        bList[2] = new AniBook("루피의 원피스", "루피", "japan", 12);
        bList[3] = new CookBook("이혜정의 얼마나 맛있게요", "이혜정", "문학", false);
        bList[4] = new CookBook("최현석 날 따라해봐", "최현석", "소금책", true);
    }

//----------메서드-------------//
    // 전달받은 mem 주소값을 통해 LibraryController의 mem에 대입
    public void insertMember(Member mem) {
        this.mem = mem;
    }

    // 회원 레퍼런스(mem) 주소값 리턴
    public Member myInfo() {
        return this.mem;
    }

    // 도서 전체 목록 (bList) 주소값 리턴
    public Book[] selectAll(){
        return this.bList;
    }

    // 전달받은 키워드가 들어간 책을 Book[]에 담아 리턴
    public Book[] searchBook(String keyword){

    // Queue를 이용하는 방법
        // 검색된 책들을 담아둘 큐를 생성
        Queue<Book> bookQueue = new LinkedList<>();
        // 책 검색 시작
        for (Book book : bList) {
            if(book.getTitle().contains(keyword)){
                bookQueue.add(book);
            }
        }
        // 큐에 담아뒀던 책들을 북배열에 넣기
        Book[] searchedList = new Book[bookQueue.size()];
        for (int i = 0; i < searchedList.length; i++) {
            searchedList[i] = bookQueue.poll();
        }

        return searchedList;

/*        Book[] tempBList = new Book[bList.length];
        int count = 0; // keyBooks에 책이 추가될 때마다 count++;
        for (int i = 0; i < bList.length ; i++) {
            if (bList[i].getTitle().contains(keyword)){
                tempBList[count++] = bList[i];
            }
        }
        Book[] keyBList = new Book[count];
        for (int i = 0; i < count; i++) {
            keyBList[i] = tempBList[i];
        }
        return keyBList;
*/
    }

    // 빌릴 책이 애니책이면 1 리턴, 요리책이면 mem의 쿠폰카운트++ 하고 2 리턴
    public int rentBook(int index){

// 상수를 사용한 경우
        Book book = bList[index];
     // 책 정보 판단
        // AniBook일 경우
        if (book instanceof AniBook){
            // 나이 검사
            AniBook aniBook = (AniBook) book;
            if (aniBook.getAccessAge() <= mem.getAge()){
                //만화책을 빌릴 수 있는 경우
                return RENT_SUCCESS;
            }
        }
        // CookBook일 경우
        else if (book instanceof CookBook) {
            CookBook cookBook = (CookBook) book;
            if (cookBook.isCoupon()){
                // 쿠폰 제공하는 경우
                mem.setCouponCount(mem.getCouponCount() +1);
                return RENT_SUCCESS_WITH_COUPON;
            } else {
                return RENT_SUCCESS;
            }
        }
        return RENT_FAIL;

/*
        int result = 0;
        if(bList[index] instanceof AniBook){
            if (this.mem.getAge() < ((AniBook)bList[index]).getAccessAge()){
                result = 1;
            }
        } else if (bList[index] instanceof CookBook) {
            if(((CookBook) bList[index]).isCoupon()) {
                int count = mem.getCouponCount() + 1;
                mem.setCouponCount(count);
                result = 2;
            }
        }
        return result;
*/

    }


}// end class LibraryController
