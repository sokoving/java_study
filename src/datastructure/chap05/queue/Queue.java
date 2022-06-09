package datastructure.chap05.queue;

public class Queue {

    private QueueNode front; // 맨 앞 노드를 감시
    private QueueNode rear; // 맨 뒤노드를 감시

    public Queue(){
        front = new QueueNode();
        rear = new QueueNode();
    }

    // 큐가 비었는지 확인하는 메서드
    public boolean isEmpty(){
        return front.getLink() == null;
    }

    // 큐에 데이터 추가(rear쪽으로)
    public void add(int item){
        // 새 노드 생성
        QueueNode newNode = new QueueNode();
        newNode.setItem(item); // 새 노드에 자료 저장

        // 링크 연결
        if (isEmpty()) { // 첫번째 노드가 저장되는 경우
            front.setLink(newNode);
            rear.setLink(newNode);
        } else { // 기존 노드에 연결되는 경우
            // 추가되기 전 마지막 노드
            QueueNode lastNode = rear.getLink();
            lastNode.setLink(newNode);
            rear.setLink(newNode);
        }
    }

    // 큐의 데이터 삭제(front 쪽에서)
    public Integer poll(){
        if(isEmpty()){
            System.out.println("Queue is empty.");
            return null;
        } else {
            // 삭제 대상 리턴
            QueueNode dellTarget = front.getLink();

            // front가 삭제 대상 뒤에 있는 노드를 감시
            front.setLink(dellTarget.getLink());

            return dellTarget.getItem();
        }
    }
}
