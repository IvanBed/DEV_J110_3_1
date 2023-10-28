/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ru.avalon.dev_110_1_ver2;

/**
 *
 * @author Ivan
 */
public class ArrayWithGaps {

    private static int countOfRow = -2;
    private Row headRow = new Row();
    private Row tailRow = new Row();

    public int getSize() {
        return countOfRow;
    }

    public ArrayWithGaps() {
        headRow.next = tailRow;
        tailRow.prev = headRow;
    }

    public static class Row {

        private int indexOfRow;
        private Item headItem = new Item(0);
        private Item tailItem = new Item(0);
        private Row next;
        private Row prev;

        public Row() {
            countOfRow++;
            headItem.next = tailItem;
            tailItem.prev = headItem;
        }

        public int getIndexOfRow() {
            return indexOfRow;
        }

    }

    public static class Item {

        private int indexOfColum;
        private Item next;
        private Item prev;
        private int value;

        public Item(int value) {
            this.value = value;

        }

        public int getValue() {
            return value;
        }

        public int getIndexOfColum() {
            return indexOfColum;
        }

    }

    public void add(int vlaue, int indexOfRow) {
        Item newItem = new Item(vlaue);

        Row currentRow = headRow;
        while (currentRow.next != tailRow) {
            currentRow = currentRow.next;
            if (currentRow.getIndexOfRow() == indexOfRow) {
                Item currenItem = currentRow.headItem;
                Item tail = currentRow.tailItem;
                while (currenItem.next != tail) {
                    currenItem = currenItem.next;
                    /* if (currenItem.indexOfColum == indexOfColum){  
                    currenItem.value = vlaue; return;
                    }*/

                }
                newItem.indexOfColum = currenItem.indexOfColum + 1;
                currenItem.next.prev = newItem;
                newItem.next = currenItem.next;
                newItem.prev = currenItem;
                currenItem.next = newItem;
                return;
            }

        }
        Row newRow = new Row();

        newRow.next = tailRow;
        tailRow.prev.next = newRow;

        newRow.prev = tailRow.prev;
        tailRow.prev = newRow;

        newItem.prev = newRow.headItem;
        newRow.headItem.next.prev = newItem;
        newItem.next = newRow.headItem.next;

        newRow.headItem.next = newItem;
        newRow.indexOfRow = newRow.prev.indexOfRow + 1;
    }
    
    public void add(int vlaue, int indexOfRow, int indexOfColum) {
        Item newItem = new Item(vlaue);

        Row currentRow = headRow;
        while (currentRow.next != tailRow) {
            currentRow = currentRow.next;
            if (currentRow.getIndexOfRow() == indexOfRow) {
                Item currenItem = currentRow.headItem;
                Item tail = currentRow.tailItem;
                while (currenItem.next != tail) {
                    currenItem = currenItem.next;
                    if (currenItem.indexOfColum == indexOfColum) {
                        currenItem.value = vlaue;
                        return;
                    }

                }
                newItem.indexOfColum = currenItem.indexOfColum + 1;
                currenItem.next.prev = newItem;
                newItem.next = currenItem.next;
                newItem.prev = currenItem;
                currenItem.next = newItem;
                return;
            }

        }
        Row newRow = new Row();

        newRow.next = tailRow;
        tailRow.prev.next = newRow;

        newRow.prev = tailRow.prev;
        tailRow.prev = newRow;

        newItem.prev = newRow.headItem;
        newRow.headItem.next.prev = newItem;
        newItem.next = newRow.headItem.next;

        newRow.headItem.next = newItem;
        newRow.indexOfRow = newRow.prev.indexOfRow + 1;
    }
    
    
    
    public void delete (int indexOfRow, int indexOfColum){
     Row currentRow = headRow;
        while (currentRow.next != tailRow) {

            currentRow = currentRow.next;

            if (currentRow.indexOfRow == indexOfRow) {
                Item currentItem = currentRow.headItem;
                Item tail = currentRow.tailItem;
                while (currentItem.next != tail) {
                    currentItem = currentItem.next;
                    if (currentItem.indexOfColum == indexOfColum ){
                      currentItem.prev.next = currentItem.next;
                      currentItem.next.prev = currentItem.prev;
                    }
                }
                  currentItem = currentRow.headItem;
                 int newIndex = 0;
                   while (currentItem.next != tail){
                   
                    currentItem = currentItem.next;
                   currentItem.indexOfColum = newIndex;
                   newIndex++;
                   }   
            }
           
        }
    
    
    
    }
    
    
    
    
    
    
    
    
    
    

    public int getValue(int indexOfRow, int indexOfColum) {
        if (indexOfRow > getSize()) {
            return -1;
        }
        Row currentRow = headRow;
        while (currentRow.next != tailRow) {

            currentRow = currentRow.next;

            if (currentRow.indexOfRow == indexOfRow) {
                Item currentItem = currentRow.headItem;
                Item tail = currentRow.tailItem;
                while (currentItem.next != tail) {
                    currentItem = currentItem.next;
                    if (currentItem.indexOfColum == indexOfColum) {
                        return currentItem.getValue();
                    }
                }

            }
            return -1;
        }

        return -1;

    }

    public void printAll() {

        Row currentRow = headRow;
        while (currentRow.next != tailRow) {
            
            currentRow= currentRow.next;
            System.out.println("Строка " + currentRow.indexOfRow );
            Item currentItem = currentRow.headItem;
            Item tail = currentRow.tailItem;
            while (currentItem.next != tail) {
                currentItem = currentItem.next;
                System.out.println(" индекс айтема " + currentItem.getIndexOfColum());
                System.out.println(" значение айтема " + currentItem.getValue());

            }

        }

    }

    

}
