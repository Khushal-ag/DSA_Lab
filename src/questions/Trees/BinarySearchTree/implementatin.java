package questions.Trees.BinarySearchTree;

import java.util.Scanner;

class TreeNode{
    int data;
    TreeNode right;
    TreeNode left;
    TreeNode(int data){
        this.data=data;
        right=left=null;
    }
}

public class implementatin {
    TreeNode root;
    // 1. Insertion
    public void insert(int data){
        root = insertRec(root,data);
    }
    public TreeNode insertRec(TreeNode root,int data)
    {
        if(root == null)
            return root;
        else if(data< root.data)
            root.left = insertRec(root.left,data);
        else if(data> root.data)
            root.right = insertRec(root.right,data);
        return root;
    }
    // 2. Traversal
    public void preOrder(TreeNode node)
    {
        if(node == null) return;

        System.out.print(node.data+" ");
        preOrder(node.left);
        preOrder(node.right);
    }
    public void inOrder(TreeNode node)
    {
        if(node == null) return;

        inOrder(node.left);
        System.out.print(node.data+" ");
        inOrder(node.right);
    }
    public void postOrder(TreeNode node)
    {
        if(node == null) return;

        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.data+" ");
    }
    public static boolean prime(int val){
        for(int i=2;i<=Math.sqrt(val);i++)
        {
            if(val%i ==0) return false;
        }
        return true;
    }
    // 3. Searching
    public static void search(TreeNode root, TreeNode prev, int val){
        if(root.data == val){
            if(prime(val)==true) System.out.println("It is prime");
            else System.out.println("It is not prime");
            if(root.data==prev.left.data) System.out.println("Left Node of "+prev.data);
            else if(root.data==prev.right.data) System.out.println("Right Node of "+prev.data);
        }
        search(root.left,root,val);
        search(root.left,root,val);
    }

    public static void main(String[] args) {
        implementatin obj = new implementatin();
        Scanner sc = new Scanner(System.in);
        int x;
        do {
            System.out.println("1. Insertion");
            System.out.println("2. Transversal");
            System.out.println("3. Searching");
            System.out.println("4. Exit");
            System.out.print("\nEnter Choice -> ");
            x = sc.nextInt();
            switch (x) {
                case 1:
                    System.out.print("Enter data : ");
                    obj.insert(sc.nextInt());
                    break;
                case 2:
                    System.out.print("\nPreOrder -> ");
                    obj.preOrder(obj.root);
                    System.out.print("\nInOrder -> ");
                    obj.inOrder(obj.root);
                    System.out.print("\nPostOrder -> ");
                    obj.postOrder(obj.root);
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Enter value to search : ");
                    search(obj.root,obj.root,sc.nextInt());
                    break;
            }
        } while (x != 4);
    }
}
