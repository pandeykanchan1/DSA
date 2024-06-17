import java.util.Scanner;

public class bitOddEven {
    public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
      System.out.println("enter  your number");
       int n=input.nextInt();
       if((n & 1)==0){
          System.out.println("even");
       }else{
        System.out.println("odd");
       }
    }
}
