public class car {                         //class
    float maxSpeed;                      //instance varieable of car
    int noOfWhello;                      //instace variable
    float currentFuelInLi;                 //instance varieable of car
     int noOfSeat;                         //instance varieable of car

  public void start(){

  }

    public void drive(){   
        if(currentFuelInLi==0){
            System.out.println("car is out of fuel");
        } else if(currentFuelInLi<5)   {
            System.out.println("car is reseve mode");
        }   else{                  
        System.out.println("car is drive");
        currentFuelInLi--;
        }
    }  
    public void addafuel(float fueal){
         currentFuelInLi +=  fueal;
    }
    public float getCurrentFuel(){                           //instace methode  of car  
       return currentFuelInLi;                            
    }
    public static void main(String[] args) {
        car myCar=new car();
        myCar.addafuel(8);
        myCar.drive();
       System.out.println( myCar.getCurrentFuel()); 

    }
}
