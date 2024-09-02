/*import java.util.Scanner;
public class Userinp {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("enter your name");
      String name  =input.nextLine();
      System.out.println("welcome"+name);
      int age=input.nextInt();
      System.out.println("your age"+  age);
    }
}
*/
import java.util.Scanner;
public class Userinp {

    public static void main(String[] args) {
        Scanner inputt=new Scanner(System.in);
       System.out.println("enter name");
       String name= inputt.nextLine();
       System.out.println("welocome   :"+name);
     
       Scanner a=new Scanner(System.in);
       Scanner b=new Scanner(System.in);
       //Scanner c =new Scanner(System.in);
    System.out.println("enter 1s value");

      int inp1= a.nextInt();
       System.out.println("the sum"+ a+b);

     int inp2=  b.nextInt();
     int c=(inp1+inp2);

       
       //System.out.println("enter 1s value");
       //System.out.println("enter 2nd value");
      System.out.println("the sum"+ c);
        

        
    }
}