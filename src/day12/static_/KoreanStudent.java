package day12.static_;

public class KoreanStudent {
    String major;
    static String nation;

    void askMajor(){

    }
    static void askNation(){

    }

    public static void main(String[] args) {

        KoreanStudent.askNation();

        KoreanStudent a = new KoreanStudent();
        a.askMajor();

    }
}
