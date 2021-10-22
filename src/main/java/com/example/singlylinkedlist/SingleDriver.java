package com.example.singlylinkedlist;

public class SingleDriver {

    public static void main(String[] args) {
        LinkedList<String> linkedList = new singlylinkedList<>();

        System.out.println(linkedList);

        linkedList.addFirst("first");
        linkedList.addFirst("second");
        linkedList.addFirst("third");
        linkedList.addFirst("fourth");
        linkedList.addFirst("fifth");


        linkedList.addFirst("sixth");
        linkedList.addFirst("seventh");
        linkedList.addFirst("eight");

        System.out.println(linkedList);

        System.out.println( linkedList.contains("first"));
        System.out.println( linkedList.contains("eight"));
        System.out.println(linkedList.contains("tenth"));

        System.out.println(linkedList.peekFirst());
        System.out.println(linkedList.peekLast());


        linkedList.pollFirst();

        System.out.println(linkedList);

        linkedList.pollLast();

        System.out.println(linkedList);


        linkedList.clear();
        System.out.println(linkedList);


    }
}
