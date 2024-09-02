public class recusrisonArr1stOccr {
    public static void main(String[] args) {
        int arr[]={8,3,6,9,5,10,2,5,3};
        System.out.println(firstOcrr(arr, 5, 0));
    }
    public static int firstOcrr(int arr[],int key,int i){
       if(i==arr.length){
        return -1;
       }
        if(arr[i]==key){
            return i;
        }
      return  firstOcrr(arr, key, i+1);
    }
}
//output = 4
//time complexity o(n)
//space complexity o(n)