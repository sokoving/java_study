package datastructure.chap02.linkedlist.singly;

// 연결 리스트의 첫 번째 데잍터가 들어 있는 노드를 저장
public class HeaderNode<E> {

    // 첫 번째 노드 객체의 주소 저장
    private Node<E> firstNode;

//    생성자
    public HeaderNode(){
        // 헤더 노드의 생성 == 리스트의 생성
        // 처음에는 빈 리스트로 시작하므로 첫 번째 노드(저장할 주소값)는 없다
        this.firstNode = null;
    }

//    메서드
    //헤더노드의 포인터를 세팅하는 기능(첫 번재 노드가 생성됐을 때 작동)
    public void setFirstNode(Node<E> firstNode) {
        this.firstNode = firstNode;
    }

    // 헤더노드가 감시하는 첫 번째 노드의 주소를 반환
    public Node<E> getFirstNode() {
        return firstNode;
    }

    // 연결리스트가 빈 리스트인지 여부 확인
    public boolean isEmpty(){
        return firstNode == null;
    }



}
