// Queue Implementation.

package questions.project.EmployeWork;

import questions.Queue.Implementation.QueueByList;

public class EmployeeQueue {
    Node front,rear;
    class Node{
        private Employee emp;
        private Node next;

        public Node(Employee emp) {
            this.emp = emp;
        }
    }
    public void enqueue(Employee emp)
    {
        Node node = new Node(emp);
        if(rear==null && front==null){
            front=rear=node;
            return;
        }
        rear = rear.next = node;
    }
    public void display()
    {
        Node temp = front;
        while (temp!=rear.next){
            System.out.println( "Employee Name : "+temp.emp.getName() + " \t Work Allowance : "+temp.emp.isWorkingFromHome());
            temp = temp.next;
        }
        System.out.println("END");
    }
}
