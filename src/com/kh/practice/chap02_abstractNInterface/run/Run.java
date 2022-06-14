package com.kh.practice.chap02_abstractNInterface.run;

import com.kh.practice.chap02_abstractNInterface.controller.PhoneController;

public class Run {
    public static void main(String[] args) {
        PhoneController pc = new PhoneController();

        String[] msgs = pc.method();

        for (String msg : msgs) {
            System.out.println(msg);
            System.out.println();
        }

    }
}
