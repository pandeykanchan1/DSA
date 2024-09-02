import java.util.Scanner;;
public class fibonnacci {
    public static void main(String[] args) {
        Scanner input=new  Scanner(System.in);
        System.out.println("enter number");
        int num=input.nextInt();
        System.out.println("fabnnocci series");
         fibonnacci(num);
    }
    public static void fibonnacci(int num){
        if(num<0) return;
        System.out.println("0");
        if(num==00){
            System.out.println("1");
        }
        int first=0,secand=1;
        while (first+secand<=num) {
            int third=first+secand;
            System.out.println(third + " ");
            first=secand;
            secand=third;
        }
    }
}
