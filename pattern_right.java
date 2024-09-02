import java.util.Scanner;
public class pattern_right {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
         System.out.println("enter num for printing *");
        int rows=input.nextInt();
       
       pattrn(rows);


    }
    public static void pattrn(int maxrow){
       int rows=maxrow;
        while(rows>0){
            int i=0;
            while(i<rows){
                System.out.print("  *");
              i++;  
            }

            System.out.println();
           rows--;
        }
    }
}
