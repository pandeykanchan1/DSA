import java.util.LinkedList;

public class linkListMergeSort {

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


      public Node getMid(Node head){
        Node slow=head;
        Node fast=head.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
      }
      public Node merge(Node head1,Node head2){
        Node mergedLL=new Node(-1);
        Node temp=mergedLL;
        while(head1!=null && head2!=null){
          if(head1.data<=head2.data){
            temp.next=head1;
            head1=head1.next;
            temp=temp.next;
          }else{
            temp.next=head2;
            head2=head2.next;
            temp=temp.next;
          }
        }
        while(head1!=null){
            temp.next=head1;
            head1=head1.next;
            temp=temp.next;

        }
        while(head2!=null){
            temp.next=head1;
            head1=head1.next;
            temp=temp.next;

        }
        return mergedLL.next;
      }
    public Node mergerSoret(Node head){
        if(head==null || head.next==null){
            return head;
        }
   //find mid
   Node mid=getMid(head);

   //left ringht Ms
   Node righthead=mid.next;
   mid.next=null;
   Node newLeft=mergerSoret(head);
   Node newRinght=mergerSoret(righthead);

   //merger
   return merge(newLeft,newRinght);
      }
      public static void main(String[] args) {
        //crete linkList
       linkListMergeSort ll=new linkListMergeSort();
      LinkedList<Integer>lll=new LinkedList<>();
       lll.addFirst(1);
       lll.addFirst(2);
       lll.addFirst(3);
       lll.addFirst(4);
       lll.addFirst(5);
    //5>4>3>2>1
    System.out.println(lll);
   ll.head= ll.mergerSoret(ll.head);
   System.out.println(ll.head);


    }

    //tc o(nlogn)
}
