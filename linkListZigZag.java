public class linkListZigZag {
       
    public static class Node {
        int data;
        Node next;
        public Node(int data){
          this.data=data;
          this.next=null;
    
        }
      }
      public static Node head;
      public static Node tail;
      public static int size;
    
    
      //create methode for add last
    
    public  void addLast(int data){
      Node newNode=new Node(data);
      size++;
      if(head==null){
        head=tail=newNode;
        return;
      }
      tail.next=newNode;
      tail=newNode;
    }
    
       public void printLinkLint(){   //o(n)
        if(head==null){
          System.out.println("linked is empty ");
          return;
        }
        Node temp=head;
        while(temp!=null){
          System.out.print(temp.data+"--> ");   //print jo temp k andr data hai
         temp=temp.next;
        }
        System.out.println("null");
       }


    public void zigZag(){
       //find mid
       Node slow =head;
       Node fast=head.next;
       while(fast!=null && fast.next!=null){
        slow =slow.next;
        fast=fast.next.next;
        fast=fast.next.next;

       }
       Node mid=slow;


       //  revrse 2nd hlaf
     Node curr=mid.next;
     mid.next=null;
     Node prev=null;
     Node next;
     while(curr!=null){
        next=curr.next;
        curr.next=prev;
        prev=curr;
         curr=next; 
     }


     Node left=head;
     Node right=prev;
     Node nextL,nextR;

       // alternate merge  - zig zag merge
       while(left !=null && right!=null ){
            nextL=left.next;
            left.next=right;
            nextR=right.next;
            right.next=nextL;

            left=nextL;
            right=nextR;
       }
    }
      public static void main(String[] args) {
        linkListZigZag  ll=new linkListZigZag();
        ll.addLast(1);
          ll.addLast(2);
          ll.addLast(3);
          ll.addLast(4);
          ll.addLast(5);
          ll.addLast(6);
          ll.printLinkLint();
          ll.zigZag();
          ll.printLinkLint();
          //ll.addLast(4);
          //ll.addLast(5);
          //ll.printLinkLint();
        //ll. linkListPalidrom();
       // ll.checkPlaidrom();
        }



}



