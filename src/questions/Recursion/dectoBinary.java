package questions.Recursion;

import java.util.Scanner;

public class dectoBinary {
    public static void convert(int n)
    {
        if(n==1 || n==0) {
            System.out.print(n);
            return;
        }
        convert(n/2);
        System.out.print(n%2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        convert(n);
    }
}
