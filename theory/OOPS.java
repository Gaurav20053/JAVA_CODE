package theory;
public class OOPS {
    
// //normal class
    // public static void main(String[] args) {
//     Pen p1 =new Pen();
//     p1.setcolor("blue");
//     p1.setTip(5);
//     System.out.println(p1.tip);
//     System.out.println(p1.color);
//     p1.setcolor("Red");
//     System.out.println(p1.color);
//  p1.setcolor("yellow");
//     System.out.println(p1.color);
//     p1.color="purple";
//     System.out.println(p1.color);
// p1.setlength(5);
// System.out.println(p1.length);
//     Student s1=new Student();
//     s1.calculatepercentage(88,99, 88);
//     System.out.println(s1.percentage);
//     s1.setname("gaurav");
//     s1.setAge(80);
//     System.out.println(s1.age);
//     System.out.println(s1.name);
// }
// }
// class Pen{
//     String color;
//     int tip;
//     int length;
//     void setcolor(String newColor){
//         color=newColor;
//     }
//     void setTip(int newTip){
//         tip =newTip;
//     }
//     void setlength(int newLength){
//        length=newLength;
//     }
// }
// class Student{
//     int age;    
//     float percentage;
//     String name;
//     void setAge(int newAge){
//         age=newAge;
//     }
//     void setname(String newName){
//         name=newName;
//     }
//     void calculatepercentage(int phy,int chem,int math){
//         percentage=(phy+chem+math)*100/300;
//     }
// }

