public class minArray {
    public static void main(String[] args) {
        int[] numarr=arrayUtility.inputArray();
        System.out.println("welcom to finf the min value in the array");
        int min=min(numarr);
        System.out.println("min value of the array  :"+min);

    }
    public static int min(int[] numarr){
        int index=0;
        int min=numarr[0];
      while(index<numarr.length){
        if(min>numarr[index]){
            min=numarr[index];
        }
        index++;
      }
        return min;
    }
}
