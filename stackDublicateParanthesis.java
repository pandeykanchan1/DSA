import java.util.*;

public class stackDublicateParanthesis {
    //microsoft google 
    public static boolean isDublicate(String str){
        Stack<Character>s=new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
          
            //closing
            if(ch==')'){
               int count=0;
               while(s.peek()!='('){
              s.pop();
              count++;
               } if(count<1){
                return true;
               }else{
                s.pop();   //opning pair
               }
            }else{
                //opning 
                s.push(ch);
            }

        }
        return false;
    }
    public static void main(String[] args) {
        String str="(a+b)"; //true
        String str2="((a-b))";  //false
      System.out.println(isDublicate(str));
    }
}
