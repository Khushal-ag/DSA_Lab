package questions.Graph;

import java.util.ArrayList;
import java.util.Scanner;

public class Dfs {
    public static void dfs(int node,boolean vis[],ArrayList<ArrayList<Integer>> adj,ArrayList<Integer> dfs)
    {
        dfs.add(node);
        vis[node] = true;
        for(var i:adj.get(node))
        {
            if(vis[i]==false)
            {
                dfs(i,vis,adj,dfs);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of vertices : ");
        int n = sc.nextInt();
        System.out.print("Enter the number of edges : ");
        int m = sc.nextInt();
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            adj.add(new ArrayList<>());
        }
        for(int i=1;i<=m;i++)
        {
            System.out.print("Enter the edge : ");
            int u = sc.nextInt();
            int v = sc.nextInt();
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        ArrayList<Integer> dfs = new ArrayList<Integer>();
        boolean vis[] = new boolean[n+1];
        for(int i=1;i<=n;i++)
        {
            if(vis[i] == false)
            {
                dfs(i,vis,adj,dfs);
            }
        }
        for(var i:dfs)
            System.out.print(i+" ");
    }
}
