 import java.util.Scanner;
public class odd_even_bitop {
    public static void main(String[] args) {
      Scanner input= new Scanner(System.in);
      System.out.println("enter num ");
      int num=input.nextInt();
      if((num&1) ==0) {
        System.out.println("even");
      }else{
        System.out.println("number is odd");
      }
    }
}
