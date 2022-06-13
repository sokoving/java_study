package day14.abs.pet;

public class Cat extends Pet {

    public Cat(String name, String kind, int age) {
        super(name, kind, age);

    }

    public void sleep(){
        System.out.println("고양이: 잠 잔다. ");
    }


    @Override
    public void feed() {
        System.out.println("고양이 밥 먹언");
    }

    @Override
    public void takeNap() {
        System.out.println("고양이 자");

    }

}
