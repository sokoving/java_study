package day18.api.io.fileIOstream;

import day18.api.io.file.FileExample;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputExample {

    public static void main(String[] args) {

        // 파일 출력
        String path = FileExample.ROOT_PATH;
        try(FileOutputStream fos = new FileOutputStream(path+ "/dog.txt")){

            String msg = "멍멍이는 말랑말랑 귀여워~\n나만 강아지 없어~";

            // write는 바이트 기반 입력, String인 msg는 byte로 변환해 줘야 한다
            // 텍스트 저장할 때는 reader/writer 쓰자
            fos.write(msg.getBytes());


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
