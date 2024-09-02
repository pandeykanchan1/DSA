import java.util.Scanner;;
public class gcd {
    public static void main(String[] args) {
      Scanner input= new Scanner (System.in);
    System.out.println("enter 1st num");
      int a=input.nextInt();
      System.out.println("enter 2nd num");
      int b=input.nextInt(); 
      int gcd=gcd(a, b) ;
      System.out.println(gcd);

    
}
public static int gcd(int a,int b){
   int gcd=1;
   int i=2;
   int least=least(a,b);
   while (i<=least) {
    if(a%i==0 && b%i==0){
        gcd =i;

    }
    i++;
   }
   return gcd;
}
public static int least(int a,int b){
    if(a<b){
        return a;
    }else{
        return b;
    }
}
}