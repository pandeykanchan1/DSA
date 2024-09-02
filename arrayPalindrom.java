public class arrayPalindrom {

    public static void main(String[] args) {
      System.out.println("welcom to palidrom chaker");
        int[] numarr=arrayUtility.inputArray();  
        boolean ispalin=isPalidrom(numarr);
        if(ispalin){
            System.out.println("your num is palidrom");

        }else{
            System.out.println("your num is not palidrom");
        }

 
    }



    public static boolean isPalidrom(int[] numarr){
       int i=0;
       while(i<numarr.length/2){
        if(numarr[i]!=numarr[numarr.length-1-i]){
            return false;
        }
        i++;
       }
        return true;

    }
}