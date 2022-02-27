package questions.Recursion;

import java.util.Scanner;

public class fibo {
    public int calFibo(int n)
    {
        if(n<=1) return n;
        return calFibo(n-1) + calFibo(n-2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        fibo obj = new fibo();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print(obj.calFibo(i)+" ");
        }
    }
}
