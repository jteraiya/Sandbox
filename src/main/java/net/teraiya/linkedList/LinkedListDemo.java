package net.teraiya.linkedList;

/**
 * Created by jteraiya on 3/13/17.
 */
public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.insertAtHead(5);
        list.insertAtHead(10);
        list.insertAtHead(15);
        list.insertAtHead(20);
        list.insertAtHead(25);
        list.insertAtHead(30);
        list.insertAtHead(35);
        list.insertAtHead(40);
        list.insertAtHead(45);

        System.out.println(list);

    }
}
