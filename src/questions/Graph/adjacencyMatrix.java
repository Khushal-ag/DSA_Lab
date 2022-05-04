package questions.Graph;

import java.util.ArrayList;
import java.util.Scanner;

public class implementation {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the number of vertices : ");
            int n = sc.nextInt();
            System.out.print("Enter the number of edges : ");
            int m = sc.nextInt();
            ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                adj.add(new ArrayList<>());
            }
            for (int i = 0; i < m; i++) {
                System.out.print("Enter the edge : ");
                int u = sc.nextInt();
                int v = sc.nextInt();
                adj.get(u).add(v);
                adj.get(v).add(u);
            }

        }
}
