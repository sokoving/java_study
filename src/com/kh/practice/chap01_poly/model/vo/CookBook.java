package com.kh.practice.chap01_poly.model.vo;

public class CookBook extends Book {
    private boolean coupon; // 요리학원쿠폰유무

    public CookBook(){}

    public CookBook(String title, String author, String publisher, boolean coupon) {
        super(title, author, publisher);
        this.coupon = coupon;
    }

    @Override
    public String toString() {
        return String.format("CookBook [%s, accessAge=%b]", super.toString(), coupon);
    }

    // getter setter

    public boolean isCoupon() {
        return coupon;
    }

}
