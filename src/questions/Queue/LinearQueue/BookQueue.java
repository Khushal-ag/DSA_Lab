package questions.Queue.LinearQueue;

import java.util.Scanner;

class Book{
    String name;
    int price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

public class BookQueue {
    Book[] arr;
    int front,rear;

    public BookQueue(int size) {
        arr = new Book[size];
        this.front = -1;
        this.rear = -1;
    }
    public void enqueue(Book obj)
    {
        if(rear==arr.length-1){
            System.out.println("Overflow");
            return;
        }
        else if(rear==-1&&front==-1)
        {
            rear = front = 0;
            arr[rear] = obj;
            return;
        }
        rear++;
        arr[rear] = obj;
    }
    public void dequeue()
    {
        if(front==-1){
            System.out.println("Empty");
            return;
        }
        System.out.println("Deleted Entry :- ");
        System.out.println("Book Name : "+arr[front].getName()+"\tBook Price : "+arr[front].getPrice());
        front++;
        if (front>rear) rear = front = -1;
    }
    public void display()
    {
        if(front==-1){
            System.out.println("Empty");
            return;
        }
        for (int i = front; i <= rear; i++) {
            System.out.println("Book Name : "+arr[i].getName()+"\tBook Price : "+arr[i].getPrice());
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter queue size : ");
        int size = sc.nextInt();
        BookQueue q = new BookQueue(size);
        for (int i = 1; i <= size; i++) {
            sc.nextLine();
            Book obj = new Book();
            System.out.print("Enter Book Name : ");
            obj.setName(sc.nextLine());
            System.out.print("Enter Book Price : ");
            obj.setPrice(sc.nextInt());
            q.enqueue(obj);
        }
        q.display();
        q.dequeue();
        q.dequeue();
        q.display();
    }
}
