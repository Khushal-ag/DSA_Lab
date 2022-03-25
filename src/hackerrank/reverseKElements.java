package hackerrank;

import java.util.*;

public class reverseKElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        Deque<Integer> q = new LinkedList<>();
        Stack<Integer> s = new Stack<>();
        for(int i=1;i<=n;i++)
        {
            q.addLast(sc.nextInt());
        }
        for(int i=1;i<=k;i++)
        {
            s.push(q.removeFirst());
        }
        while(!s.isEmpty())
        {
            q.addLast(s.pop());
        }
        for(int i=1;i<=n-k;i++)
        {
            q.addLast(q.removeFirst());
        }
        while(!q.isEmpty())
        {
            System.out.print(q.removeFirst()+" ");
        }

    }
}
