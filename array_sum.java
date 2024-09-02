import java.util.Scanner;
public class array_sum {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the element");
        int size=input.nextInt();
        int[] num=new int[size];
        int i=0;
        while(i<size){
            System.out.println("plese enter the element  "+(i+1));
            num[i]=input.nextInt();
            i++;
        }
    }
}