package hackerrank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TransverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> l = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i=0;i<n;i++){
            l.add(sc.nextInt());
            if(l.get(i)>max) max = l.get(i);
            if(l.get(i)<min) min = l.get(i);
        }
        System.out.println(min);
        System.out.println(max);
    }
}
