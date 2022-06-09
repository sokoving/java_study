package datastructure.chap05.queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueJavaApi {

    public static void main(String[] args) {
        // 큐 생성
        Queue<Integer> queue = new LinkedList<>();

        // 큐에 데이터 넣기
        for (int i = 1; i <= 5; i++) {
            queue.add(i*3);
        }

        // 큐의 사이즈 제공
        System.out.println("큐에 저장된 개수: " + queue.size());

        // 큐에서 하나 삭제
        int removed = queue.poll();

        // 큐 전체 보기
        System.out.println("removed = " + removed);
        System.out.println(queue.toString());

        // 전체 삭제
        while (!queue.isEmpty()){
            System.out.print(queue.poll() + " ");
        }
        System.out.println();
        System.out.println("큐에 저장된 개수: " + queue.size());
        System.out.println(queue.toString());


    }


}