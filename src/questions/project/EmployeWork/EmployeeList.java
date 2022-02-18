package questions.project.EmployeWork;

public class EmployeeList {
    private Node head;
    private Node tail;
    private int size;

    class Node{
        Employee ele1;
        Node next;

        public Node(String name,boolean work) {
            ele1 = new Employee();
            ele1.setName(name);
            ele1.setWorkingFromHome(work);
        }
    }

    public void insert(String name,boolean work)
    {
        Node node = new Node(name,work);
        size++;
        if(head==null)
        {
            head = node;
            tail = head;
            return;
        }
        tail.next = node;
        tail = node;
    }


}
