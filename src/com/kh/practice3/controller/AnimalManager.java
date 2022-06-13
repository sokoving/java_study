package com.kh.practice3.controller;

import com.kh.practice3.model.vo.Animal;
import com.kh.practice3.model.vo.Cat;
import com.kh.practice3.model.vo.Dog;

public class AnimalManager {
    public static void main(String[] args) {

        Animal[] animals = new Animal[5];
        animals[0] = new Dog("멍멍", "히히", 3);
        animals[1] = new Cat("야옹", "히히", "거기", "턱시도");
        animals[2] = new Cat("냥냥", "히히", "저기", "카오스");
        animals[3] = new Dog("명명", "히히", 3);
        animals[4] = new Cat("먕먕", "히히", "멀리", "치즈태비");


        for (Animal animal : animals) {
            animal.speak();
        }
    }
}
