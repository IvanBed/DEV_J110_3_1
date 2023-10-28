/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ru.avalon.dev_110_1_ver2;

/**
 *
 * @author Ivan
 */
public class LinkedListDouble {

    private Item head = new Item();
    private Item tail = new Item();

    public LinkedListDouble() {
        head.next = tail;
        tail.prev = head;
    }

    public static class Item {

        private Item prev;
        private Item next;
        private int value;

        public Item() {

        }

        public Item(int value) {
            this.value = value;
        }

    }

    public void addHead(int value) {

        Item newItem = new Item(value);

        newItem.next = head.next;
        head.next.prev = newItem;
        newItem.prev = head;
        head.next = newItem;

    }

    public void addTail(int value) {

        Item newItem = new Item(value);

        newItem.prev = tail.prev;
        newItem.next = tail;
        tail.prev.next = newItem;
        tail.prev = newItem;

    }

    public void printAll() {
        Item currentItem = head;
        while (currentItem.next != tail) {
            currentItem = currentItem.next;
            System.out.println(currentItem.value);

        }
    }

    public int findMin() {
        Item currentItem = head;
        int min = head.next.value;
        while (currentItem.next != tail) {
            currentItem = currentItem.next;
            if (currentItem.value < min) {
                min = currentItem.value;
            }
        }
        return min;
    }

    public boolean isItSorted() {
        Item currentItem = head;
        while (currentItem.next != tail.prev) {
            currentItem = currentItem.next;
            if (currentItem.value > currentItem.next.value) {

                return false;
            }

        }
        return true;
    }

    public void addIntoSorted(int value) {
        Item newItem = new Item(value);
        Item currentItem = head;
        while (currentItem.next.value <= newItem.value) {
            currentItem = currentItem.next;
        }
        newItem.next = currentItem.next;
        newItem.prev = currentItem;
        currentItem.next.prev = newItem;
        currentItem.next = newItem;

    }


    
    public void sortSelect() {
        Item currentItem = head;
        Item minItem;
        Item innerCurrentItem;
        while (currentItem.next != tail) {
            currentItem = currentItem.next;
            minItem = currentItem;
            innerCurrentItem = currentItem;
            Item startItem = currentItem;
            while (innerCurrentItem.next != tail) {

                innerCurrentItem = innerCurrentItem.next;
                if (innerCurrentItem.value < minItem.value) {
                    minItem = innerCurrentItem;
                }

            }
            int temp = minItem.value;
            minItem.value = currentItem.value;
            currentItem.value = temp;

        }
    }

    
     
            
  


    
    public void sortInsert() {
        Item currentItem = head;

        while (currentItem.next != tail) {
            currentItem = currentItem.next;
           
            if (currentItem.next!= tail && currentItem.value < currentItem.prev.value) {

                Item tempItem = currentItem;
                Item itemBack = currentItem.prev;
                currentItem.next.prev = currentItem.prev;
                currentItem.prev.next = currentItem.next;

                while (itemBack != head && tempItem.value < itemBack.value) {
                    itemBack = itemBack.prev;
                  
                }
                tempItem.next = itemBack.next;
                tempItem.prev = itemBack;
                itemBack.next.prev = tempItem;
                itemBack.next = tempItem;

        
            }

        }

    }


   
    
    
    
    
    
    
    
    
    
    
    
    
    
    public void deleteFromTail (){
        tail.prev.prev.next = tail;
        tail.prev =tail.prev.prev;
    
    }

    
}
