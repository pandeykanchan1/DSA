import java.util.Scanner;

public class array{
    public static void main(String[] args) {
     int  marks[]={56,56,78};
     update(marks);
      
      /* 
      
      //declaretion of array
        int marks[]=new int[30];


     //   int number[]={1,2,4};


      //  String fruits[]={"aple","mango","orange"};
       
     Scanner input=new Scanner(System.in);
     marks[0]=input.nextInt();
     marks[1]=input.nextInt();
     marks[2]=input.nextInt();
     marks[2]=marks[2]+2;
     System.out.println("phy: "+marks[0]);
     System.out.println("math: "+marks[1]);
    System.out.println("chem:"+marks[2]);
*/





    }
    public static void update(int marks[]){
         for(int i=0;i<marks.length;i++){
              marks[i]=marks[i]+1;

              //prnt marks
             for( i=0;i<=marks.length;i++){
                     System.out.print(marks[i]+" ");
             } 
             System.out.println();
         }    
    }
}