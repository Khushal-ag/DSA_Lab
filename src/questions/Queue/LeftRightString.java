
package questions.Queue;

import java.util.Scanner;

public class LeftRightString {
    private Node front,rear;
    class Node{
        char c;
        Node next;

        public Node(char c, Node next) {
            this.c = c;
            this.next = next;
        }
    }
    public void insert(char c)
    {
        Node node = new Node(c,null);
        if(rear==null && front==null){
            front=rear=node;
            return;
        }
        rear = rear.next = node;
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
            System.out.print(temp.c);
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LeftRightString l = new LeftRightString();
        String s = sc.nextLine();
        String o = "",e = "";
        for (int i = 0; i < s.length(); i++) {
            if((int)s.charAt(i)%2 == 0) e+=s.charAt(i);
            else o+=s.charAt(i);
        }
        s = o+e;
        for (int i = 0; i < s.length(); i++) {
            l.insert(s.charAt(i));
        }
        System.out.print("Result String : ");
        l.display();
    }
}
