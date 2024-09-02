public class linkedListSearchKey {
    
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

       public void addMid(int idx,int data){
        Node newNode=new Node(data);
        Node temp=head;
        int i=0;
        while(i<idx-1){
           temp=temp.next;
           i++; 
        }
        //i = idx-1  #prev
        newNode.next=temp.next;
        temp.next=newNode;


       }
       public int itrativeSearch(int key){  //tc o(n)
       Node temp=head;
       int i=0;
       while(temp!=null){
     if(temp.data==key){
        return i;
     }
        temp=temp.next;
        i++;
       }

       //key not found case
         return -1;
       }
    
      public static void main(String[] args) {
        linkedListSearchKey ll=new linkedListSearchKey();
        ll.addFirst(1);
          ll.addFirst(2);
          ll.addLast(6);
          ll.addLast(8);
          ll.addMid(2,78);
          ll.printLinkLint();
          System.out.println(ll.itrativeSearch(8));
          System.out.println(ll.itrativeSearch(65));
        }
    }
    








