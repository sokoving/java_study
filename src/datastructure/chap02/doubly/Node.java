package datastructure.chap02.doubly;

// Node : 객체의 주소를 가지고 있는 포인터 변수
//        필드로는 데이터 하나, 다음 노드(주소), 이전 노드(주소)를 가지고 있다.
public class Node {
    // 필드
    private int data; //데이터 저장

    private Node nextNode; // 다음 노드의 주소
    private Node prevNode; // 이전 노드의 주소


    // 생성자
     public Node (int data){
         this.data = data;  // 노드 주소는 다음 데이터가 만들어질 때 초기화
    }


    // setter getter
    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }

    public Node getPrevNode() {
        return prevNode;
    }

    public void setPrevNode(Node prevNode) {
        this.prevNode = prevNode;
    }
}
