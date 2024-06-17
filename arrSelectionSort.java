public class arrSelectionSort {
    public static void main(String[] args) {
        int[] arr={5,4,1,3,2};
        seletionSort(arr);
        printSeletionSort(arr);
    }
    public static void seletionSort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
           int minPos=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[minPos]>arr[j]){
                    minPos=j;
                }
            }
            //swap
            int temp=arr[minPos];
            arr[minPos]=arr[i];
            arr[i]=temp;

        }
    }
    public static void printSeletionSort(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
//time compelexity of this is o(n^2)