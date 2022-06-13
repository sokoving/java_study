package day14.abs.pet;

import day08.modi.pac2.C;
import jdk.jshell.execution.Util;
import utill.Utill;

public class Main {
    public static void main(String[] args) {


        Dog dog = new Dog("초코", "푸들", 3);
        Cat cat = new Cat("냥냥", "태비", 2);

        dog.feed();
        dog.takeNap();
        Utill.shortline();
        cat.feed();
        cat.takeNap();
    }
}
