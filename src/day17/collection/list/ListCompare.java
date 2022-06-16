package day17.collection.list;


import java.util.ArrayList;
import java.util.LinkedList;

public class ListCompare {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();
        LinkedList<Integer> linked = new LinkedList<>();

        for (int i = 0; i < 100000; i++) {
            array.add(i);
            linked.add(i);
        }

        // 배열 리스트에서 데이터 제어
        long sA, eA; // 시작 시간, 끝 시간
        sA = System.currentTimeMillis();

        int len = array.size();
        for (int i = 0; i < len; i++) {
//            array.remove(0);
            array.get(i);
        }

        eA = System.currentTimeMillis();

        System.out.println("배열리스트 소요 시간 : " + (eA-sA));

        System.out.println("==========================================");

        // 연결리스트에서 데이터 제어
        long sL, eL; // 시작 시간, 끝 시간
        sL = System.currentTimeMillis();

        len = linked.size();
        for (int i = 0; i < len; i++) {
//            linked.remove(0);
            linked.get(i);
        }

        eL = System.currentTimeMillis();

        System.out.println("연결리스트 소요 시간 : " + (eL-sL));


        /*
        시간 기록   배열리스트   연결리스트
        삭제          672         0
        검색          0           3531

         */
    }

}
