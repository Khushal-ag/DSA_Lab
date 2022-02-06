package questions.Recursion;

import java.util.Scanner;

public class boleanSearch {
    public static boolean find(int[] a,int currentIndex,int value)
    {
        if(currentIndex == a.length) return false;
        else if(a[currentIndex] == value) return true;
        return find(a,currentIndex+1,value);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        int value = sc.nextInt();
        if(find(a,0,value)) System.out.println("Present");
        else System.out.println("Not Present");
    }
}
