public class oopAbstraction {
    public static void main(String[] args) {
        Horse h=new Horse();
        h.eat();
        h.walk();

        chicken c=new chicken();
        c.walk();
    }
}
abstract class Animal{
    void eat(){
        System.out.println("animal eat");
    }
    abstract void walk();
}

class Horse extends Animal{
   void walk(){
    System.out.println("walk ");
   }
}
class chicken extends Animal{
    void walk(){
        System.out.println("work on two legs");
    }
}