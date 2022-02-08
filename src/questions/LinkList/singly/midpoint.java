/*
Mid Point Linked List
For a given singly linked list of integers, find and return the node
present at the middle of the list.
*/
package questions.LinkList.singly;

import java.util.Scanner;

public class midpoint {
    private Node head;
    private int size;

    public midpoint() {
        this.head = null;
        this.size = 0;
    }

    class Node{
        private int data;
        private Node next;

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }
    public void insertLast(int data){
        Node node = new Node(data,null);
        size++;
        if(head==null)
        {
            head = node;
            return;
        }
        Node temp = head;
        while (temp.next!=null)
        {
            temp = temp.next;
        }
        temp.next = node;
    }
    public int mid()
    {
        Node temp = head;
        int mid;
        if(size%2==0) mid = size/2 - 1;
        else mid = size/2;
        for (int i=1;i<=mid;i++)
            temp = temp.next;
        return temp.data;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t>0)
        {
            midpoint ll = new midpoint();
            while (true){
                int x = sc.nextInt();
                if(x==-1) break;
                ll.insertLast(x);
            }
            System.out.println("Mid point : "+ll.mid());
            t-=1;
        }
    }
}
