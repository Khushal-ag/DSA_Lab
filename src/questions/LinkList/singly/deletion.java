package questions.LinkList.singly;

public class deletion {
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
        public Node(int data) {
            this.data = data;
        }
    }
    public void deleteBeg(){
        if(head==null){
            tail = null;
            System.out.println("List is empty");
            return;
        }
        System.out.println("Deleted element : "+head.data);
        head = head.next;
        size--;
    }
    public void deleteLast(){
        if(tail==null){
            System.out.println("List is empty");
            return;
        }
        Node temp = head;
        for(int i=1;i<size-1;i++)
        {
            temp = temp.next;
        }
        System.out.println("Deleted element : "+tail.data);
        tail = temp;
        temp.next = null;
        size--;
        if(size==0) {
            head = null;
            tail = null;
        }
    }
    public void deleteDes(int index)
    {
        if(index == 0){
            deleteBeg();
            return;
        }
        else if(index == size-1){
            deleteLast();
            return;
        }
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        System.out.println("Deleted element : "+temp.next.data);
        temp.next = temp.next.next;
        size--;
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
        System.out.println("Size : " + size);
    }
    public static void main(String[] args) {
        deletion ll = new deletion();
        ll.display();
        ll.deleteDes(2);
        ll.deleteBeg();
        ll.deleteLast();
        ll.display();
        ll.deleteDes(1);
        ll.deleteLast();
        ll.display();
        ll.deleteLast();
    }
}
