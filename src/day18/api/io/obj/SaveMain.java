package day18.api.io.obj;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class SaveMain {

        static List<Human> humanList = new ArrayList<>();

    public static void main(String[] args) {

        humanList.add(new Human("이우지", 27, "부산시 사하구"));
        humanList.add(new Human("최승철", 28, "서울시 강남구"));
        humanList.add(new Human("부승관", 25, "제주시 제주읍"));


        // 객체 세이브 기능
            // 객체를 파일에 저장하려면 객체를 직렬화해야 하는데
            // Human 클래스에 Serializable 인터페이스를 구현해야 한다.
        saveOjbect();

        // 세이브 기능
//        saveTextFile();

    }
    // 객체 세이브 기능
    static void saveOjbect() {

        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("E:/Excersise/human.sav"))){

            oos.writeObject(humanList);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    // 원시 세이브 기능
    static void saveTextFile(){
        try(FileWriter fw = new FileWriter("E:/Excersise/human.txt")){

            StringBuilder sb = new StringBuilder();
            for (Human human : humanList) {
                fw.write(String.format("%s,%d,%s\n", human.getName(),human.getAge(), human.getAddress()));
            }
            System.out.println("출력 종료");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
