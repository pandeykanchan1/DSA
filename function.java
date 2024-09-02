public class function {
    public static void main(String[] args) {   //main method ko jvm call krta hai
        greeting();  //call the method
        printPattern();
    }
    public  static void greeting(){
        System.out.println("good morning everyone");
    }
    public static void printPattern(){
        int row=0;
        while(row<5){
            System.out.print("*");
            int i=0;
            while (i<row)  { 
                System.out.print("*");
                i++;
                
            }
            System.out.println();
            row++;
        }

    }
}
