package questions.Arrays;

import java.util.Scanner;

public class TrailingZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n = sc.nextInt();
        double fact = 1;
        while(n>1)
        {
            fact = fact * n;
            n--;
        }
        System.out.println("Factorial = "+fact);
        int count = 0,rem;
        while(true){
            rem = (int) (fact%10);
            if(rem!=0) break;
            else count++;
            fact /= 10;
        }
        System.out.println("Trailing Zeros = "+count);
    }
}
