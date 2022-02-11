package questions.Arrays;

import java.util.Scanner;

public class RearrangeEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of elements : ");
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] res = new int[n];
        int f=0,r=n-1;
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
            if(a[i]%2==0){
                res[f] = a[i];
                f++;
            }
            else{
                res[r] = a[i];
                r--;
            }
        }
        for (var i :
                res) {
            System.out.print(i+" ");
        }
    }
}
