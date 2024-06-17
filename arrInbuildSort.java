import java.util.Arrays;
import java.util.Collections;


public class arrInbuildSort {
    public static void main(String[] args) {
        Integer[] arr={5,2,6,3,1};
    
      Arrays.sort(arr,0,3);
        printArr(arr);

        System.out.println();
        Arrays.sort(arr);
        printArr(arr);

        System.out.println( );
        Arrays.sort(arr,Collections.reverseOrder());
         printArr(arr);



    }

    public static void printArr(Integer[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
