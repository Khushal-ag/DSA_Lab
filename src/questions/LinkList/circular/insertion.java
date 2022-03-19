package questions.LinkList.circular;

public class insertion {
    private Node head;
    private Node tail;

    public insertion() {
        this.head = null;
        this.tail = null;
    }

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
            tail = node;
            tail.next = head;
            return;
        }
        tail.next = node;
        tail = node;
        tail.next = head;
    }
    public void display()
    {
        if(head == null) {
            System.out.println("List is empty");
            return;
        }
        Node temp = head;
        do{
            System.out.print(temp.val+" -> ");
            temp = temp.next;
        } while(temp!=head);
        System.out.println(temp.val+" (HEAD) ");
    }

    public static void main(String[] args) {
        insertion cq = new insertion();
        /*cq.insert(21);
        cq.insert(24);
        cq.insert(25);
        cq.display();
        cq.insert(26);*/
        cq.insert(30);
        cq.display();
    }
}
