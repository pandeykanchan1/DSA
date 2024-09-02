public class thisKey {
    float maxSpeed;                      //instance varieable of car
    int noOfWhello;                      //instace variable
    float currentFuelInLi;                 //instance varieable of car
     int noOfSeat;                         //instance varieable of car


     public thisKey start(){
        if(currentFuelInLi==0){
            System.out.println("car is out of fuel");
        } else if(currentFuelInLi<5)   {
            System.out.println("car is reseve mode");
        }   else{                  
        System.out.println("car is drive");
      //  currentFuelInLi--;
        }
        return this;
     }

     public void drive(){   
       
        currentFuelInLi--;
        System.out.println("car is driving");
        }
    




     public void addafuel(float fueal){
        currentFuelInLi +=  fueal;
   }
   public float getCurrentFuel(){                           //instace methode  of car  
      return currentFuelInLi;                            
   }



   public static void main(String[] args) {
 //  car myCar=new car();
    //myCar.addafuel(8);
 //   myCar.drive();
//   System.out.println( myCar.getCurrentFuel()); 


   thisKey swift=new thisKey();
   swift.addafuel(6);
   thisKey startcar=swift.start();
   startcar.drive();

}


}
