package questions.Stack;

public class stackByList {
    Stack top;
    int size;
    class Stack{
        int data;
        Stack next;

        public Stack(int data, Stack next) {
            this.data = data;
            this.next = next;
        }
    }
    public void push(int data)
    {
        size++;
        Stack temp = new Stack(data,null);
        if(top==null){
            top = temp;
            return;
        }
        temp.next = top;
        top = temp;
    }
    public void pop()
    {
        if(top==null){
            System.out.println("Stack is empty");
            return;
        }
        System.out.println("Deleted element : "+top.data);
        top = top.next;
        size--;
    }
    public void peep()
    {
        if(top==null){
            System.out.println("Stack is empty");
            return;
        }
        Stack temp = top;
        while (temp!=null)
        {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        stackByList ll = new stackByList();
        ll.push(10);
        ll.push(15);
        ll.push(18);
        ll.push(20);
        ll.peep();
        ll.pop();
        ll.push(25);
        ll.peep();
    }
}
