/*
Add the pair of vair of values having max and min products from the
array entered by user and display it.
*/
package questions.Queue.LinearQueue;

import java.util.Scanner;

public class ProductPair {
    pair arr[];
    int front,rear;

    public ProductPair() {
        arr = new pair[2];
        front=rear=-1;
    }

    class pair{
        int val1;
        int val2;

        public pair(int val1, int val2) {
            this.val1 = val1;
            this.val2 = val2;
        }
    }
    public boolean isEmpty()
    {
        if(rear == -1) return true;
        return false;
    }
    public boolean isOverflow()
    {
        if(rear == arr.length - 1) return true;
        return false;
    }
    public void enqueue(int val1,int val2)
    {
        if(isOverflow()) {
            System.out.println("Queue is full");
            return;
        }
        else if(rear==-1 && front == -1)
        {
            rear++;
            front++;
            arr[rear] = new pair(val1, val2);
            return;
        }
        rear++;
        arr[rear] = new pair(val1, val2);
    }
    public void dequeue()
    {
        if(isEmpty()){
            System.out.println("Queue is empty");
            return;
        }
        System.out.println("Deleted element : "+arr[front].val1+" "+arr[front].val2);
        front++;
        if(front>rear)
        {
            front=rear=-1;
        }
    }
    public void display()
    {
        if(isEmpty()){
            System.out.println("Queue is empty");
            return;
        }
        for (int i = front; i <= rear; i++) {
            System.out.println(arr[i].val1+" "+arr[i].val2);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int min1,min2,max1,max2;
        min1=min2=Integer.MAX_VALUE;
        max1=max2=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            if(arr[i]>max1) {
                max2 = max1;
                max1 = arr[i];
            }
            else if(arr[i]>max2 && arr[i]<max1)
            {
                max2 = arr[i];
            }
            if(arr[i]<min1) {
                min2 = min1;
                min1 = arr[i];
            }
            else if(arr[i]<min2 && arr[i]>min1)
            {
                min2 = arr[i];
            }
        }
        ProductPair q = new ProductPair();
        q.enqueue(max1,max2);
        q.enqueue(min1,min2);
        q.display();
    }

}
