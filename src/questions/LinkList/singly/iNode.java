/*
Print ith Node
For a given a singly linked list of integers and a position 'i',
print the node data at the 'i-th' position.
*/
package questions.LinkList.singly;

import java.util.Scanner;

public class iNode {
    private Node head;
    private int size;

    class Node{
        private int data;
        private Node next;

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }
    public Node retrieve()
    {
        return head;
    }

    public void getIndex(int index)
    {
        if(index<=size-1){
            Node temp = head;
            for(int i=0;i<index;i++)
            {
                temp = temp.next;
            }
            System.out.println(temp.data);
        }
    }
    public void insertLast(int data)
    {
        size++;
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
            iNode ll = new iNode();
            while (true){
                int x = sc.nextInt();
                if(x==-1) break;
                ll.insertLast(x);
            }
            ll.getIndex(sc.nextInt());
            t-=1;
        }
    }
}
