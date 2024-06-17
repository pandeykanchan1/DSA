public class bitPwrof2 {
   public static void main(String[] args) {
    System.out.println(powerTwo(16));
   }
   public static boolean powerTwo(int n){
   return (n&(n-1))==0;
   }   
}
