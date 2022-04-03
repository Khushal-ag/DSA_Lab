package questions.Trees.BinaryTree.BFS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class implementation {
    static Scanner sc = new Scanner(System.in);

    class TreeNode {
        int data;
        TreeNode right, left;

        public TreeNode(int data) {
            this.data = data;
            left = right = null;
        }
    }

    TreeNode root;

    public void insert(int value) {
        root = insertRec(root, value);
    }

    public TreeNode insertRec(TreeNode root, int val) {
        if (val == -1) return root;
        root = new TreeNode(val);
        System.out.print("Enter value for Left of " + root.data + " : ");
        root.left = insertRec(root.left, sc.nextInt());
        System.out.print("Enter value for Right of " + root.data + " : ");
        root.right = insertRec(root.right, sc.nextInt());
        return root;
    }

    public void levelOrder(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while (!q.isEmpty()) {
            if (q.peek() == null) {
                if(q.size()-1 == 0) break;
                else {
                    System.out.println();
                    q.add(null);
                    continue;
                }
            }
            if (q.peek().right != null) q.add(q.peek().right);
            if (q.peek().left != null) q.add(q.peek().left);
            System.out.print(q.poll()+" ");
        }
    }
    public static void main(String[] args) {
        implementation obj = new implementation();
        System.out.print("Enter Root : ");
        obj.insert(sc.nextInt());
        System.out.println("Level Order -> ");
        obj.levelOrder(obj.root);
    }
}
