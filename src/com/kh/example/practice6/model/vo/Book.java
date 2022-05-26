package com.kh.example.practice6.model.vo;

public class Book {
    // 필드
    String title;
    String publisher;
    String author;
    int price;
    double discountRate;

    // 생성자
    public Book() {

    }

    public Book(String bTitle, String bPublisher, String bAuthor) {
        title = bTitle;
        publisher = bPublisher;
        author = bAuthor;
    }

    public Book(String bTitle, String bPublisher, String bAuthor, int bPrice, double bDiscountRate) {
        title = bTitle;
        publisher = bPublisher;
        author = bAuthor;
        price = bPrice;
        discountRate = bDiscountRate;
    }


    // 메소드
    public void inform() {

        System.out.printf("==== # %s 정보 ====\n", title);
        System.out.println("출판사: " + publisher);
        System.out.println("작가: " + author);
        System.out.println("정가: " + price + "원");
        System.out.printf("할인율: %.2f%%\n", discountRate * 100);

    }

    public boolean checkNull(String value){
        if (value.equals(null)){
            return true;
        } else {
            return false;
        }
    }



}
