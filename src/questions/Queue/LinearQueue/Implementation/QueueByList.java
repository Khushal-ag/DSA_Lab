package questions.Queue.Implementation;

import java.util.Scanner;

public class QueueByList {
    private Node front = null,rear = null;
    class Node{
        int data;
        Node next;

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }
    public void enqueue(int val)
    {
        Node node = new Node(val,null);
        if(rear==null && front==null){
            front=rear=node;
            return;
        }
        rear = rear.next = node;
    }
    public void dequeue()
    {
        if(front==null)
        {
            System.out.println("Queue is empty");
            return;
        }
        System.out.println("Deleted element : "+front.data);
        front = front.next;
        if(front==rear.next)
        {
            front=rear=null;
        }
    }
    public void display()
    {
        if(front==null)
        {
            System.out.println("Queue is empty");
            return;
        }
        Node temp = front;
        while (temp!=rear.next){
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QueueByList l = new QueueByList();
        l.dequeue();
        l.enqueue(12);
        l.enqueue(15);
        l.enqueue(10);
        l.display();
        l.enqueue(18);
        l.display();
        l.dequeue();
        l.dequeue();
        l.display();
        l.dequeue();
        l.dequeue();
        l.dequeue();
        l.display();
    }
}
