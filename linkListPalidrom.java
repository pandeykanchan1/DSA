public class linkListPalidrom {
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





        //slow fast approach to find mid
       public Node findMid(Node head){
        Node slow =head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
          slow=slow.next;   //_+1
          fast=fast.next.next;  //+2

        }
        return slow;  //slow is my mid
       }


    public boolean checkPlaidrom(){
        if(head==null || head.next==null){
            return true;
        }
        //step 1  find mid
        Node midNode=findMid(head);
        //step2  revrse 2nd half
        Node prev=null;
        Node curr=midNode;
        Node next;
       while(curr!=null){
        next=curr.next;
        curr.next=prev;
        prev=curr;
        curr=next;
       }

       Node right=prev;    //right halft  head
      Node left=head;
        //step3  check left half and ringh half
        while(right!=null){
            if(left.data!=right.data){
               return false; 
            }
            left=left.next;
            right=right.next;
        }
        return true;
    }
      public static void main(String[] args) {
        linkListPalidrom ll =new linkListPalidrom();
          ll.addLast(1);
          ll.addLast(2);
          ll.addLast(1);
          //ll.addLast(4);
          //ll.addLast(5);
          //ll.printLinkLint();
        //ll. linkListPalidrom();
       // ll.checkPlaidrom();
       System.out.println(ll.checkPlaidrom());
        }



}
