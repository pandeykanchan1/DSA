//import java.util.Stack;

public class oopStatic {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.scholName="RK mission school";
      //  System.out.println(s1.scholName);
        
        Student s2=new Student();
        System.out.println(s2.scholName);

    }
}
class Student{

  // methods ko v static bna skte ex
  static int returnPercentage(int  math,int phy,int chem){
    return (math+phy+chem)/3;
    
  }

    String name;
    int roll;
    static String scholName;
    void setName(String name){
        this.name=name;

    }

    String getName(String name){
       return  this.name;

    }


}
