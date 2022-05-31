package com.kh.practice.student.view;

import com.kh.practice.student.controller.StudentController;
import com.kh.practice.student.model.vo.Student;

public class StudentMenu {
    private StudentController ssm;

//

    public StudentMenu() {
        System.out.println("========== 학생 정보 출력 ==========");
        ssm = new StudentController();

        Student[] students = ssm.printStudent();
        for (Student s : students) {
            System.out.println(s.inform());
        }

        double[] scores = ssm.avgScore();
        System.out.println("========== 학생 성적 출력 ==========");
        System.out.printf("학생 점수 합계: %d\n", (int)scores[0]);
        System.out.printf("학생 점수 평균: %.2f\n", scores[1]);

        System.out.println("========== 학생 결과 출력 ==========");
        for (Student s : students) {
            if(s.getScore() > StudentController.CUT_LINE){
                System.out.printf("%s 학생은 통과입니다.\n", s.getName());
            }
        }

    }
}
