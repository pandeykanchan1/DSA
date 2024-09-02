public class recursionArrLastOcc {
    public static void main(String[] args) {
        int arr[]={5,5,5,5};
          System.out.println(lastOcc(arr, 5, 0));
    }
    public static int lastOcc(int arr[],int key,int i){
        if(i==arr.length){
            return -1;
        }
       int islastOcc=lastOcc(arr, key, i+1);
       if(islastOcc!=-1){
        return islastOcc;
       }
       // check with self
       if(arr[i]==key){
        return i;}
       
      return i; 
    }

}
