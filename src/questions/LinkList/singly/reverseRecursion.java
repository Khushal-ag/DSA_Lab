package questions.LinkList.singly;

public class reverseRecursion {
    private Node head;
    private Node tail;
    private int size;

    private class Node{
        private int data;
        private Node next;

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }
    public void insertLast(int data)
    {
        size++;
        Node node = new Node(data,null);
        if(head==null){
            head = node;
            tail = node;
            return;
        }
        tail.next = node;
        tail = node;
    }
    public void recurDisplay(Node temp)
    {
        if(temp == null) return;
        recurDisplay(temp.next);
        System.out.print(temp.data+" ");
    }
    public void display(Node temp)
    {
        if(temp == null) return;
        System.out.print(temp.data+" ");
        display(temp.next);
    }
    public static void main(String[] args) {
        reverseRecursion ll = new reverseRecursion();
        ll.insertLast(20);
        ll.insertLast(25);
        ll.insertLast(30);
        ll.insertLast(35);
        ll.display(ll.head);
        System.out.println();
        ll.recurDisplay(ll.head);

    }
}