  //access modifier
// public static void main(String[] args) {
//     BankAccount myAccount=new BankAccount();
//     myAccount.username="gaurav";
//     myAccount.setPassword("gsdfahui");
//     System.out.println(myAccount.getPassword());//we get the acess of private element by declaring that in get class otherwise we cant acess that directly
//     System.out.println(myAccount.username);
// }   
// }

// class BankAccount{
//     public String username;
//     private String password; //by using private class we restrict its access to this class only
//     public void setPassword(String pwd){
//         password=pwd;
//     }
//     public String getPassword(){
//         return this.password;
//     }
//     }
    
//getter and setter
//     public static void main(String[] args) {
//         Pen p1 =new Pen();
//         p1.setcolor("blue");
//         p1.setTip(5);
//         System.out.println(p1.getTip());
//         System.out.println(p1.getColor());
//         p1.setcolor("Red");
//         System.out.println(p1.getColor());
//      p1.setcolor("yellow");
//         System.out.println(p1.getColor());
//         System.out.println(p1.getColor());
//     }
// }
class Pen{
   private String color;
    private int tip;
    void setcolor(String newColor){
        this.color=newColor;
    }
    void setTip(int newTip){
        this.tip =newTip;
    }
    String getColor(){
        return this.color;
    }
    int getTip(){
        return this.tip;
    }
}

// //constructor
//  public static void main(String[] args) {
//     Student s1=new Student("ghgvvy",13213434);
//     System.out.println(s1.name +"    "+ s1.roll);
//     System.out.println(s1.name);
//     s1.password="asdfg";
//     Student s2=new Student(23434);
//     s2.name="jhgftfh";
//     System.out.println(s2.name);
//     s1.setRoll(12424423);
//     System.out.println(s1.roll);
//     // Student s3=new Student(23424,"idfhfgi",'eijijeio');
// }
//  }

//     class Student {
//         String name;
//         int roll;
//         String password;
//         int marks[];
//         Student(String name){
// this.name=name;
//         }
//         Student(int roll){
//             this.roll=roll;
//         }
//         void setRoll(int newRoll){
//             roll=newRoll;
//         }
//         Student(String name,int roll){
//             this.name=name;
//             this.roll=roll;
//             System.out.println("construction is called..");
//         }
//     }

//  //copy constructor
// public static void main(String[] args) {
//     Student s1= new Student();
//     s1.name="gaurav";
//     s1.roll=2321423;
//     s1.password="hdscbbs12";
//     s1.marks[0]=90;
//     s1.marks[1]=88;
//     s1.marks[2]=80;
//     Student s2=new Student (s1);
//     s2.password="huhdhfbug";
//     s1.marks[2]=99;
//     for(int i=0;i<3;i++){
//         System.out.println(s1.marks[i]);
//     }
// }
// }
// class Student{
//     int marks[];
//     String name;
//     String password;
//     int roll;
//     Student(Student s1){
//         this.name=s1.name;
//         this.roll=s1.roll;
//         for (int i=0;i<marks.length;i++){
//             this.marks[i]=s1.marks[i];
//         }
//     }
//     Student(String name){
//         marks=new int[3];
//         this.name=name;
//     }
//     Student (int roll){
//         marks=new int[3];
//         this.roll=roll;
//     }   
// Student(){
//             marks=new int[3];
//     System.out.println("gjsdhsjk");
// }

// //inheritence=base level inheritence(it is basic level of inheritence)
// public static void main(String[] args) {
//  Fish shark=new Fish();
//  shark.eat();
// Animal dog=new Animal();
// dog.color ="red";
// System.out.println(dog.color);
//  }
// }
// class Animal{
//     String color;
//     void eat(){
//         System.out.println("eats");
//     }
//     void brethe(){
//         System.out.println("breathe");
//     }
//     }
//     class Fish extends Animal{
//      int fins;
//      void swim(){
//         System.out.println("can swim in water");
//      }
//     }

// //multi level inheritence
//     public static void main(String[] args) {
// Mammals camel=new Mammals();
// camel.legs=4;
// Dog dobby=new Dog();
// dobby.legs=4;
// dobby.breed="german shaford";
// System.out.println(camel.legs);
// System.out.println(dobby.breed);
//        System.out.println(dobby.legs);
//         }
//        }
//        class Animal{
//            String color;
//            void eat(){
//                System.out.println("eats");
//            }
//            void brethe(){
//                System.out.println("breathe");
//            }
//            }
//            class Mammals extends Animal{
//             int legs;
//            }
//            class Dog extends Mammals{
//             String breed;
//            }

// //hierarchial inheritence
// public static void main(String[] args) {
//     Mammals human=new Mammals();
//     human.moves();
//     Bird crow=new Bird();
//     crow.moves();
//     Fish tuna=new Fish();
//     tuna.moves();
//             }
//            }
//            class Animal{
//                String color;
//                void eat(){
//                    System.out.println("eats");
//                }
//                void brethe(){
//                    System.out.println("breathe");
//                }
//                }
//                class Mammals extends Animal {
//                 void moves(){
//                     System.out.println("walks");
//                 }
//                }
//               class Fish extends Animal{
// void moves(){
//     System.out.println("swim");
// }
//               }
//               class Bird extends Animal{
// void moves(){
//     System.out.println("fly");
// }
            //   }

// //Hybrid inheritence
// public static void main(String[] args) {
//     Mammals human=new Mammals();
//     human.moves();
//     Tuna T=new Tuna();
//     T.moves();
//     T.fins=2;
//     System.out.println(T.fins);
//             }
//            }
//            class Animal{
//                String color;
//                void eat(){
//                    System.out.println("eats");
//                }
//                void brethe(){
//                    System.out.println("breathe");
//                }
//                }
//                class Mammals extends Animal {
//                 void moves(){
//                     System.out.println("walks");
//                 }
//                }
//               class Fish extends Animal{
//               void moves(){
//               System.out.println("swim");
//               }
//               }
//               class Tuna extends Fish{
//               int fins;
//               }

// //method overloading ==making constructor which is implement before running the code
// public static void main(String[] args) {
//     Calculator calc =new Calculator ();
//     System.out.println(calc.sum(1,2));
//     System.out.println(calc.sum((float) 1.5,(float) 3.4));
//     System.out.println(calc.sum(1,3,5));
// }
// }
// class Calculator{
//     int sum(int a,int b){
//         return a+b;
//     }
// float sum(float a,float b){
//     return a+b;
// }
// int sum(int a,int b,int c){
//     return a+b+c;
// }
// }

// //method overriding 
// public static void main(String[] args) {
//     Deer d=new Deer();
//     d.eat();
// }
// }
// class Animal{
//     void eat(){
//         System.out.println("eat anything ");
//     }
// }
// class Deer extends Animal{
//     void eat(){
//         System.out.println("eats grass");
//     }
// }

// //Abstraction 
// public static void main(String[] args) {
// Horse h=new Horse();
// h.eat();
// h.walks();
// System.out.println(h.color);
// Chiken c=new Chiken();
// c.eat();
// c.walks();
// System.out.println(c.color);
// Dog d=new Dog();
// d.eat();
// d.walks();
// System.out.println(d.color);
// Mustsang myhorse=new Mustsang(); //use while running mustang class
// }    
// }
// abstract class Animal{
// String color;
// Animal(){
//     // color="brown";//it is the initialisation of the variable for the child class until the color change it store as brown in the child class
//     System.out.println("animal constructor is called");//for mustang we  use this comment out this constructor while not using mustang
// }
//     void eat(){
//         System.out.println("animal eats");
//     }
//     abstract void walks();
// }
// class Horse extends Animal{
//     Horse(){
//         System.out.println("horse constructor is called");//for mustang we use this comment out this constructor while not using mustang
//     }
//     void walks(){
//         System.out.println("walks on 4 legs");
//         color="black";
//     }
// }
// class Chiken extends Animal {
//     void walks(){
// System.out.println("walks with 2 leg");
// color ="white";
//     }
// }
// class Dog extends Animal{
//     void walks(){
//         System.out.println("walks on 4 legs");
//     }
// }
// class Mustsang extends Horse{//this is made for know the priority of different level Animal--->Horse-->mustang
//     Mustsang(){
//         System.out.println("Mustang constructor is called");
//     }
// }

// //interface
// public static void main(String[] args) {
//     Queen q1=new Queen();
//     q1.moves();
//     King King =new King();
//     King.moves();
// }
// }
// interface ChessPlayer{
//     void moves();
// }
// class Queen implements ChessPlayer{
//     public void moves() {
//         System.out.println("up,down,left,right,diagonal in 4 direction");
//     }
// }
// class Rook implements ChessPlayer{
//     public void moves(){
//         System.out.println("right,left,up,down");
//     }
// }
// class pawn implements ChessPlayer{
//     public void moves(){
//         System.out.println("one step ahead,one step front+right/left while eliminating the opposition player chess piece");
//     }
// }
// class King implements ChessPlayer{
//     public void moves(){
//         System.out.println("up,down,left,right,diagonal(all by one step)");
//     }
// }

// //multiple inheritence using multiple interface
// public static void main(String[] args) {
//     Animal bear=new Animal();
//     bear.veg();
//     bear.nonveg();
//     Animal2 dog=new Animal2();
//     dog.veg();
//     dog.nonveg();
// }
// }
// interface Carnivorus{
//     void veg();
// }
// interface Harvivorus{
//     void nonveg();
// }
// interface omnivorus extends Carnivorus,Harvivorus {
// void veg();
// void nonveg();
// }
// class Animal implements Carnivorus,Harvivorus{
// public void veg(){
//     System.out.println("eat grass");
// }
// public void nonveg(){
//     System.out.println("eat meats");
// }
// }
// class Animal2 implements omnivorus{
//     public void veg(){
//         System.out.println("eat tree");
//     }
//     public void nonveg(){
//         System.out.println("eat nonveg");
//     }
// }

//  //static keyword
// public static void main(String[] args) {
//     Student s1=new Student();
//     s1.SchoolName="Nsps";
//     System.out.println(s1.SchoolName);
//     Student s2=new Student();
//     System.out.println(s1.SchoolName);
//     Student s3=new Student();
//     s3.SchoolName="SVM";
//     System.out.println(s3.SchoolName);
//     System.out.println(s1.SchoolName);
//    System.out.println( s3.returnPercentage(80, 90, 70));
// }
// }
// class Student{
//     static float returnPercentage(int math,int phy,int chem){  //it is function of static class 
//         return (math+phy+chem)/3;
//     }
//     String name;
//     int roll;
//     static String SchoolName;   //it is properties of the static 
//     void setName(String name ){
//         this.name=name;
//     }
//     String getName(){
//         return this.name;
//     }
// }

// //nested classses /inner classes of without static
// public static void main(String[] args) {
//     Outer O=new Outer();
//     O.show();
//     Outer.Inner I=O.new Inner(); //here we need to firstly create a outer object then we implement inner class
//     I.configr();
// }
// }
// class Outer {
//     int age;
//     public void show(){
//         System.out.println("in show");
//     }
// class Inner {
//     public void configr(){
//         System.out.println("in configur");
// }
// }
// }

// // inner class with static
// public static void main(String []args){
// Outer O=new Outer();
// O.show();
// Outer.Inner I=new Outer.Inner(); //we dont need to make a outer classobject to implement inner class
// I.configur();
// }
// }
// class Outer {               //we cant make outer class static othereise it show error
// int age;
// public void show(){
//     System.out.println("in show");
// }
// static class Inner {           //we make inner class static
// public void configur(){
//     System.out.println("in configur");
// }
// }
// }

// //block with static
// public static void main(String[] args) {
//     Mobile obj1=new Mobile();
//     obj1.brand="apple";
// System.out.println(obj1.brand);
// System.out.println(obj1.price=1500);
// System.out.println(Mobile.name);
// Mobile obj2=new Mobile();
// }
// }
// class Mobile{
//     String brand;
//     int price;
//     static String name;
//     static{
//         name="phone";
//         System.out.println("static is called");
//     }
//     Mobile(){
// brand=" ";
// price=200;
// System.out.println("constructor is called");
//     }
// }

// //super keyword
// public static void main(String[] args) {
//     Horse h=new Horse();
//     System.out.println(h.color);
// }
// }
//  class Animal{
//     String color;
//     Animal(){
//         System.out.println("animal constructor is called");
//     }    
// }
// class Horse extends Animal{
//     Horse(){      
//         super.color="brown";
//         System.out.println("horse constructor is called");
//     }
// }




// practice
public static void main(String[] args) {

}
}

