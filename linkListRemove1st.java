public class linkListRemove1st {
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


  public void addFirst(int data){
    //step 1  crete new node
    Node newNode=new Node(data);
    size++;
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


   //remove 1st
   public int removeFirst(){
    if(size==0){
        System.out.println("linked list is empty");
      return Integer.MAX_VALUE;
    }else if(size==1){
        int val=head.data;
        head=tail=null;
        size=0;
        return val;
    }
    int val=head.data;
    head=head.next;
    size--;
    return val;

   }
  public static void main(String[] args) {
    linkListRemove1st ll=new linkListRemove1st();
      ll.addFirst(1);
      ll.addFirst(2);
      ll.addLast(6);
      ll.addLast(8);
      System.out.println("before remove");
      ll.printLinkLint();   
     // System.out.println(ll.size);
     ll.removeFirst();
     System.out.println("after remove");
     ll.printLinkLint();

    }

}
