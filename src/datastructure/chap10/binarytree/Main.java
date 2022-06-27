package datastructure.chap10.binarytree;

import utill.Utill;

import java.util.TreeMap;
import java.util.TreeSet;

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

        Utill.msgLine("트리 출력");
        tree.display();


        // 데이터가 치우쳐지면 트리의 장점이 없어진다
        Utill.msgLine("트리의 문제점");
        BinaryTree binaryTree2 = new BinaryTree();
        binaryTree2.add(1);
        binaryTree2.add(2);
        binaryTree2.add(50);
        binaryTree2.add(27);
        binaryTree2.add(30);
        binaryTree2.add(77);
        binaryTree2.add(3);
        binaryTree2.add(3);

        binaryTree2.display();

        Utill.msgLine("트리의 자바 API : TreeSet");
        // TreeSet : Set 형태로 tree를 구현(중복 없음)
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(50);
        treeSet.add(77);
        treeSet.add(27);
        treeSet.add(7);
        treeSet.add(67);
        System.out.println(treeSet.toString());

        Utill.msgLine("트리의 자바 API : TreeMap");
        // TreeMap : Map 형태로 tree를 구현(키값으로 데이터 찾음)
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("멍멍이", 30);
        treeMap.put("명명이", 35);
        treeMap.put("냥냥이", 40);
        treeMap.put("낭낭이", 10);
        System.out.println(treeMap.toString());




    }
}
