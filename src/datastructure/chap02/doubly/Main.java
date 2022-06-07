package datastructure.chap02.doubly;

public class Main {
    public static void main(String[] args) {

        DoublyLinkedList list = new DoublyLinkedList();

        list.add(3);
        list.add(10);
        list.add(10);
        list.add(10);
        list.add(10);
        list.add(11);


        System.out.println(list.printList());

        list.remove(10);
        list.remove(11);
        list.remove(3);

        System.out.println(list.printList());

    }
}
