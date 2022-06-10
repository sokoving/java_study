package com.kh.practice.chap01_poly.model.vo;

public class AniBook extends Book {
    private int accessAge; // 제한 나이

    public AniBook(){}

    public AniBook(String title, String author, String publisher, int accessAge) {
        super(title, author, publisher);
        this.accessAge = accessAge;
    }

    @Override
    public String toString() {
        return String.format("AniBook [%s, accessAge=%d]", super.toString(), accessAge);
    }

    //getter

    public int getAccessAge() {
        return accessAge;
    }
}