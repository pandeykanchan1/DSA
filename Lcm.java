import java.util.Scanner;
public class Lcm {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("enter 1st num");
        int  first=input.nextInt();
        System.out.println("enter 2nd num");
        int secand=input.nextInt();
        int lcm=lcm(first, secand);
        System.out.println(lcm);


    }
    public static int lcm(int first,int secand){
     int i=0;
     while(true){
        int factor=first*i;
        if(factor%secand==0){
            return factor;
        }
        i++;
     }
    //    return 0;
    }

}
