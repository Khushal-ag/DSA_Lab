/*Perform digit sum as given and store it in queue and then display it.
Digit sum referred to as 123 -> (1+2+3)+(2+3)+(3)
Take input as command line argument.
*/
package questions.Queue;

public class QueueDigitSum {
    private Node front,rear;
    class Node{
        String s;
        Node next;

        public Node(String s, Node next) {
            this.s = s;
            this.next = next;
        }
    }
    public void insert(String s)
    {
        Node node = new Node(s,null);
        if(rear==null && front==null){
            front=rear=node;
            return;
        }
        rear = rear.next = node;
    }
    public void display()
    {
        if(front==null)
        {
            System.out.println("Queue is empty");
            return;
        }
        Node temp = front;
        while (temp!=rear.next){
            System.out.print(temp.s + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public int noSum(int n)
    {
        int sum=0;
        while(n>0)
        {
            sum += n%10;
            n /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        if(args.length<=3){
            QueueDigitSum q = new QueueDigitSum();
            for (int i = 0; i < args.length; i++) {
                int sum=0;
                for (int j = 0; j < args[i].length(); j++) {
                    String s = args[i];
                    int n = Integer.valueOf(s.substring(j));
                    sum += q.noSum(n);
                }
                q.insert(String.valueOf(sum));
            }
            q.display();
        }
        else System.out.println("Wrong no. of arguments");
    }
}
