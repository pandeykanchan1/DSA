public class oops {
    public static void main(String[] args) {
        Pen p1=new Pen(); //creted a  pen object called p1
       p1.setColor("blue");
       System.out.println(p1.color);

      Bnkacc myac=new Bnkacc();
      myac.username="kanchan";
      myac.setPswword("h123");
      

      p1.setTip(5);    //set kiye vlaue
      System.out.println(p1.getTip());    //print kra diya get se
   
   
   
     //construcor 
     Student s1=new Student("kanchan");
       System.out.println(s1.name);
       s1.roll=12;
       System.out.println(s1.roll);
   Student s3=new Student(123);
     System.out.println(s3.roll);
       //non parameter
       Student s2=new Student();
       //System.out.println(s2);



       //copy consturctor
       Student s4=new Student(s1);
      
    }
    
}


 class Pen   {
    String color;
    int tip;
     String getColor(){
        return this.color;
     }
    void setColor(String newColor){
         color=newColor;
    }
    int getTip(){
        return this.tip;
    }
    void setTip(int newTip){
        tip=newTip;
    }
}



class Bnkacc   {
   public String username;
   String password; 
   public void setPswword(String pswd){
    password=pswd;
   } 
    
}

/**
 * Inneroops
 */


 //construcor
 class Student {
    String name;
    int roll;

    Student( String name){     // parameterized constructor
      this.name=name;
    }

  Student(int roll){
    this.roll=roll;
  }
      Student(){               //non parametrer
        System.out.println("hello");
      }
//copy constructor
      Student(Student s1){
        this.name=s1.name;
        this.roll=s1.roll;
      }
    }
    
