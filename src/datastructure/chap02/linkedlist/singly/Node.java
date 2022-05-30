package datastructure.chap02.linkedlist.singly;

// 정수 저장 리스트의 노드
public class Node {

    private int data;     // 노드에 저장할 자료
    private Node nextNode;   // 다음 노드의 주소를 저장할 포인터

//    생성자
    public Node(int data){
        this.data = data;
    }

//    메서드
    public int getData() {                      //노드에 저장된 데이터를 가져오는 메서드
        return data;
    }
    public void setData(int data) {            //노드에 저장된 데이터를 가져오는 메서드
        this.data = data;
    }
    public Node getNextNode() {               //다음 노드의 주소를 가져오는 메서드
        return nextNode;
    }
    public void setNextNode(Node nextNode) {  //다음 노드의 주소값을 변경하는 메서드
        this.nextNode = nextNode;
    }
}
