//  import java.util.Scanner;
// public class function  {
//     public static void PrintMyName(String name){///dont use space between PrintMyName and use camelcase font
//         System.out.println(name);
//     return ;
// }
// public static void main (String args[]){
// Scanner sc=new Scanner(System.in);
// String name=sc.next();
// PrintMyName(name);
// }
// }

// import java.util.Scanner;
// public class function  {
// public static int CalculateSum(int a,int b){
//     // int sum =a+b;
//     return a+b;
// }   
// public static void main (String args[]){
// Scanner sc=new Scanner(System.in);
// int a=sc.nextInt();
// int b=sc.nextInt();
// // int sum =CalculateSum(a,b);
// System.out.println("sum of two number is :"+CalculateSum(a, b));
// }
// }
// we can also write this code without using any int sum variable 

// import java.util.Scanner;
// public class function  {
//     public static int CalculateSum(int a,int b){//dont use space between PrintMyName and use camelcase font
//     return a+b;
// }
// public static void main (String args[]){
// Scanner sc=new Scanner(System.in);
// int a=sc.nextInt();
// int b=sc.nextInt();
// System.out.println("sum of two number is :"+ CalculateSum(a,b));
// }
// }

// public class function  {
//     public static int Calculateaverage(int a,int b,int c){//dont use space between PrintMyName and use camelcase font
//     return  (a+b+c)/3;
// }
// public static void main (String args[]){
// Scanner sc=new Scanner(System.in);
// int a=sc.nextInt();
//  int b=sc.nextInt();
// int c=sc.nextInt();
// float average=Calculateaverage(a,b,c);
// System.out.println("product of two number is :"+average);
// }
// }

//import java.util.Scanner;
// public class function  {
//     public static  void PrintFactorial(int n){     //dont use space between PrintMyName and use camelcase font
//     if(n<0){                                      //negative no. dont give factorial
//         System.out.println("invalid code");
//         return;
//     }
//     int factorial =1;
//     for(int i=n;i>=1;i--){
//         factorial=factorial*i;
//     }
//     System.out.println(factorial);
//     return;                               //if we are using void function so we dont need to write "return"
// }
// public static void main (String args[]){
// Scanner sc=new Scanner(System.in);
// int n=sc.nextInt();
// PrintFactorial(n);
// }
// }

// //sum of n odd number
// public class function{
// public static int SumofOddNumber(int a){
//     int sum=0;
//     for(int i=1;i<=a;i++){
//         if(i%2!=0){
//             sum=sum+i;
//         }
//     }
// System.out.println(sum);
// return sum;
// }
// public static void main(String[] args) {
//     Scanner sc=new Scanner(System.in);
//     int a=sc.nextInt();
//     int sum =SumofOddNumber(a);
//     System.out.println(sum);
// }
// }

//                         //   FOR PRACTICE
// public class function{
//     public static int CalculateSum(int a,int b){
//         return a+b;
//     }
//     public static int Calculateaverage(int a,int b,int c){
//         return (a+b+c)/3;
//     }
//     public static int CalculateProduct(int a,int b){
// int c=a*b;
// return c;
//     }
//     public static int Calculatefactorial(int n){
//       int factorial=1;
//         for(int i=n;i>1;i--){
// factorial=i*factorial;
//         }
//         return factorial;
//            }
//            public static void Calculatefactorial1(int n){
//             int factorial=1;
//               for(int i=n;i>1;i--){
//         factorial=i*factorial;
//               }
//               System.out.println(factorial);
//               return;
//             }
//             public static int SumOdd(int n){
//                 int a=0;
//                 for(int i=1;i<=n;i=i+2){
// a=a+i;
//                 }
//                 return a;
//             }  
//         }