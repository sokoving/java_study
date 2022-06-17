package day18.api.io.reader_writer;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {
    public static void main(String[] args) {

        try(FileReader fr = new FileReader("E:/Excersise/dog.txt")){

            int data;
            while ((data = fr.read()) != -1){
                System.out.print((char)data);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
