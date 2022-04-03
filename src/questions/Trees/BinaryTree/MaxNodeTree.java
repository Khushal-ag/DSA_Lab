package questions.Trees.BinaryTree;

import java.util.Scanner;

public class MaxNodeTree {
    static Scanner sc = new Scanner(System.in);
    class TreeNode{
        int data;
        TreeNode left, right;

        public TreeNode(int data) {
            this.data = data;
            left = right = null;
        }
    }
    TreeNode root;
    // Method for insertion
    public void insert(int val)
    {
        root = insertRec(root,val);
    }
    public TreeNode insertRec(TreeNode root, int val)
    {
        if(val == -1)
        {
            return root;
        }
        root = new TreeNode(val);
        System.out.print("Enter value for Left of " + root.data + " : ");
        root.left = insertRec(root.left,sc.nextInt());
        System.out.print("Enter value for Right of " + root.data + " : ");
        root.right = insertRec(root.right,sc.nextInt());
        return root;
    }
    public int calMax(TreeNode root) // function for max element
    {
        if(root == null)
            return Integer.MIN_VALUE;
        return Math.max(root.data,Math.max(calMax(root.right),calMax(root.left)));
    }
    public static void main(String[] args) {
        MaxNodeTree obj = new MaxNodeTree();
        System.out.print("Enter Root : ");
        obj.insert(sc.nextInt());
        System.out.println("Max element : "+obj.calMax(obj.root));
    }
}
