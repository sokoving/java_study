package day15.inter;

public class Rabbit extends Animal implements Pet, Violent {
    // 실제 내용(메서드 기능)은 다르지만 규격이 통일돼 있다
    @Override
    public void eat() {

    }

    @Override
    public void play() {

    }

    @Override
    public void attack(String target) {

    }

    @Override
    public void attack() {

    }
}
