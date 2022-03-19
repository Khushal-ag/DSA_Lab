package questions.LinkList.circular;

public class deletion {
    private Node head;
    private Node tail;

    public deletion(){
        head = null;
        tail = null;
    }
    class Node{
        int data;
        Node next;

        Node(int data, Node next){
            this.data = data;
            this.next = null;
        }
    }

    public void delete(int val){
        if(head==null) {
            System.out.println("List is empty");
            return;
        }
        if(head.data == val){
            System.out.println("Deleted element : "+head.data);
            if(head==tail){
                head=null;
                tail=null;
                return;
            }
            head = head.next;
            tail.next = head;
            return;
        }
        Node temp = head;
        do{
            Node n = temp.next;
            if(n.data == val){
                temp.next = n.next;
                if(tail==n) tail=temp;
                System.out.println("Deleted element : "+temp.data);
                temp = temp.next;
                break;
            }
        } while(temp != head);
    }
    public void display(){
        if(head == null) {
            System.out.println("List is empty");
            return;
        }
        Node temp = head;
        do{
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        } while(temp!=head);
        System.out.println(temp.data+" (HEAD) ");
    }

    public static void main(String[] args) {
        deletion cd = new deletion();
        cd.delete(14);
        cd.display();
        cd.delete(12);
        cd.display();
        cd.delete(13);
        cd.display();
        cd.delete(10);
        cd.display();
        cd.delete(11);
        cd.display();
    }
}
