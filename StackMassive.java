/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ru.avalon.dev_110_1_ver2;

/**
 *
 * @author Ivan
 */
public class StackMassive {

    private int[] arrayForStack;
    private int top;
    private int sizeOfStack;

    public StackMassive(int size) {
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

    public void insertSort(StackMassive stack) {
        StackMassive tempStack = new StackMassive(10);
        int temp;
        int max = arrayForStack.length;
     
        for (int j = 0; j < arrayForStack.length; j++) {
           temp = stack.pop();
            for (int i = top; i > j; i--) {
                tempStack.push(stack.pop());

            }
            top = j;
         
            for (int k = j; k  > 0; k--) {
                 int temp2 =  stack.pop();
                if (stack.pop()<temp){
                stack.push(temp2);
                stack.push(temp);
                } else{}
                    
                 
            }

        }

    }
    
    public void selectSort(StackMassive stack) {
        StackMassive tempStack = new StackMassive(10);
        int min;
        int maxTop = top;
        for (int i = 0; i < maxTop - 1; i++) {
            int temp = stack.pop();
            stack.push(temp);
            min = temp;
            for (int j = top - 1; j >= i; j--) {
                int localTemp = stack.pop();
                if (min > localTemp) {
                    min = localTemp;
                }
                tempStack.push(localTemp);
            }
            stack.push(min);
            for (int j = tempStack.top - 1; j >= 0; j--) {
                int value = tempStack.pop();
                if (value == min) {
                    continue;
                }
                System.out.println("обратно" + value);
                stack.push(value);
            }
        }
    }

    
}
