package com.kh.practice.chap01_poly.model.vo;

public class Book {
    private String title; // 도서명
    private String author; // 저자명
    private String publisher; // 출판사명

    public Book(){}

    public Book(String title, String author, String publisher) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
    }

    @Override
    public String toString() {
        return String.format("Book [title=%s, author=%s, publisher=%s]"
                , title, author, publisher);
    }

    // getter
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }
}
