
public class linkListRevrse {

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
    
    
      public void addFirst(int data){
        //step 1  crete new node
        Node newNode=new Node(data);
        if(head==null){
          head=tail=newNode;
          return;}
        //step 2   newNode =head    #newNpde me assign head value
          newNode.next=head;  //link      //next mtlb ptr 
          //step3 head=newNode
          head=newNode;
      }
    
      //create methode for add last
    
    public  void addLast(int data){
      Node newNode=new Node(data);
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


       //revrese ll
       public void revrseItrative(){
        Node prev=null;
        Node curr=tail=head;
        Node next;
        while(curr !=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
            
        }
        head=prev;

       }
    
      public static void main(String[] args) {
          linkListRevrse ll=new linkListRevrse();
         
          ll.addLast(1);
          ll.addLast(2);
          ll.addLast(3);
          ll.addLast(4);
          ll.addLast(5);
          ll.printLinkLint();
          ll.revrseItrative();
          ll.printLinkLint();
        }

}