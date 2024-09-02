public class oopSuperKey {
    public static void main(String[] args) {
        Horse h=new Horse();
        System.err.println("hello");
        
    }
}
class Animal{
    Animal(){
       System.out.println("animal constructo is called"); 
    }
}
class Horse extends Animal{
    
    Horse(){
        super();
        System.out.println("horse constructor is called");
    }
}
