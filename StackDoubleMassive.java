/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ru.avalon.dev_110_1_ver2;

/**
 *
 * @author Ivan
 */
public class StackDoubleMassive {
     private int[] arrayForStack;
    private int top;
    private int sizeOfStack;

    public StackDoubleMassive(int size) {
        this.arrayForStack = new int[size+1];
        
    }

    public int getSizeOfStack() {
        return sizeOfStack;
    }

    public void push(int value) {
        if (top == arrayForStack.length - 1) {
            System.out.println("Stack is overflown");
            
            return;
        }
        arrayForStack[top] = value;
        sizeOfStack++;
         this.top++;
    }

    public int pop() {
        this.top--;
        int result = arrayForStack[top];
        sizeOfStack--;
        
        return result;

    }

    public void printAll() {
        for (int i = 1; i < arrayForStack.length; i++) {
            System.out.println(arrayForStack[i - 1]);
            if (i == top) {
                return;
            }
        }

    }
}
