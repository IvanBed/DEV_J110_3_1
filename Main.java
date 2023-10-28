/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ru.avalon.dev_110_1_ver2;

import ru.avalon.dev_110_1_ver2.LinkedListMultiTread.Planet;

/**
 *
 * @author Ivan
 */
public class Main {
    public static void main(String[] args) {
     /*   LinkedList ls = new LinkedList();
        ls.addHead(1);
        ls.addHead(2);
        ls.addHead(3);
        ls.addHead(4);
        ls.addHead(5);
         ls.addTail(6);
      // ls.printAll();
         LinkedList ls1 = new LinkedList();
       ls1.addTail(0);
       ls1.addTail(1);
          ls1.addTail(2);
         ls1.addHead(5);
        ls1.addHead(6);
          ls1.printAll();*/
     /*
            LinkedListDouble llsd = new LinkedListDouble();
         llsd.addHead(14);
            llsd.addHead(12);
            llsd.addHead(6);
            llsd.addHead(0);
            llsd.addHead(1);
            
        llsd.addHead(4);
        llsd.addHead(3);
        llsd.addHead(5);
           llsd.addHead(-5);
              llsd.addHead(-75);
                 llsd.addHead(5);
         llsd.addHead(7);
      
       // llsd.sortInsert();
       // System.out.println(llsd.isItSorted());
      llsd.addIntoSorted(-7);
        llsd.sortSelect();
       llsd.printAll();
        */
     /*
     LinkedListMultiTread newGalaxy = new LinkedListMultiTread();
     
    newGalaxy.addPlanetToList(new Planet("Пидрильня",3333,2222,111));
     
     newGalaxy.addPlanetToList(new Planet("Хуесосия",2,3,5));
     newGalaxy.addPlanetToList(new Planet("Планета пидораха",133,311,57));
     newGalaxy.addPlanetToList("Пидрильня",3333,2222,111);
      newGalaxy.addPlanetToList("Планета пидораха",133,311,57);
            newGalaxy.addPlanetToList("Хуесосия",2,3,5);
                   newGalaxy.addPlanetToList("Залупа",123,888,-5);
     newGalaxy.printAll();*/
     
       // System.out.println(llsd.findMin());
       /*
        ArrayWithGaps array = new ArrayWithGaps();
        array.add(10, 1);
        array.add(20, 1);
        array.add(30, 1);
      
        array.add(100, 2);
        array.add(250, 2);
        array.add(350, 2);
        
        array.add(3500, 3);
        array.add(3700, 3);
        array.add(3800, 3);
        
        array.add(35000, 4);
        array.add(370000, 5);
        array.add(380000, 5);
        array.add(40, 1,2);
        array.add(-15, 1);
     //   array.printAll();
        array.delete(2, 2);
           array.printAll();
        */
      /*  System.out.println(array.getSize());
        
        System.out.println(array.getValue(1, 1));
         System.out.println(array.getValue(45, 1));
      System.out.println(array.getValue(1, 44));
       */
       
       /*
       LopLinkedList lopList = new LopLinkedList();
       lopList.add(1);
       lopList.add(2);
       lopList.add(3);
       
       
       lopList.printAll();*/
       
       
       StackMassive stack = new StackMassive(10);
       stack.push(-1);
       stack.push(2);
       stack.push(3);
       stack.push(4);
       stack.push(5);
         stack.push(67);
       stack.push(7);
         stack.push(-1);
       stack.push(-13);
      //   stack.pop();
           //  stack.pop();
          //       stack.pop();
             //    stack.push(345);
      stack.selectSort(stack);
      stack.printAll();
      
       
    //    stack.printAll();
    }
}
