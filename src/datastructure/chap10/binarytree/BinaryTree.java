package datastructure.chap10.binarytree;

class Node {
    private int data; // 트리에 저장할 데이터
    private Node leftChild; // 왼쪽 자식
    private Node rightChild; // 오른쪽 자식

    // 노드 생성 시에는 데이터만 갖고 있다
    public Node(int data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return String.format("[ %d ]", data);
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(Node leftChild) {
        this.leftChild = leftChild;
    }

    public Node getRightChild() {
        return rightChild;
    }

    public void setRightChild(Node rightChild) {
        this.rightChild = rightChild;
    }


}

public class BinaryTree {

    private Node root; // 트리의 루트 노드

    //============= 삽입 ============//
    public void add(int data) {
        // 삽입할 데이터 노드 생성
        Node newNode = new Node(data);

        //빈 트리면 새로운 노드를 루트로 지정
        if (root == null) {
            root = newNode;
        } else {
            Node current = root;
            Node parent;

            while (true) {
                parent = current;

                // 삽입할 데이터가 타겟노드의 데이터보다 작은 경우
                if (data < current.getData()) {
                    current = current.getLeftChild();
                    if (current == null) {
                        parent.setLeftChild(newNode);
                        return;
                    }
                } else { // 큰 경우
                    current = current.getRightChild();
                    if (current == null) {
                        parent.setRightChild(newNode);
                        return;
                    }
                }


            }
        }

    }


    //============= 순회 ============//
    /* 전위 순회(pre order) > 중전후
      1. 중앙 노드 값을 출력
      2. 중앙 노드의 왼쪽 자식을 중앙노드로 삼고 재귀 호출
       더이상 자식이 없을 때까지 반복
       3. 왼쪽 자식 재귀 호출이 끝나면 오른쪽 자식 재귀 호출
    */
    public void preOrder(Node tempRoot) {
        if (tempRoot != null) {
            // 1. 중앙 노드 값을 출력
            System.out.printf("%d ", tempRoot.getData());
            // 2. 중앙 노드의 왼쪽 자식을 중앙노드로 삼고 재귀 호출
            preOrder(tempRoot.getLeftChild());
            // 3. 왼쪽 자식 재귀 호출이 끝나면 오른쪽 자식 재귀 호출
            preOrder(tempRoot.getRightChild());
        }

    }
}
