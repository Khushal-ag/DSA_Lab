/*
Write a program to find out and return the number of digits present in a number recursively.
    Sample Input 1 :
    156
    Sample Output 1 :
    3
    Sample Input 2 :
    7
    Sample Output 2 :
    1
*/
package questions.Recursion;

import java.util.Scanner;

public class noOfDigits {
    public static int count(int n)
    {
        if(n/10==0) return 1;
        return 1 + count(n/10);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        System.out.println("No. of digits : "+count(n));
    }
}
