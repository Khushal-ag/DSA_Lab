package questions.Trees.BinaryTree;

import java.util.Scanner;

public class MinNodeTree {
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
    public int calMin(TreeNode root) // function for min element
    {
        if(root == null)
            return Integer.MAX_VALUE;
        return Math.min(root.data,Math.min(calMin(root.right),calMin(root.left)));
    }
    public static void main(String[] args) {
        MinNodeTree obj = new MinNodeTree();
        System.out.print("Enter Root : ");
        obj.insert(sc.nextInt());
        System.out.println("Min element : "+obj.calMin(obj.root));
    }
}
