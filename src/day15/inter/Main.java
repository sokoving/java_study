package day15.inter;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {

        // 인터페이스도 다형성을 적용할 수 있다
        Dog dog = new Dog();
        Cat cat = new Cat();
        Shark shark = new Shark();
        Tiger tiger = new Tiger();
        BullDog bullDog = new BullDog();
        Rabbit rabbit = new Rabbit();

        Pet[] pets = {dog, cat, bullDog, rabbit};
        for (Pet pet : pets) {
            pet.play();
        }

        Violent[] violents = {rabbit, tiger, shark};
        for (Violent violent : violents) {
            violent.attack();
        }

        // 인터페이스를 통해 객체의 기능을 제한할 수 있다.
        Rabbit tokki = new Rabbit();
        tokki.play();
        tokki.attack();
        Pet dokki = new Rabbit();
        dokki.play();
//      dokki.attack();
        Violent doggi = new Rabbit();
//      doggi.play();
        doggi.attack();

        // 큐와 리스트
        Queue<Integer> queue = new LinkedList<>();
        queue.add(4);
        LinkedList<Integer> list = (LinkedList<Integer>) queue;
        list.add(5);
        list.indexOf(4);




    }
}
