package day18.api.io.buffer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderExample {

    public static void main(String[] args) {

        // Buffered~ 는 보조 스트림이라 핵심 기능을 하는 스트림과 결합해야 한다
        // new BufferedReader()의 Reader 타입을 매개변수로 받는다
            // Reader는 추상 클래스라 객체 생성 못하고  Reader 클래스를 상속받고 있는
            // InputStreamReader를 매개변수에 넣을 수 있다.
        // InputStreamReader()는 InputStream 타입을 매개변수로 받는다
            // in은 InputStream 타입
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){

            String s = br.readLine();
            System.out.println(s);


        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

}
