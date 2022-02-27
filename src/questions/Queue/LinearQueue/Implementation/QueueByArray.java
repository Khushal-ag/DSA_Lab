package questions.Queue.LinearQueue.Implementation;

import java.util.Scanner;

public class QueueByArray {
    int arr[];
    int front,rear;

    public QueueByArray(int size) {
        arr = new int[size];
        this.front = -1;
        this.rear = -1;
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
    public void enqueue(int val)
    {
        if(isOverflow()) {
            System.out.println("Queue is full");
            return;
        }
        else if(rear==-1 && front == -1)
        {
            rear++;
            front++;
            arr[rear] = val;
            return;
        }
        rear++;
        arr[rear] = val;
    }
    public void dequeue()
    {
        if(isEmpty()){
            System.out.println("Queue is empty");
            return;
        }
        System.out.println("Deleted element : "+arr[front]);
        arr[front] = Integer.MIN_VALUE;
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
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        QueueByArray q = new QueueByArray(size);
        q.dequeue();
        q.enqueue(12);
        q.enqueue(15);
        q.enqueue(18);
        q.display();
        q.enqueue(20);
        q.dequeue();
        q.dequeue();
        q.display();
        q.dequeue();
        q.dequeue();
        q.dequeue();
    }
}
