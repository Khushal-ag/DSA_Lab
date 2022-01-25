package hackerrank;

import java.util.Scanner;

public class HiddenNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int sum =0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        if(sum% arr.length==0) System.out.println(sum/ arr.length);
        else System.out.println("-1");
    }
}
