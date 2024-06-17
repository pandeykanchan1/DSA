public class binarySearch {
    public static void main(String[] args) {
        int number[]={2,4,6,7,8,12,14};
        int key=8;
        System.out.println("index for key is  :"+binarySeach(number, key));

    }
    public static int binarySeach(int[] number,int key){
        int start=0;
        int end=number.length-1;
        while(start<=end){
            int mid=(start+end)/2;

            //comparisio

            if(number[mid]==key){
                return mid;
            }if(number[mid]<key){   //right
               start=mid+1;

            }else{   //lest
             end=mid-1;
            }

        }
     return -1;
    }
}
