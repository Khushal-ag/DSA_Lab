package questions.LinkList.singly;

public class EvenOddString {
    private ListNode head;

    class ListNode{
        private char val;
        private ListNode next;

        public ListNode(char val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
    public void insertLast(char val)
    {
        ListNode node = new ListNode(val,null);
        if(head==null){
            head = node;
            return;
        }
        ListNode temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next = node;
    }
    public void display()
    {
        ListNode temp = head;
        while(temp!=null)
        {
            System.out.print(temp.val);
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        EvenOddString[] ll = new EvenOddString[args.length];
        for(int i = 0;i< args.length;i++)
        {
            ll[i] = new EvenOddString();
            for (int j=0;j< args[i].length();j++)
            {
                boolean b = (int)(args[i].charAt(j)) % 2 == 1;
                if(b) ll[i].insertLast('O');
                else ll[i].insertLast('E');
            }
        }
        for (int i = 0; i < ll.length; i++) {
            ll[i].display();
        }
    }
}
