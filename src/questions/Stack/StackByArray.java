package questions.Stack;

import java.util.Scanner;

public class StackByArray {
    int arr[];
    int top;

    public StackByArray(int size) {
        arr = new int[size];
        top = -1;
    }
    public boolean isEmpty()
    {
        if(top==-1) return true;
        return false;
    }
    public boolean isOverflow()
    {
        if(top==arr.length - 1) return true;
        return false;
    }

    public void push(int val)
    {
        if(isOverflow()) {
            System.out.println("Stack is full");
            return;
        }
        top++;
        arr[top] = val;
    }
    public void pop()
    {
        if(isEmpty()){
            System.out.println("Stack is empty");
            return;
        }
        System.out.println("Deleted element : "+arr[top]);
        top--;
    }
    public void display()
    {
        if(isEmpty()){
            System.out.println("Stack is Empty");
            return;
        }
        for(int i=top;i>=0;i--)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public void peep(){
        if(isEmpty()){
            System.out.println("Stack is Empty");
            return;
        }
        System.out.println("Top : "+arr[top]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        StackByArray s = new StackByArray(size);
        s.push(12);
        s.push(15);
        s.peep();
        s.push(19);
        s.push(20);
        s.peep();
        s.display();
        s.pop();
        s.pop();
        s.peep();
        s.display();
    }
}
