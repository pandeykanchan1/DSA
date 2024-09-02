import java.util.Stack;
//importent    
public class stackNextGreterInterger {
    public static void main(String[] args) {
        int arr[]={6,8,0,1,3};
        Stack<Integer>s=new Stack<>();
        int nextGretet[]=new int[arr.length];
        for(int i=arr.length-1;i>=0;i--){
            //1 while 
            while(!s.isEmpty() && arr[s.peek()]<=arr[i]){
                s.pop();

            }
            //2 else if
            if(s.isEmpty()){
                nextGretet[i]=-1;
            }else{
                nextGretet[i]=arr[s.peek()];

            }
            //push in stack
            s.push(i);
        }
        //print next geter
        for(int i=0;i<nextGretet.length;i++){
            System.out.print(nextGretet[i]+" ");
        }
        System.out.println();
  

        //question forms
        //next greter left
        //next smaller right
        //next smallr left

    }
}
