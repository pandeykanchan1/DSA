public class arrayMax {
    public static void main(String[] args) {
        int[] numarray=arrayUtility.inputArray();
        int max=maxx(numarray);
        System.out.println("max of thde array is  "+max);
    }
    public static int maxx(int[] numArray){
        int index=0;
        int max=numArray[0];
        while(index<numArray.length){
            if(max<numArray[index]){
               // int max= numArray[index+1];
           max=numArray[index];
            }
            index++;
        }
        return max;
    }
}
