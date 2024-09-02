import java.util.Scanner;
public class whileLoop {
    public static void main(String[] args) {
       /* 
        int num=1;   //initilization
       
       while (num<=10) {    //condiotion
            System.out.println(num);
            num=num+1;   //updste the condiotion
        }
        int count=200;
        while(count>=100){
            System.out.println(count);
            count=count-1;
        }
        */
    Scanner input=new Scanner(System.in);
    System.out.println("enter num");
    int num=input.nextInt();
    int i=0;
    while(i<=num) {
        System.out.println(i);
       i=i+1; 
    }

    }
}
