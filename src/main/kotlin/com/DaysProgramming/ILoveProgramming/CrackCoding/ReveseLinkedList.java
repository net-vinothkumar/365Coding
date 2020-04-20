package com.DaysProgramming.ILoveProgramming.CrackCoding;

public class ReveseLinkedList {

    static Node head;

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    void printList(Node node) {
        while (node != null) {
            System.out.println(node.data + " ");
            node = node.next;
        }
    }

    public static void main(String[] args) {
        ReveseLinkedList list = new ReveseLinkedList();
        list.head = new Node(1);
        list.head.next = new Node(2);
        list.head.next.next = new Node(3);
        list.head.next.next.next = new Node(4);
        list.head.next.next.next.next = new Node(5);

        head = list.reverse(head);

        list.printList(head);
    }

    private Node reverse(Node head) {
        Node prev = null;
        Node current = head;
        Node next;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        head = prev;
        return head;
    }
}
