public class BSTdeletNode {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;

        }
    }
    public static Node insert(Node root,int val){
        if(root==null){
           root=new Node(val);
           return root; 
        }
        if(root.data>val){
            //left subtree
        root.left=    insert(root.left, val);
        }else{
            //right subtree
            root.right=insert(root.right, val);
        }
        return root;
    }
    public static Node delet(Node root,int val){
        if(root.data<val){
            root.right=delet(root.right,val);
        }else if(root.data>val){
            root.left=delet(root.left, val);

        }else{
            //voila  //valv ya key mil jisko dlt krna h
            //case 1   - leaf node
            if(root.left ==null && root.right==null){
                return null;

            }
            //case 2 - single child
            if(root.left==null){
                return root.right;
            }else if(root.right==null){
                return root.left;
            }
            //case 3 - both childrens
            Node IS=findinOrderSuccessor(root.right);
            root.data=IS.data;
            root.right=delet(root.right, IS.data);
        }
        return root;

    }
    public static Node findinOrderSuccessor(Node root){
        while(root.left!=null){
          root=root.left;  
        }
        return root;
    }

     //print 
     public static void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    public static void main(String[] args) {
        int values[]={8,5,3,1,4,6,10,11,14};
        Node root=null;
        for(int i=0;i<values.length;i++){
            root=insert(root, values[i]);
        }
        inorder(root);
        System.out.println();
      root=  delet(root, 1);
        inorder(root);
    }
}
