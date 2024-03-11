package StackDSA;

import java.util.*;
class Node {
    int data;
    Node next;
    
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;
    
    LinkedList() {
        this.head = null;
    }
    
    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }
    
    public void removeDuplicates() {
        if (head == null) {
            return;
        }
        
        HashSet<Integer> set = new HashSet<>();
        Node current = head;
        Node previous = null;
        
        while (current != null) {
            if (set.contains(current.data)) {
                previous.next = current.next;
            } else {
                set.add(current.data);
                previous = current;
            }
            current = current.next;
        }
    }
    
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}

public class HashRemoveDuplicates {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(2);
        list.add(4);
        list.add(3);
        
        System.out.println("Original linked list:");
        list.display();
        
        list.removeDuplicates();
        
        System.out.println("Linked list after removing duplicates:");
        list.display();
    }
}
