package datastructure.chap02.linkedlist.practice;

public class PNode {
    private int data; // data - 노드에 저장할 자료
    private  PNode nextNode; // nextNode - 다음 노드 포인터

// 생성자
    public PNode(int data){ // 값 하나만를 가진 노드 생성
        this.data = data;  //nextNode는 다음 자료가 생성될 때
    }
// 메서드
    public int getData() { //저정한 값 불러오기
        return data;
    }

    public void setData(int data) { // 값 수정
        this.data = data;
    }

    public PNode getNextNode() { // 다음 노드 주소 불러오기
        return nextNode;
    }

    public void setNextNode(PNode nextNode) { // 다음 노드 주소 수정
        this.nextNode = nextNode;
    }
}
