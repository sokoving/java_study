package day15.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

// 다중 예외 처리
public class FinallyExample {
    public static void main(String[] args) {
        String[] pets = {"비둘기", "거북이", "달팽이"};

        for (int i = 0; i < 4; i++) {
            try {
                System.out.println(pets[i] + " 살래요");

            } catch (Exception e) {
                System.out.println("애완동물 정보가 더이상 존재하지 않습니다");
            } finally {
                // 예외가 발생하든 발생하지 않든 실행할 코드
                System.out.println("애완동물 좋아요~\n");

                // finally에 보통 쓰는 코드 : db 지키기 위한 종료 작업 등등
                // ex) 데이터베이스 연결 코드, 네트워크 연결 코드, 하드웨어 장치 연결 코드 등등
            }
        }
        System.out.println("프로그램 정상 종료");

        
    }
}
