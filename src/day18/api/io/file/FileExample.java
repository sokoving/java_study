package day18.api.io.file;

import java.io.*;
// 데이터 입출력 API를 담당하는 패키지

public class FileExample {

    // 0. 오타 나면 안 되니까 자주 쓰는 경로는 상수화 해주기
    public static final String ROOT_PATH = "E:/Excersise";

    public static void main(String[] args) {

        // 1. 폴더 생성
        File dir = new File(ROOT_PATH + "/Dir/hello");

        // 1-1. 폴더 생성 명령
     // dir.mkdir(); // make directory : 경로를 찾아가서 폴더 하나 만듬(경로가 없으면 안 만듬)
     // dir.mkdirs(); // make directories : 경로가 없으면 전부 다 만듦
        if(!dir.exists()) dir.mkdirs(); // 그래서 없으면 만들라는 조건식 필요


        // 2.빈 파일 생성
        File file1 = new File(ROOT_PATH + "/file1.txt");
        File file2 = new File(ROOT_PATH + "/file2.txt");
        File file3 = new File(ROOT_PATH + "/file3.txt");

        try {
            // 2-1. 파일 생성 명령 : 폴더가 없으면 에러가 난다
            if(!file1.exists()) file1.createNewFile();
            if(!file2.exists()) file2.createNewFile();
            if(!file3.exists()) file3.createNewFile();
        // 2-2. 예외 처리
        } catch (IOException e) {
            System.out.println("IOException 에러: 폴더를 찾을 수 없습니다. ");
        }

        // 3. 폴더, 파일 정보 읽기
        File exercise  = new File(ROOT_PATH);

        // 3-1. 해당 디렉토리 모든 파일 정보 열기
        File[] files = exercise.listFiles();

        for (File f : files) {
            if (f.isDirectory()) {
                System.out.printf("Directory - 폴더명: %s\n", f.getName());
            } else {
                System.out.printf("File - 파일명: %s, 크기: %d\n", f.getName(), f.length());
            }
        }


    }
}
