/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ru.avalon.dev_110_1_ver2;

/**
 *
 * @author Ivan
 */
public class LinkedList {

    private Node head = new Node(0);

    public static class Node {

        private Node next;
        private int value;

        public Node(int value) {
            this.value = value;
        }

    }

    public void addHead(int value) {
        Node newNode = new Node(value);
        newNode.next = head.next;
        head.next = newNode;
        
        
    }

    public void addTail(int value) {
        Node newNode = new Node(value);
        Node currentNode = head;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
           // System.out.println(head.value);
        }
         
            currentNode.next = newNode;
            newNode.next = null;
         

    }
    

    public void printAll() {
        while (head.next != null) {
            head = head.next;
            System.out.println(head.value);

        }
    }

    
    
    
}
