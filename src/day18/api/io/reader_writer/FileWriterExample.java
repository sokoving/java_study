package day18.api.io.reader_writer;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
    public static void main(String[] args) {

        try(FileWriter fw = new FileWriter("E:/Excersise/자바수업.txt")){

            String str = "고양이는 고양고양~ 귀여우어어어\n근데 지금 자바 입출력 수업 중";
            fw.write(str);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
