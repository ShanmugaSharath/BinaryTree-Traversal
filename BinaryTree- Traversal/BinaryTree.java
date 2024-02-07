public class BinaryTree
{
    Node root;
    class Node
    {
        int data;
        Node left,right;
        public Node(int data)
        {
            this.data=data;
            this.left=null;
            this.right=null;
        }

    }
    public BinaryTree(int data)
    {
        root=new Node(data);
    } 
    
    public void insertleft(Node n,int val)
    {
        Node newNode=new Node(val);
        n.left=newNode;

    }
    public void insertright(Node n,int val)
    {
        Node newNode=new Node(val);
        n.right=newNode;
    }
    public static void preorder(Node root)
    {
        if(root!=null)
        {
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
        }
    }
    public static void inorder(Node root)
    {
        if(root!=null)
        {
            inorder(root.left);
           System.out.print(root.data+" ");
           inorder(root.right);
        }
    }
    public static void postorder(Node root)
    {
        if(root!=null)
        {
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data+" ");
        }
    }
    
}