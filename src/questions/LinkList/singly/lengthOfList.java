/*
Length Of LL
For a given singly linked list of integers, find and return its length.
Do it using an iterative method.
*/

package questions.LinkList.singly;

import java.util.Scanner;

public class lengthOfList {
    private Node head;

    public int length() {
        Node temp = head;
        int size = 0;
        while(temp!=null){
            size++;
            temp = temp.next;
        }
        return size;
    }

    class Node{
        private int data;
        private Node next;

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }
    public void insertLast(int data)
    {
        Node node = new Node(data,null);
        if(head==null){
            head =  node;
            return;
        }
        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next = node;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t>0)
        {
            lengthOfList ll = new lengthOfList();
            while (true){
                int x = sc.nextInt();
                if(x==-1) break;
                ll.insertLast(x);
            }
            System.out.println(ll.length());
            t-=1;
        }
    }
}
