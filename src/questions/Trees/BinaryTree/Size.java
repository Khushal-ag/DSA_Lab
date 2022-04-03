package questions.Trees.BinaryTree;

import java.util.Scanner;

public class Size {
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
    public int size(TreeNode root)
    {
        if(root == null) return 0;
        return size(root.left)+size(root.right)+1;
    }

    public static void main(String[] args) {
        Size obj = new Size();
        System.out.print("Enter Root : ");
        obj.insert(sc.nextInt());
        System.out.println("Size of Tree : "+obj.size(obj.root));
    }
}
