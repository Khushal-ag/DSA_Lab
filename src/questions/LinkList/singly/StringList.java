/*
Enter a string from user and store each character of a string in
different nodes of a linked list and print the values.

Input :  neeraj
Output :  n -> e -> e -> r -> a -> j
*/
package questions.LinkList.singly;

import java.util.Scanner;

public class StringList {
    class Node{
        private char val;
        private Node next;

        public Node(char val, Node next) {
            this.val = val;
            this.next = next;
        }
    }
    private Node head = null;
    public void insert(char val)
    {
        Node node = new Node(val,null);
        if(head==null){
            head = node;
            return;
        }
        Node temp = head;
        while (temp.next != null)
        {
            temp = temp.next;
        }
        temp.next = node;
    }
    public void display()
    {
        Node temp = head;
        while (temp != null)
        {
            System.out.print(temp.val+" -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringList ll = new StringList();
        System.out.print("Enter string : ");
        String s = sc.next();
        for (int i=0;i<s.length();i++)
        {
            ll.insert(s.charAt(i));
        }
        ll.display();
    }
}
