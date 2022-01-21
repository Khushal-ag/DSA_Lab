package questions.Recursion;

import java.util.Scanner;

public class printSeries {
    public static int print(int n)
    {
        if(n==1){
            System.out.print(n+" ");
            return n+1;
        }
        System.out.print(print(n-1)+" ");
        return n+1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();
        print(n);
    }
}
