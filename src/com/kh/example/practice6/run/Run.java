package com.kh.example.practice6.run;

import com.kh.example.practice6.model.vo.Book;

public class Run {
    public static void main(String[] args) {

        Book run1 = new Book();
        run1.inform();

        Book run2 = new Book("run2", "sl아카데미", "C.yw");
        run2.inform();

        Book run3 = new Book("run3", "sl아카데미", "C.yw", 10000, 0.4);
        run3.inform();

        Book run4 = new Book();


    }
}
