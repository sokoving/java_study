package day18.api.io.fileIOstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputExample {

    public static void main(String[] args) {

  /*      // 파일 읽으려면 FileInputStream 객체가 필요하다
        // InputStream은 최상위 객체로 추상 클래스, 객체 생성 안 됨
        FileInputStream searchFile = null;
        try {
            searchFile = new FileInputStream("C:/YEOWOON/java_study/src/datastructure/chap08/Search.java");
            int data = 0;
            // read()메서드 한 번에 1byte씩 읽는다
            // 아스키코드로 리턴되며 더이상 읽을 바이트가 없으면 -1 리턴
//            int data = searchFile.read();
//            System.out.println("data = " + (char) data); > p
            while (data != -1) {
                data = searchFile.read();
                System.out.write(data);
            }
        } catch (FileNotFoundException e) {
            System.out.println("파일을 찾을 수 없습니다. ");
        } catch (IOException e) {
            System.out.println("IOException 에러");
        } finally {
            try {
                // FileInputStream 클로징
                if (searchFile != null) searchFile.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }*/


        // try with resource : AutoCloseable 인터페이스가 구현된 객체를 자동 클로즈
        String path = "C:/YEOWOON/java_study/src/datastructure/chap08/Search.java";
        try (FileInputStream searchFile = new FileInputStream(path)) {
            int data = 0;
            while (data != -1) {
                data = searchFile.read();
                System.out.write(data);
            }
        } catch (FileNotFoundException e) {
            System.out.println("파일을 찾을 수 없습니다. ");
        } catch (IOException e) {
            System.out.println("IOException 에러 : 입출력할 수 없습니다");
        }


    }

}
