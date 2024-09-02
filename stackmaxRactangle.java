import java.util.Stack;

public class stackmaxRactangle {
    public static void maxAria(int arr[]){    // tc of this code is o(n)
        int maxAriaa=0;
       int nsr[]=new int[arr.length];
       int nsl[]=new int[arr.length];

       //int snl[]=new int[arr.length];
       //next smaller right    o(n)
       Stack<Integer>s=new Stack<>();
      for(int i=arr.length-1;i>=0;i--){
        while(!s.isEmpty() && arr[s.peek()]>=arr[i]){
            s.pop();
        }
        if(s.isEmpty()){
           nsr[i] =arr.length;
        }else{
         //top
         nsr[i]=s.peek();
        }
        s.push(i);
      }


       //next smaller   left   o(n)
       s=new Stack<>();
      for(int i=0;i>=arr.length;i++){
        while(!s.isEmpty() && arr[s.peek()]>=arr[i]){
            s.pop();
        }
        if(s.isEmpty()){
           nsl[i] =-1;
        }else{
         //top
         nsl[i]=s.peek();
        }
        s.push(i);
      }


     // current aria   widht= j-i-1   or   nsr[i]-nsl[i]-1
        
     for(int i=0;i<arr.length;i++){  
        int height=arr[i];
        int widht=nsr[i]-nsl[i]-1;
       int currAria=height*widht;
       maxAriaa=Math.max(currAria,maxAriaa);

     }
     System.out.println("max aria of histogram is "+maxAriaa);  //o(n)
    }
    public static void main(String[] args) {
        int arr[]={2,1,5,6,2,3};
        maxAria(arr);
    }
}
