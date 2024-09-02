//import Fish.dog;

public class oopInheritance {
    public static void main(String[] args) {
    //    Fish shark=new Fish();
      // shark.eat();
       // Dog ob=new Dog();
      //  ob.eat();


//heirarchal inheritance
    Dog doog=new Dog();
    doog.eat();

    }
}




//base class




class Animal{
    String color;
    void eat(){
        System.out.println("eats");
    }
    void brid(){
        System.out.println("brid");
    }

}
//derived class or sub class
/* 
class Fish extends Animal{
    int fims;
    void swim(){
        System.out.println("swimm");
    }
 
}
//sub class or dervied clasd
class Dog extends Fish{
    int leg;
    void bark(){
     System.out.println("bark");
    }
 }
    */


  //heirarchal inheritance
  
  class Mammle extends Animal{
    void walk(){
    System.out.println("walk");
    }
    
  }
  class Dog extends Animal{
    void bark(){
        System.out.println("bark");
    }
  }
