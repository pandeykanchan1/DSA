public class linkListRemveNth {
    //amazon adobe flipcart

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


      public void removeNthFromEnd(int n){
       //calculate size of ll
       int sizee=0;
       Node temp=head;
       while(temp!=null){
        temp=temp.next;
        sizee++;
       }
       if(n==sizee){
        head=head.next;  //remove 1st
        return;
       }

       //Sizee-n  
       int i=1;
       int idexToFind=sizee-n;
       Node prev=head;

       while(i<idexToFind){
          prev=prev.next;
          i++;
       }
       prev.next=prev.next.next;
       return;


      }


      public static void main(String[] args) {
         // linkListRevrse ll=new linkListRevrse();
        // removeNthFromEnd ll= new removeNthFromEnd();
        linkListRemveNth ll=new linkListRemveNth();
          ll.addLast(1);
          ll.addLast(2);
          ll.addLast(3);
          ll.addLast(4);
          ll.addLast(5);
          ll.printLinkLint();
          ll.removeNthFromEnd(3);
          ll.printLinkLint();
        }


}
