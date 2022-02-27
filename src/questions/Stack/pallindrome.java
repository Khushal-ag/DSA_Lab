package questions.Stack;

import java.util.Scanner;

public class pallindrome {
    Stack top;
    int size;
    class Stack{
        char data;
        Stack next;

        public Stack(char data, Stack next) {
            this.data = data;
            this.next = next;
        }
    }
    public void push(char data)
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
    public String pop()
    {
        String res = "";
        Stack temp = top;
        while (temp!=null){
            res += temp.data;
            temp = temp.next;
        }
        return res;
    }

    public int getSize() {
        return size;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        pallindrome stk = new pallindrome();
        int n = sc.nextInt();
        String s = String.valueOf(n);
        for (int i = 0; i < s.length(); i++) {
            stk.push(s.charAt(i));
        }
        if(s.equals(stk.pop())) System.out.println("Pallindrome");
        else System.out.println("Not pallindrome");
    }
}
