package hackerrank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DesignationChallenge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<String> l = new ArrayList<>();
        List<String> res = new ArrayList<>();
        int c = 0;
        for (int i = 0; i < n; i++) {
            l.add(sc.nextLine().toUpperCase());
            if(l.get(i).contains("HR")){
                c++;
                res.add(l.get(i));
            }
        }
        System.out.println(c);
        for (var i:res) {
            System.out.println(i);
        }
    }
}
