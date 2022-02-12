/*
WAP to find fibonacci number at given indexes passed as a
commandline argument and store them in a linked list.
*/
package questions.LinkList.singly;

public class FIboIndex {
    private Node head;
    class Node{
        private int val;
        private Node next;

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }
    public void insert(int val)
    {
        Node node = new Node(val,null);
        if(head == null)
        {
            head = node;
            return;
        }
        Node temp = head;
        while (temp.next!=null)
            temp = temp.next;
        temp.next = node;
    }
    public void display()
    {
        Node temp = head;
        while(temp!=null)
        {
            System.out.print(temp.val+" -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }
    public int calFibo(int index)
    {
        if(index==1) return 0;
        else if(index==2) return 1;
        int a = 0,b=1;
        int total = a+b;
        index -= 2;
        while (index>1){
            a = b;
            b = total;
            total = a+b;
            index--;
        }
        return a+b;
    }

    public static void main(String[] args) {
        FIboIndex ll = new FIboIndex();
        for (int i=0;i< args.length;i++)
        {
            int index = Integer.parseInt(args[i]);
            ll.insert(ll.calFibo(index));
        }
        ll.display();
    }
}
