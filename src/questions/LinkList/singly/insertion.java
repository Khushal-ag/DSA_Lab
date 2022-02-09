package questions.LinkList.singly;

public class insertion {
    private Node head;
    private Node tail;
    private int size;

    public insertion() {
        this.size = 0;
    }
    public void insertBeg(int data){
        Node node = new Node(data);
        node.next = head;
        head = node;
        if(tail==null) tail=head;
        size++;
    }
    public void insertLast(int data)
    {
        if(head==null){
            insertBeg(data);
            return;
        }
        Node node = new Node(data);
        tail.next = node;
        tail = node;
        size++;
    }
    public void insertDes(int data,int index)
    {
        if(index==0){
            insertBeg(data);
            return;
        }
        else if(index==size){
            insertLast(data);
            return;
        }
        Node temp = head;
        for (int i=1;i<index;i++)
        {
            temp = temp.next;
        }
        Node node = new Node(data,temp.next);
        temp.next = node;
        size++;
    }
    public void display()
    {
        Node temp = head;
        while(temp!=null)
        {
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
        System.out.println("END");
        System.out.println("Size = " + size);
    }
    private class Node{
        private int data;
        private Node next;

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
        public Node(int data) {
            this.data = data;
        }
    }
    public static void main(String[] args) {
        insertion ll = new insertion();
        ll.insertBeg(12);
        ll.insertBeg(15);
        ll.insertBeg(17);
        ll.insertLast(20);
        ll.insertLast(25);
        ll.insertDes(30,4);
        ll.insertDes(35, 0);
        ll.display();
    }
}
