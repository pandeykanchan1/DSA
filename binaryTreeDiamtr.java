public class binaryTreeDiamtr {
    static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
       
    }
    public static int height(Node root){
        if(root==null){
            return 0;
        }
        int lh=height(root.left);
        int rh=height(root.right);
     return   Math.max(lh,rh)+1;
        }

        //approach 1 for calculating dimtr of tree
        public static int diamtr(Node root){
            if(root==null){
                return 0;
            }
            int leftDimtr=diamtr(root.left);
            int leftHt=height(root.left);
            int rightDimtr=diamtr(root.right);
           int rightHt=diamtr(root.right);
             int selfDiamtr=leftHt+rightHt+1;
           return Math.max(selfDiamtr, Math.max(leftDimtr, rightDimtr));
            //tc o(n^2)
        }
        

      //2nd approach for calculate dimtr of tree
      //isme height alg se calcute nahi hoga sath sath hoga   jiski wjh se tc kam lgega
   //tc o(n)
      static class info{
        int dimtr;
        int ht;
        public info(int dimtr,int ht){
            this.dimtr=dimtr;
            this.ht=ht; 
        }
      }
      public static  info diametr(Node root){
       if(root==null){
        return new info(0,0);
       }
        info leftInfo=diametr(root.left);
        info rightInfo=diametr(root.right);
        int diam=Math.max(Math.max(leftInfo.dimtr,rightInfo.dimtr),leftInfo.ht+rightInfo.ht+1);
       int ht=Math.max(leftInfo.ht,rightInfo.ht)+1;
       return new info(diam, ht);
      }
    public static void main(String[] args) {
        /*
              1
             / \
            2    3
            / \  / \
           4   5 6  7
           
         */
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);
       
        System.out.println(height(root));
      //  System.out.println("dimtr   ="+diamtr(root));
        System.out.println(diametr(root).dimtr);
    }
}
