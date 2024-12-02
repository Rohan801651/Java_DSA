package AllStacks.StacksByArrays;

import java.util.*;

public class Stacks {
    private int[] stacks;
    private int top = -1;
    private int size;

    public Stacks(int size) {
        this.size = size;
        this.stacks = new int[size];
    }

    public void push(int val) {
        if (top > size) {               /*check*/
            System.out.println("Stack is Full. ");
        } else {
            stacks[++top] = val;
        }
    }


    public int getSize() {
        return this.size;
    }

    public void pop() {
        if (top < 0){ // no need
//            System.out.println("Stack Empty ");
        }
        else{
//            int popped = stacks[top--];
            System.out.println("popped "+stacks[top--]);

        }
    }

    public int peek() {
        return stacks[top];
    }








    public void display() {
        if (top == -1) {
            System.out.println("Stack Is Empty");
            return;
        }
        System.out.println("Values in stacks ");
        for (int i = top; i >= 0; i--) {
            System.out.println(stacks[i]);
        }

    }

    


}
