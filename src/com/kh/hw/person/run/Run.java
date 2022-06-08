package com.kh.hw.person.run;

import com.kh.hw.person.controller.PersonController;
import com.kh.hw.person.model.vo.Employee;
import com.kh.hw.person.model.vo.Student;

public class Run {
    public static void main(String[] args) {

        PersonController pc = new PersonController();

        System.out.println(pc.personCount().toString().toString());
        pc.insertStudent("류라라", 23, 167.0, 45.0, 4, "정보통신공학과");

        System.out.println(pc.personCount().toString());

//        System.out.println(pc.printStudent()[2].toString());

    }
}
