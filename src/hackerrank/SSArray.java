package hackerrank;

import java.util.Scanner;

public class SSArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t =  sc.nextInt();
        while(t>0)
        {
            int[] hash = new int[2^31 - 1];
            int n= sc.nextInt();
            int m= sc.nextInt();
            int[] arr1 = new int[n];
            int[] arr2 = new int[m];
            for (int i = 0; i < arr1.length; i++) {
                arr1[i]=sc.nextInt();
                hash[Math.abs(arr1[i])] = 1;
            }
            int f = 0;
            for (int i = 0; i < arr2.length; i++) {
                arr2[i]=sc.nextInt();
                if (hash[Math.abs(arr2[i])]!=1) f=1;
            }
            if(f==0) System.out.println("Yes");
            else System.out.println("No");
            t--;
        }
    }
}
