package day19.lambda;

import utill.Utill;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static day19.lambda.Apple.Color.GREEN;
import static day19.lambda.Apple.Color.RED;
import static day19.lambda.Book.Genre.*;
import static day19.lambda.FilteringApple.*;
import static java.util.Comparator.comparing;

public class Main {

    public static void main(String[] args) {

        List<Apple> inventory = new ArrayList<>();
        inventory.add(new Apple(80, GREEN));
        inventory.add(new Apple(125, RED));
        inventory.add(new Apple(110, GREEN));
        inventory.add(new Apple(70, RED));
        inventory.add(new Apple(130, GREEN));

        // try1
        Utill.msgLine("초록색 사과만 필터링");
        List<Apple> greenApples = filteringGreenApple(inventory);

        for (Apple apple : greenApples) {
            System.out.println(apple);
        }

        // try2
        Utill.msgLine("빨간색 사과만 필터링");
        for (Apple redApple : filteringApple(inventory, RED)) {
            System.out.println(redApple);
        }

        // try3
        Utill.msgLine("무게가 100보다 큰 사과만 필터링");
        for (Apple filterApple : filterApples(inventory, new AppleWeightPredicate())) {
            System.out.println(filterApple);
        }
        Utill.msgLine("빨간 사과만 필터링");
        for (Apple filterApple : filterApples(inventory, new AppleColorPredicate())) {
            System.out.println(filterApple);
        }

        // try3 - anonymous
        Utill.msgLine("익명 클래스로 필터링하기");
        System.out.println("--------- weight under 100");
        List<Apple> apples1 = filterApples(inventory, new ApplePredicate() {
            // implemetn ApplePredicate 익명 클래스 만들기
            @Override
            public boolean test(Apple apple) {
                return apple.getWeight() < 100;
            }
        });
        apples1.forEach(System.out::println);

        // 람다로 만들기
        List<Apple> apples2 = filterApples(inventory, a -> a.getWeight() < 100);
        apples2.forEach(System.out::println);

        System.out.println("--------- weight under 100 && RED");
        List<Apple> apples3 = filterApples(inventory, a -> a.getColor() == RED && a.getWeight() <= 100);

        for (Apple apple : apples3) System.out.println(apple);


        Utill.msgLine("종합정리 : 북 리스트");
        List<Book> bookList = new ArrayList<>();
        bookList.add(new Book(5000, MISTERY));
        bookList.add(new Book(12000, ESSAY));
        bookList.add(new Book(9000, COMICS));
        bookList.add(new Book(11000, MISTERY));
        bookList.add(new Book(8000, COMICS));
        bookList.add(new Book(14000, COMICS));
        bookList.add(new Book(4000, ESSAY));

        Utill.msgLine("코믹스만 전부 필터링");
        List<Book> comics = filter(bookList, new Predicate<Book>() {
            @Override
            public boolean test(Book book) {
                return book.getGenre() == COMICS;
            }
        });
        comics.forEach(System.out::println);

        Utill.msgLine("종합정리 : 정수 리스중 짝수만 필터링");
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> filterNums = filter(numbers, i -> i % 2 == 0);
        filterNums.forEach(System.out::println);

        Utill.msgLine("종합정리 : 사과 가벼운 순서로 정렬");
/*
        inventory.sort(new Comparator<Apple>() {
            @Override
            public int compare(Apple a1, Apple a2) {
                return a1.getWeight() - a2.getWeight();
            }
        });
*/
//        inventory.sort((a1, a2) -> a1.getWeight() - a2.getWeight());
//        inventory.sort(comparing(a -> a.getWeight()));

        // 오름차
        inventory.sort(comparing(Apple::getWeight));

        for (Apple apple : inventory) {
            System.out.println(apple);
        }
        Utill.longLine();

        // 내림차
        inventory.sort(comparing(Apple::getWeight).reversed());

        for (Apple apple : inventory) {
            System.out.println(apple);
        }



    }
}

