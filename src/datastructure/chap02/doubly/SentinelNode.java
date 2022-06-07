package datastructure.chap02.doubly;

// SentinelNode: 첫번째 노드 주소와 마지막 노드 주소만 가지고 있다
public class SentinelNode {

    private Node firstNode; // 첫번째 노드 주소
    private Node lastNode; // 마지막 노드 주소

    // 리스트가 비어 있는지 확인
    public boolean isEmpty(){
        return firstNode == null && lastNode == null;
    }

    // setter getter

    public Node getFirstNode() {
        return firstNode;
    }

    public void setFirstNode(Node firstNode) {
        this.firstNode = firstNode;
    }

    public Node getLastNode() {
        return lastNode;
    }

    public void setLastNode(Node lastNode) {
        this.lastNode = lastNode;
    }
}
