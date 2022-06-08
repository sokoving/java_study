package com.kh.hw.person.controller;


import com.kh.hw.person.model.vo.Employee;
import com.kh.hw.person.model.vo.Person;
import com.kh.hw.person.model.vo.Student;

public class PersonController {
    private Student[] s = new Student[3];
    private Employee[] e = new Employee[10];

    public PersonController() {
        s[0] = new Student("강건강", 20, 178.2, 70.0, 1, "정보시스템공학과");
        s[1] = new Student("남나눔", 21, 187.3, 80.0, 2, "경영학과");
        s[2] = new Student("류라라", 23, 167.0, 45.0, 4, "정보통신공학과");

        e[0] = new Employee("박보배", 26, 180.3, 72.0, 100000000, "영업부");
        e[1] = new Employee("송성실", 38, 182.0, 76.0, 200000000, "기획부");

    }

    // 객체배열에 저장된 객체의 수를 정수배열에 담아 반환하는 메서드
    public int[] personCount(){
        int[] count = new int[2];
        // 학생 배열에 있는 학생 수
        for (int i = 0; i <s.length ; i++) {
            if (s[i] != null ) {
                count[0] = i+1;
            } else {
                break;
            }
        }
        // 직원 배열에 있는 직원 수
        for (int i = 0; i <e.length ; i++) {
            if (e[i] != null ) {
                count[1] = i+1;
            } else {
                break;
            }
        }
        return count;
    }


    // 매개변수로 받아온 데이터를 학생 객체 배열 중 빈 곳에 저장하는 메소드
    public void insertStudent (String name, int age, double height, double weight, int grade, String major){
        Student newStu = new Student(name, age, height, weight, grade, major);
        int sutCount = personCount()[0];
        if (sutCount != s.length) {
            s[sutCount] = newStu;
        }
    }

    // 학생 객체 배열의 주소를 반환하는 메소드
    public Student[] printStudent(){
        return s;
    }

    // 매개변수로 받아온 데이터를 사원 객체 배열 중 빈 곳에 저장하는 메소드
    public void insertEmployee(String name, int age, double height, double weight, int salary, String dept){
        Employee newEmp = new Employee(name, age, height, weight, salary, dept);
        for (int i = 0; i <e.length; i++) {
            if (e[i] == null ){
                e[i] =  new Employee(name, age, height, weight, salary, dept);
                return;
            }
        }
    }

    public Employee[]  printEmployee(){
        return e;
    }


}
