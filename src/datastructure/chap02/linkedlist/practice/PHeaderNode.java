package datastructure.chap02.linkedlist.practice;

public class PHeaderNode {
    private PNode firstNode;

    public PHeaderNode(){
        this.firstNode = null;
    }

// 메서드
    public void setFirstNode(PNode firstNode){
        this.firstNode = firstNode;
    }

    public PNode getFirstNode() {
        return firstNode;
    }

}
