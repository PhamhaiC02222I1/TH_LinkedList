package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("/=/=/=/= TESTING /=/=/=/=");
        MyLinkedList ll = new MyLinkedList(10);
        ll.addFirst(11);
        ll.addFirst(12);
        ll.addFirst(13);

        ll.add(3,9);
//            ll.add(5,9);
        ll.printList();
    }
}
