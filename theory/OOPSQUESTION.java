package theory;
import java.util.*;
// //ques 8
// class Book {
//     int price;
//     static int count;
//     public Book (int price){
//         this.price=price;
//         count++;
//     }
// }
// public class OOPSQUESTION{
//     public static void main(String[] args) {
//         System.out.println(Book.count);
//         Book b1=new Book(150);
//         Book b2=new Book(250);
//         System.out.println(Book.count);
//     }
// }

// //ques 9
// class Test{
//     static int marks;
//     void set_marks(int marks){
//         this.marks=marks;
//     }
// }
// class OOPSQUESTION{
//     public static void main(String[] args) {
//         Test t=new Test();
//         t.set_marks(98);
//         System.out.println(Test.marks);
//     }
// }

// //ques 10
// class Test{
//     static int a=10;
//     static int b;
//     static void changeB(){
//         b=a*3;
//     }    
// }
// class OOPSQUESTION{
//     public static void main(String[] args) {
//      Test t=new Test();
//      t.changeB();
//      System.out.println(Test.a+Test.b);
//     }
// }

// //ques 5
// public class OOPSQUESTION {
//     public static void main(String[] args) {
//         Vehicle obj1=new Car();
//         obj1.print();
//         Vehicle obj2 =new Vehicle();
//         obj2.print();
//     }
// }
// class Vehicle {
//     void print(){
//         System.out.println("Base class (Vehicle)");
//     }
// }
// class Car extends Vehicle{
//     void print(){
//         System.out.println("Derived class(car)");
//     }
// }

// //ques 6
// public class OOPSQUESTION {
//     public static void main(String[] args) {
//         Vehicle obj1=new Car();
//         obj1.print1();//this line show erroe because there is no print1 class is there
//         Vehicle obj2=new Vehicle();
//         obj2.print();
//     }
// }
// class Vehicle {
//     void print(){
//         System.out.println("Base class(vehicle)");
//     }
// }
// class Car extends Vehicle{
//     void print1(){
//         System.out.println("Derived class(car)");
//     }
// }

// ques 7
// aggeregation is not the concept in oops

// assignmaent question

// //ques 1
// class Complex{
//     int real;
//     int imag;
// public Complex(int r,int i){
//     real=r;
//     imag=i;
// }
// public static Complex add(Complex a,Complex b){
// return new Complex((a.real+b.real), (a.imag+b.imag));
// }
// public static Complex diff(Complex a,Complex b){
//     return new Complex((a.real-b.real), (a.imag-b.imag));
//     }
//     public static Complex product(Complex a,Complex b){
//         return new Complex((a.real*b.real)-(a.imag*b.imag), (a.imag*b.real)+(a.real*b.imag));
//         }
//         public void printComplex(){
//             if(real==0&&imag!=0){
//                 System.out.println(imag+"i");
//             }else if(real!=0&&imag==0){
//                 System.out.println(real);
//             }else{
//                 System.out.println(real+","+imag+"i");
//             }
//         }
// }
// class Solution{
//     public static void main(String[] args) {
//         Complex c=new Complex(4, 5);
// Complex d=new Complex(9, 19);
// Complex e= Complex.add(c, d);
// Complex f=Complex.diff(c, d);
// Complex g=Complex.product(c, d);
// e.printComplex();
// f.printComplex();
// g.printComplex();
//     }
// }

// // ques 2
// class Automobile{
//     private String drive(){
//         return "Driving vehicle";
//     }
// }
// class Car extends Automobile{
//     protected String drive(){
//         return "Driving car";
//     }
// }
// public class OOPSQUESTION extends Car{
//     public final String drive(){
//         return "Driving electric car";
//     }
//     public static void main(String[] args) {
//         final Car car=new OOPSQUESTION();
//         System.out.println(car.drive());
//     }
// }

//  //ques 4
// abstract class Car{
//     static{
//         System.out.println("1");
//     }
//     public Car (String name){
//         super();
//         System.out.println("2");
//     }
//     {
//         System.out.println("3");
//     }
// }
// public class OOPSQUESTION extends Car{    //IN QUESTION BLUECAR is given we replace that with OOPSQUESTION 
// {
//     System.out.println("4");
// }
// public OOPSQUESTION(){
//     super("blue");
//     System.out.println("5");
// }
// public static void main(String []args){
//     new OOPSQUESTION();
// }
// }
