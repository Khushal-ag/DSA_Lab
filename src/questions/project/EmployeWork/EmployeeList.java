// LinkList Implementation

package questions.project.EmployeWork;

public class EmployeeList {
    private Node head;
    private Node tail;
    private int size;

    class Node{
        Employee ele;
        Node next;

        public Node(String name,boolean work) {
            ele = new Employee();
            ele.setName(name);
            ele.setWorkingFromHome(work);
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
    public Employee get(int index)
    {
        if(index > size) return null;
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp.ele;
    }

}
