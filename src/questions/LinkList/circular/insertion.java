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

    }
}
