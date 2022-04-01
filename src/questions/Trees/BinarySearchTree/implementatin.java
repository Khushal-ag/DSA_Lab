package questions.Trees.BinarySearchTree;
class TreeNode{
    int data;
    TreeNode right;
    TreeNode left;
    TreeNode(int data){
        this.data=data;
        right=null;
        left=null;
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
        {
            root.left = insertRec(root.left,data);
        }
        else if(data> root.data)
        {
            root.right = insertRec(root.right,data);
        }
        return root;
    }
    // 2. Traversal
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
    public boolean prime(int val){
        for(int i=2;i<=Math.sqrt(val);i++)
        {
            if(val%i ==0) return false;
        }
        return true;
    }
    // 3. Searching
    public void search(TreeNode root,int val){
        if(root.data == val){
            if(prime(val)==true) System.out.println("It is prime");
            else System.out.println("It is not prime");
        }
    }

    public static void main(String[] args) {

    }
}
