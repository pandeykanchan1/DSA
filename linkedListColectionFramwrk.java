import java.util.LinkedList;
public class linkedListColectionFramwrk {
    public static void main(String[] args) {
        //create
        LinkedList<Integer>ll=new LinkedList<>();
        //add
        ll.add(1);
        ll.add(2);
        ll.add(0);
        ll.addFirst(9);
        //0->1-->2
        System.out.println(ll);
        //remove
        ll.removeFirst();
        ll.removeLast();
        System.out.println(ll);
    }
}
