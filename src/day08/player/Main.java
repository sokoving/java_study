package day08.player;

public class Main {
    public static void main(String[] args) {

        Player park = new Player("박찬호", 1, 50);
        Player kim = new Player("김철수", 1, 50);
//        System.out.println("park = " + park);
//        System.out.println("kim = " + kim);

        // 인수로 park을 주지 않아도 자동으로 Player this에 들어간다
        park.attack(kim);
        kim.attack(park);
        kim.attack(kim);

        //생성자 호출을 해 인수로 쓸 수 있다(변수 저장X, 재활용 X)
        kim.attack(new Player("냥냥이", 10, 200));

        //생성자 호출과 메서드 실행을 동시에 할 수 있다(변수 저장X, 재활용 X)
        new Player("멍멍이", 10, 300).attack(kim);


    }
}
