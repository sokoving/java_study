package datastructure.chap10.binarytree;

import utill.Utill;

public class Main {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
/*
                              50
                27                              68
        12              36              55              82
    7      19      **       49      **      **      76      **
 */
        // 삽입
        tree.add(50);
        tree.add(27);
        tree.add(68);
        tree.add(12);
        tree.add(36);
        tree.add(55);
        tree.add(82);
        tree.add(7);
        tree.add(19);
        tree.add(49);
        tree.add(76);

        // 순회
        System.out.println("--전위 순회");
        tree.preOrder(tree.getRoot());
        System.out.println("\n--중위 순회");
        tree.inOrder(tree.getRoot());
        System.out.println("\n--후위 순회");
        tree.postOrder(tree.getRoot());

        Utill.msgLine("탐색");
        System.out.println(tree.find(27));
        System.out.println(tree.find(1));
        System.out.println(tree.find(76));

        Utill.msgLine("최솟값");
        System.out.println(tree.findMin());
        Utill.msgLine("최댓값");
        System.out.println(tree.findMax());
    }
}
