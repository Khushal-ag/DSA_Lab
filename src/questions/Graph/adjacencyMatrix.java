package questions.Graph;

import java.util.ArrayList;
import java.util.Scanner;

public class adjacencyMatrix {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the number of vertices : ");
            int n = sc.nextInt();
            System.out.print("Enter the number of edges : ");
            int m = sc.nextInt();
            int[][] adj = new int[n+1][n+1];
            for(int i = 1; i <= m; i++) {
                System.out.print("Enter the edge : ");
                int u = sc.nextInt();
                int v = sc.nextInt();
                adj[u][v] = 1;
                adj[v][u] = 1;
            }
            for(int i=0;i<adj.length;i++)
                System.out.print(i+" ");
            System.out.println();
            for(int i=1;i<adj.length;i++)
            {
                System.out.print(i+" ");
                for (int j = 1; j < adj[i].length;j++)
                {
                    System.out.print(adj[i][j]+" ");
                }
                System.out.println();
            }
        }
}
