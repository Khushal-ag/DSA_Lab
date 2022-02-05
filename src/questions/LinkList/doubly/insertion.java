package questions.LinkList.doubly;

public class insertion {
    Node head,tail;
    private class Node{
        private int data;
        private Node prev;
        private Node next;

        public Node(int data) {
            this.data = data;
        }
    }
    public void insertBeg(int data){
        Node node = new Node(data);
        node.next = head;
        node.prev = null;
        if(head!=null) head.prev = node;
        else tail=node;
        head = node;
    }
    public void insertLast(int data){
        Node node = new Node(data);
        node.prev = tail;
        node.next = null;
        if(tail!=null) tail.next = node;
        else head=node;
        tail = node;
    }
    public void insertDes(int data,int index){
        if(index==0){
            insertBeg(data);
            return;
        }
        Node node = new Node(data);
        Node prevNode = head;
        for (int i=1;i<index;i++)
        {
            prevNode = prevNode.next;
        }
        Node nextNode = prevNode.next;
        node.prev = prevNode;
        node.next = nextNode;
        prevNode.next = node;
        if(nextNode!=null){
            nextNode.prev = node;
        }
        else tail = node;
    }
    public void display()
    {
        if(head==null)
        {
            System.out.println("List is empty");
            return;
        }
        Node first = head;
        Node last = tail;
        while(first!=null){
            System.out.print(first.data+" -> ");
            first = first.next;
        }
        System.out.println("END");
        System.out.println("Reverse :");
        while (last!=null){
            System.out.print(last.data+" -> ");
            last = last.prev;
        }
        System.out.println("START");
    }

    public static void main(String[] args) {
        insertion dl = new insertion();
        dl.display();
        dl.insertDes(12,0);
        dl.insertDes(15,0);
        dl.insertDes(13,0);
        dl.display();
        dl.insertDes(20,2);
        dl.insertDes(25,4);
        dl.display();
    }
}
