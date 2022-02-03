package questions.LinkList;

public class insertAtLast {
    class Node{
        Node next;
        int element;
        public Node(int e, Node n){
            element=e;
            next=n;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    public insertAtLast(){
        head=null;
        tail=null;
        size=0;
    }
    public boolean isEmpty(){
        return size==0;
    }

    public int length(){
        return size;
    }

    public void addLast(int e){
        Node newest= new Node(e,null);
        if(isEmpty())
            head=newest;
        else
            tail.next=newest;
        tail=newest;
        size=size+1;
    }

    public void display(){
        Node p=head;
        while(p!=null){
            System.out.print(p.element +" ");
            p=p.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        insertAtLast l=new insertAtLast();
        l.addLast(7);
        l.addLast(12);
        l.addLast(4);
        l.display();
        System.out.println(l.length());
    }
}
