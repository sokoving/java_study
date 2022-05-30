package datastructure.chap02.linkedlist.singly;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        SimpleLinkedList list = new SimpleLinkedList();

        list.insert(3);
        list.insert(5);
        list.insert(8);
        list.insert(7);
        list.insert(14);
        list.insert(2);

        System.out.println(list.printList());

        list.remove(5);
        list.addFirst(5);
        Node removeNode = list.removeFirst();

        System.out.println("removeNode.getData() = " + removeNode.getData());
        System.out.println(list.printList());


    }
}
