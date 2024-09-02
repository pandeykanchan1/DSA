import java.util.Scanner;
public class arrayUtility {
    public static int[] inputArray() {
        Scanner input= new Scanner(System.in);

        //1D array

        System.out.println("enter the size of array");
        int size=input.nextInt();
        int[] nums=new int [size];
        int i=0;
        while(i<size){
            System.out.println("please enter no "+(i+1));
            nums[i]=input.nextInt();
            i++;  
        }
        return nums;

    }

    public static void displayArray(int[] nums){
        int i=0;
        while(i<nums.length){
            System.out.println(nums[i] + "  "  );
            i++;
        }
        System.out.println();

    }


    //2d array utility

    public static int[][] input2DArray(){
      System.out.println("enter number of rows");
      Scanner input=new Scanner(System.in);
      int row= input.nextInt();
      System.out.println("enter num of column ");
      int col=input.nextInt();
      int[][] nums=new int[row][col];


      int i=0;
      while(i<row){
        int j=0;
        while (j<col) {
            System.out.print(" enter element of rows  "+i+1
            + " ,  colom: "+(j+1)+"  :" );
           nums[i][j]=input.nextInt();
            j++;
            
        }
        i++;
      }
      return nums;

    }
}







