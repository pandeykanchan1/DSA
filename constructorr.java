public class constructorr {
   String color;
   float price;
   int maxSpeed;
   int noOfSeat;





   //default constructor

   

   constructorr(){                      //create constructor
    // color="black";
    //  price=45000;
    this("black");
    noOfSeat=6;

   }





//paramiterized constructor


   constructorr(String color){
   this. color=color;
    price=45000;
    maxSpeed=150;
    noOfSeat=8;

    


   }

    public static void main(String[] args) {
        
        constructorr car=new constructorr("red");
       constructorr swift=new constructorr();

       System.out.println(car.color);      
       System.out.println(car.price);
    }

}
