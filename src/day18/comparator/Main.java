package day18.comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Person> pList = new ArrayList<>();
        pList.add(new Person("이우지", 27));
        pList.add(new Person("최승철", 29));
        pList.add(new Person("서명호", 28));
        pList.add(new Person("부승관", 25));

        // 나이 순으로 오름차 정렬(나이 작은 사람부터
//        pList.sort(new AgeAscendingcomparator());

        // 익명 함수로 나이 오름차 정렬 만들기
        pList.sort(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge() - o2.getAge();
            }
        });
        for (Person person : pList) {
            System.out.println(person);
        }

        System.out.println("===================");
        // 람다 함수로 나이 내림차 정렬 만들기
        pList.sort((o1, o2) -> o2.getAge() - o1.getAge());
        for (Person person : pList) {
            System.out.println(person);
        }
        System.out.println("===================");
        // 이름 오름차 정렬
        pList.sort(new NameAscendingcomparator());
        for (Person person : pList) {
            System.out.println(person);
        }
        System.out.println("===================");
        // 이름 내림차 정렬
        pList.sort(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o2.getName().compareTo(o1.getName());
            }
        });
        for (Person person : pList) {
            System.out.println(person);
        }
        System.out.println("===================");
        pList.sort((o1, o2) -> o2.getName().compareTo(o1.getName()));
        for (Person person : pList) {
            System.out.println(person);
        }

    }
}
