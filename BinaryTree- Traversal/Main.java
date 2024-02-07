public class Main {
    public static void main(String[] args) {
        BinaryTree b=new BinaryTree(10);
        b.insertleft(b.root,5);
        b.insertright(b.root,15);
        b.insertleft(b.root.left,3);
        b.insertright(b.root.left,8);
        b.insertleft(b.root.right,12);
        b.preorder(b.root);//preorder traversal
        System.out.println();
        b.inorder(b.root);//inorder traversal
        System.out.println();
        b.postorder(b.root);//postorder traversal
        System.out.println();

     }
}
