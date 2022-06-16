package day17.collection.list;

// 컬렉션 api는 util 패키지에 있기 때문에 요렇게 하면 쉽게 쓸 수 있다
import java.util.*;

public class ListExample {
    public static void main(String[] args) {

        // List는 인터페이스, List를 임플리먼츠하고 있는 클래스를 생성해야 함
//        List sList = new List();

        // LinkedList나 ArrayList나 List를 임플리먼츠하고 있기 때문에 메서드 이름을 공유한다
        LinkedList<Object> linkedList = new LinkedList<>();

        // 배열 리스트 생성 = 초기 생성시 10개 공간이 주어지고
        // 데이터 추가시 동적으로 늘어남
        // 장점: 탐색이 빠르다
        // 단점: 배열과 마찬가지 (중간 삽입, 중간 삭제가 실제 배열에 삽입, 삭제하는 것이 느리다)
        ArrayList<String> arrayList = new ArrayList<>();

        // add(E e): 리스트의 맨 끝에 객체를 추가
        // 리스트계열은 중복데이터 저장이 가능
        arrayList.add("멍멍이");
        arrayList.add("명명이");
        arrayList.add("냥냥이");
        arrayList.add("야옹이");
        arrayList.add("야옹이");
        arrayList.add("왈왈이");
        arrayList.add("컹컹이");
        arrayList.add("멍멍이");

//        System.out.println(arrayList.toString());  // toString() 생략 가능
        System.out.println(arrayList);

        // size() : 저장된 객체의 수 리턴
        int size = arrayList.size();
        System.out.println("size = " + size);

        // add(int index, E e) : 데이터 중간 삽입
        arrayList.add(2, "추가추가");
        System.out.println("idx 2번에 add : " + arrayList);

        // set(index, obj) : 객체 수정
        arrayList.set(3, "수정수정");
        System.out.println("idx 3번에 set : " + arrayList);

        // remove(index), remove(obj) : 객체 삭제
        arrayList.remove(1);
        boolean s1 = arrayList.remove("추가추가");
        System.out.println("idx 1번, 추가추가 remove : " + arrayList);

        // get(index) : 객체 참조
        String s2 = arrayList.get(2);
        System.out.println("2번 인덱스 get = " + s2);

        // indexOf(obj) : 저장된 객체의 인덱스를 리턴, 없으면 -1
        int idx = arrayList.indexOf("멍멍이");
        System.out.println("멍멍이 indexOf = " + idx);

        // contains(obj) : 객체의 저장 유무 확인
        boolean s3 = arrayList.contains("귀뚤이");
        System.out.println("귀뚤이 contains = " + s3);
        boolean s4 = arrayList.contains("왈왈이");
        System.out.println("왈왈이 contains = " + s4);

        // list의 루프 처리
        System.out.println("========================");
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.print(arrayList.get(i) + " ");
        }
        System.out.println("\n========================");
        for (String s : arrayList) {
            System.out.print(s + " ");
        }
        System.out.println("\n========================");

        // clear() : 리스트 내부 전체 삭제
        arrayList.clear();
        System.out.println("전체 삭제  : " + arrayList);
        System.out.println("전체 삭제  : " + arrayList.size());
        System.out.println("전체 삭제  : " + arrayList.isEmpty());

        System.out.println("\n========================");

        // 초기값을 가진 리스트 생성
        // ex) int[] arr = {1, 2, 3}
        ArrayList<Integer> numbers = new ArrayList<>(
            Arrays.asList(10, 20, 30, 5, 58, 2)
        );
        System.out.println(numbers);

//        Integer[] objects = (Integer[]) numbers.toArray();

        // 오름차 정렬
        numbers.sort(Integer::compareTo);
        System.out.println(numbers);

        // 내림차 정렬
        numbers.sort(Comparator.reverseOrder());
        System.out.println(numbers);

        System.out.println("\n========================");
        // 2차원 리스트
        List<List<Integer>> list2d = new ArrayList<>();
        // 2차원 리스트에 1차원 리스트를 추가
        list2d.add(new ArrayList<>());
        list2d.add(new ArrayList<>(Arrays.asList(10, 20, 30)));
        list2d.add(new ArrayList<>(Arrays.asList(30, 40, 50)));

        // 2차원 리스트의 1차원 리스트에 정수 추가
        list2d.get(0).add(10);

        // 2차원 리스트 데이터 출력
        for (List<Integer> list : list2d) {
            for (int n : list) {
                System.out.print(n + " ");
            }
            System.out.println();
        }


    }
}
