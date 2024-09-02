public class oopPolymorphism {
    public static void main(String[] args) {
        //two types
         Calculator ob=new Calculator();
         //ob.sum(2.3,45.0 );
         System.out.println(ob.sum(12, 02));
         System.out.println(ob.sum((float)1.2,(float) 0.2));
         System.out.println(ob.sum(12, 02,5));




         //method overriding
         Dear ob1=new Dear();
         ob1.eat();
         Animal ob2=new Animal();
         ob2.eat();

    }
}
 // 1 ...compile time or methode oveloadiing

class Calculator{
    int sum(int a,int b){
        return a+b;
    }
    float sum(float a,float b){
        return a+b;
    }
    int sum(int a,int b,int c){
        return a+b+c;
    }
}

// ...2  rum time polymorphism or metheod orerriding 

class Animal{
    void eat(){
        System.out.println("eat bbbbbbhojan");
    }
    
}
class Dear extends Animal{
    void eat(){
        System.out.println("eats grass");
    }
}