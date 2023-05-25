import java.util.*;
public class chk {
    public static int gcd(int a, int b)
    {
        if(b==0) return a;
        else return gcd(b,a%b);
    }
    public static boolean check_prime(int n)
    {
        if(n%2==0 || n==1) return false ;
        for(int i=3;i<=Math.sqrt(n);i+=2)
            if(n%i==0) return false;
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        int temp = n;
        int s = 0, sum = 0;
        while (temp > 0) {
            s = s * 10 + temp % 10;
            sum += temp % 10;
            temp /= 10;
        }
        System.out.println("Reverse : " + s);
        System.out.println("Sum : " + sum);
        if (check_prime(n)) System.out.println("It is prime");
        else System.out.println("It is not prime");

        System.out.println("GCD : " + gcd(s, n));
        System.out.println("LCM  : " + (n * s) / gcd(n, s));
    }
}
