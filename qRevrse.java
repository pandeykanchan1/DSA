import java.util.*;
public class qRevrse {
    public static void revrse(Queue<Integer>q){
        Stack<Integer>s=new Stack<>();
        int size=q.size();
        while(!q.isEmpty()){
            s.push(q.remove());
        }
        while(!s.isEmpty()){
            q.add(s.pop());
        }
    }
     
    public static void main(String[] args) {
     Queue<Integer>q=new LinkedList<>(); 
     q.add(1);
     q.add(2);
     q.add(3);
     q.add(4);
     revrse(q);
     while(!q.isEmpty()){
        System.out.print(q.remove()+" ");
     }
     System.out.println();

    }
}
