public class revraseArray {
    public static void main(String[] args) {
        System.out.println("welcome to array reverse ");
        int[]  numarray=arrayUtility.inputArray();
        revseARR(numarray);
        System.out.println("your revsese array is");
        arrayUtility.displayArray(numarray);
    }

    public static void revseARR(int [] numarray){
        int i=0;
        while(i<numarray.length/2){
            int swap=numarray[i];
            numarray[i]=numarray[(numarray.length-1)-i];

            numarray[(numarray.length-1)-i]=swap;

            i++;
        }
    }
}
