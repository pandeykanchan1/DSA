import java.util.Scanner;
public class Realational_op {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter age");

        int age=input.nextInt();
        if(age>=18){
            System.out.println("your are eligible for voting");

        }
        else{
            System.out.println("not eligible for voting");
        }
    }
}
