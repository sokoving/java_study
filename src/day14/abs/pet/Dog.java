package day14.abs.pet;

public class Dog extends Pet{

    public Dog(String name, String kind, int age) {
        super(name, kind, age);
    }


    // 낮잠 자는 기능 오버라이딩을 잊었다
    // 밥 먹는 기능을 오버라이딩 함(시그니처 다르게 함)
    public void eat(){
        System.out.println("강아지 : 밥 먹음");
    }


    @Override
    public void feed() {
        System.out.println("강아지 밥 먹어");
    }

    @Override
    public void takeNap() {
        System.out.println("강아지 자");
    }

}
