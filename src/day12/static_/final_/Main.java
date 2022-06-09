package day12.static_.final_;

public class Main {
    public static void main(String[] args) {
        Korean park = new Korean("박철수", "111-111");
        Korean kim = new Korean("김길동", "222-222");

        park.name = "박찬호";
//        park.id = "333-333";  >> private도 final도 접근 불가
//        kim.nation = "중국";

        System.out.println(park);
        System.out.println(kim);
    }
}
