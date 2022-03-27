package questions.Trees;

class TreeNode{
    int data;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) {
        data = x;
        left = right = null;
    }
}

public class implementByRecursion {
    public static void preOrder(TreeNode node)
    {
        if(node == null) return;

        System.out.print(node.data+" ");
        preOrder(node.left);
        preOrder(node.right);
    }
    public static void inOrder(TreeNode node)
    {
        if(node == null) return;

        inOrder(node.left);
        System.out.print(node.data+" ");
        inOrder(node.right);
    }
    public static void postOrder(TreeNode node)
    {
        if(node == null) return;

        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.data+" ");
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(5);
        root.left.right = new TreeNode(6);
        root.left.left = new TreeNode(7);
        System.out.print("\nPreOrder -> ");
        preOrder(root);
        System.out.print("\nInOrder -> ");
        inOrder(root);
        System.out.print("\nPostOrder -> ");
        postOrder(root);
    }
}
