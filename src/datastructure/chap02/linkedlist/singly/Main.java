package datastructure.chap02.linkedlist.singly;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        SimpleLinkedList<Integer> list = new SimpleLinkedList<>();

        list.insert(3);
        list.insert(5);
        list.insert(8);
        list.insert(7);
        list.insert(14);
        list.insert(2);

        System.out.println(list.printList());

        list.remove(5);
        list.addFirst(5);
        Node<Integer> removeNode = list.removeFirst();

        System.out.println("removeNode.getData() = " + removeNode.getData());
        System.out.println(list.printList());

        System.out.println("=================================");

        SimpleLinkedList<String> stringSimpleLinkedList = new SimpleLinkedList<>();
        stringSimpleLinkedList.insert("데이터일");
        stringSimpleLinkedList.addFirst("첫데이터");

        System.out.println(stringSimpleLinkedList.printList());

        System.out.println("=================================");

        SimpleLinkedList<Double> doubleSimpleLinkedList = new SimpleLinkedList<>();
        doubleSimpleLinkedList.insert(3.3);
        doubleSimpleLinkedList.addFirst(4.4);

        System.out.println(doubleSimpleLinkedList.printList());


    }
}
