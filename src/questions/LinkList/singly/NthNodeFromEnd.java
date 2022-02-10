package questions.LinkList.singly;

import java.util.Scanner;

public class NthNodeFromEnd {
    private ListNode head;

    class ListNode{
        private int val;
        private ListNode next;

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
    public void insertLast(int val)
    {
        ListNode node = new ListNode(val,null);
        if(head==null){
            head = node;
            return;
        }
        ListNode temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next = node;
    }
    public void delete(int index)
    {
        if(index == 0){
            head = head.next;
        }
        ListNode temp = head;
        ListNode prev = null;
        for(int i=0;i<index;i++)
        {
            prev = temp;
            temp = temp.next;
        }
        prev.next = temp.next;
    }
    public void removeNthFromEnd(int n) {
        ListNode temp = head;
        int size = 0;
        while(temp != null)
        {
            temp = temp.next;
            size++;
        }
        delete(size-n);
    }
    public void display()
    {
        ListNode temp = head;
        while(temp!=null)
        {
            System.out.print(temp.val+" -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t>0)
        {
            NthNodeFromEnd ll = new NthNodeFromEnd();
            while (true){
                int x = sc.nextInt();
                if(x==-1) break;
                ll.insertLast(x);
            }
            ll.removeNthFromEnd(sc.nextInt());
            ll.display();
            t-=1;
        }
    }
}
