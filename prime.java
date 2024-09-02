import java.util.Scanner;
public class prime {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("ENTER NUM");
        int num=input.nextInt();
      //  int prrime=isPrime(num);
   //     System.out.println(prrime);
        boolean isPrime = isPrime(num);
        if(isPrime){
            System.out.println("your num is prime");
        }
        else{
            System.out.println("not prime");
        }
    }
    public static boolean isPrime(int num){
        int i=2;
        while(i<num){
         if(num%i==0){
            return false;
         }
         i++;
        }
        //i++;
        return true;
    }  
    
}
