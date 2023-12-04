/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ru.avalon.dev_110_1_ver2;

/**
 *
 * @author Ivan
 */
public class LopLinkedList {
     Item head = new Item(0);
     Item tail = new Item(0);
     
     {
     head.next = tail;
     tail.next = head;
     
     }
    
    public static class Item {
      int value;
      Item next;
     // Item prev;

        public Item(int value) {
            this.value = value;
        }
      
    
    }
    
    
    public void add (int value){
      Item newItem = new Item(value);
        newItem.next = head.next;
        head.next = newItem;
    
    
    }
    
        public void printAll() {
        if (head.next == tail) {
            System.out.println("The list is empty");
            return;
        }
        Item currentNode = head;
        
        while (currentNode.next!= null){
          currentNode = currentNode.next;
            System.out.println(currentNode.value);
        
        }

    }
}
