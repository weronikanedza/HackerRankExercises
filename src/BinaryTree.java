class Node{
    Node right,left;
    int data;

    public Node(int data) {
        this.data = data;
    }
}

public class BinaryTree {
    public static void main(String[] args) {
        Node root=new Node(10);
        root.left=new Node(8);
        root.right=new Node(12);
        root.left.right=new Node(9);
        root.left.left=new Node(6);

        if (checkBST(root)) System.out.println("YES");
        else System.out.println("NO");
    }

   public static boolean checkBST(Node root){
       return check(root,true);
   }

   public static boolean check(Node root,boolean check){
       if(root.left!=null && check!=false){
           if (root.left.data>root.data) return false;
           else check=check(root.left,true);
       }

       if(root.right!=null && check!=false){
           if (root.right.data<root.data) return false;
           else check=check(root.right,true);
       }

       if(check==false) return false;
       else return true;
   }

}
