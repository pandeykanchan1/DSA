import java.util.Scanner;
public class Primee {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num=input.nextInt();
        int n=prime(num);
        System.out.println(n);
        
    }
    public static int prime(int num){
        int i=0;
        for( i=0;i<num;i++){
              if(num%i==0){
                System.out.println("this prime");
              }else{
                System.out.println("not prime");
              }
        }
       return num;
    }
}
