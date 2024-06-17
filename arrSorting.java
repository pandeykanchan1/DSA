public class arrSorting {
    public static void main(String[] args) {
        int arr[]={5,4,1,3,2};

        bubleSort(arr);
        printArr(arr);

        seletionSort(arr);
        printArr(arr);

        countSort(arr);
        printArr(arr);


    }

    public static void seletionSort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
           int minPos=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[minPos]<arr[j]){
                    minPos=j;
                }
            }
            //swap
            int temp=arr[minPos];
            arr[minPos]=arr[i];
            arr[i]=temp;

        }
    }
    public static void countSort(int[] arr){
        int max=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        int count[]=new int[max+1];
        for(int i=0;i<arr.length;i++){
           int elemt=arr[i];
           count[elemt]++;

        }
        int k=0;
        for(int i=max;i>=0;i--){
            int freq=count[i];
      for(int j=1;j<=freq;j++){
        arr[k]=i;
        k++;
      }
        }
    }


    public static  void bubleSort(int arr[]){
        for(int turn=0;turn<arr.length;turn++){
         for(int j=0;j<arr.length-1-turn;j++){
             if(arr[j]<arr[j+1]){
                 //swap
               int temp=arr[j];
               arr[j]=arr[j+1];
               arr[j+1]=temp;  
             } 

         }
     }
     }


    public static void printArr(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
