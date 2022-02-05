package questions.LinkList.doubly;

public class deletion {
    Node head,tail;
    private class Node{
        private int data;
        private Node prev;
        private Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    public void deleteBeg()
    {
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        System.out.println("Deleted element : "+head.data);
        head = head.next;
        if(head!=null) head.prev = null;
        else tail=null;
    }
    public void deleteLast()
    {
        if(tail==null){
            System.out.println("List is empty");
            return;
        }
        System.out.println("deleted element : "+tail.data);
        tail = tail.prev;
        if(tail!=null) tail.next = null;
        else head = null;
    }
    public void deleteDes(int index)
    {
        if (index==0){
            deleteBeg();
            return;
        }
        Node prevNode = head;
        for(int i=1;i<index;i++)
        {
            prevNode = prevNode.next;
        }
        Node nextNode = prevNode.next.next;
        System.out.println("Deleted element : "+prevNode.next.data);
        prevNode.next = nextNode;
        if(nextNode!=null) nextNode.prev = prevNode;
        else tail = prevNode;
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
        deletion dl = new deletion();
        dl.deleteBeg();
        dl.display();
        dl.deleteDes(1);
        dl.deleteDes(2);
        dl.display();
        dl.deleteDes(0);
        dl.deleteDes(0);
        dl.display();
    }
}
