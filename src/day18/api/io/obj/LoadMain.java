package day18.api.io.obj;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class LoadMain {

    static List<Human> humanList = new ArrayList<>();

    public static void main(String[] args) {

        System.out.println("add 전 리스트 크기 : "+ humanList.size());
//        loadTextFile();
        loadObject();
        System.out.println("add 후 리스트 크기 : "+ humanList.size());
        for (Human human : humanList) {
            System.out.println(human);
        }


    }

    // 객체를 리스트에 저장
    private static void loadObject() {

        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("E:/Excersise/human.sav"))) {

            // readObject()는 Object를 리턴하기 때문에 다운캐스팅
            humanList = (List<Human>) ois.readObject();

        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    // 텍스트 파일 불러와서 리스트에 넣기
    static void loadTextFile() {

        try (BufferedReader br = new BufferedReader(new FileReader("E:/Excersise/human.txt"))) {

            String s = "";

            while ((s = br.readLine()) != null) {
//                System.out.println("s = " + s);
                StringTokenizer st = new StringTokenizer(s, ",");
                Human human = new Human(st.nextToken(), Integer.parseInt(st.nextToken()), st.nextToken());
                humanList.add(human);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
