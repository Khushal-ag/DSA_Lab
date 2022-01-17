package questions.Arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConvertArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        List<Integer> l = new ArrayList<>();
        for (int j : arr) {
            l.add(j);
        }
        System.out.println("ArrayList ->");
        for(var i:l){
            System.out.print(i+" ");
        }

    }
}
