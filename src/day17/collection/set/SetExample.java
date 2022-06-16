package day17.collection.set;

import utill.Utill;

import java.util.*;

public class SetExample {
    public static void main(String[] args) {

        // Set
        // 중복저장 안 됨
        // 순서 무시하고 빨리 넣은 수 있는 것부터 저장 >> 데이터 삽입 속도가 빠름
        // 수정 안 됨(삭제하고 추가해야 한다)
        TreeSet<Object> objects = new TreeSet<>();  // 정렬이 필요할 때
        HashSet<String> set = new HashSet<>();

        // add(E e) : 객체 추가
        boolean b1 = set.add("김말이");
        set.add("닭꼬치");
        set.add("단무지");
        boolean b2 = set.add("김말이");
        boolean b3 = set.add("김밥");

        Utill.msgLine("set의 add는 논리값을 리턴한다");
        System.out.println("b1(성공) = " + b1 + " | b2(실패) = " + b2 + " | b3(성공) = " + b3);

        System.out.println("set의 size : " + set.size()); // 4
        System.out.println("set의 toString : " + set);

        // set의 루프 처리
        // iterable을 상속받는 컬렉션은 iter 루프를 사용할 수 있다
        Utill.msgLine("set의 iter");
        for (String s : set) {
            System.out.print(s + " ");
        }

        // remove(obj) : 객체 삭제
        set.remove("단무지");
        System.out.println("\nset의 remove : " + set);
        set.clear();
        System.out.println("set의 clear 후 isEmpty : " + set.isEmpty());

        Utill.msgLine("중복 값은 거르고 set에 저장");
        List<Integer> numberList = new ArrayList<>(
                Arrays.asList(2,2,2,4,5,5,6,6,6,9,9));
        System.out.println("numList에는 중복 저장이 된다 : " + numberList);
        Set<Integer> numberSet = new HashSet<>();
        numberSet.addAll(numberList);
        System.out.println("numSet에 numlist를 addAll : " + numberSet);
        numberList.clear();
        numberList.addAll(numberSet);
        System.out.println("numList를 clear 후 numSet를 addAll : "+ numberList);



    }
}
