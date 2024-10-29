
import java.util.Scanner;
class recursion  {
// // 1.   public static void printNumber(int n){
//         if(n==6){
//             return;
//         }
//         System.out.println(n);
//         printNumber(n+1);
//         System.out.println(n);
//     }
// public static void main (String args[]){
//     int n=1;
//     printNumber(n);
// }
// }

// // 2.   public static int printfactorial(int n) {
// if(n==0||n==1){
//         return 1;
//     }
//    int fact1= printfactorial(n-1);
//     int fact2=n*fact1;
//     return fact2;
// }
// public static void main(String[] args) {
//     int n=5;
//     int ans =printfactorial(n);
//     System.out.println(ans);
// }
// }

// // 3.   fibonacci sequence: sum of previous two term
// public class recursion{
//     public static void Printfib(int a,int b,int n) {
//         if(n==0){
//             return;
//         }int c=a+b;
//         System.out.println(c);
//         Printfib(b,c, n-1);    
//     }
//     public static void main(String[] args) {
//     int a=0,b=1;
//     System.out.println(a);
//     System.out.println(b);
//     int n=6;
//     Printfib(a, b, n-2);
//     }

// // 4.    sum of n term
// public class recursion{
//     public static void PrintSum(int a,int n,int sum) {
//         if(a==n){
//             sum=sum+a;
// System.out.println(sum);
//        return;
//      }     
//         sum=sum+a;                    //we can also write it as sum+=a;
//           PrintSum(a+1, n, sum);
//     }
//     public static void main(String[] args) {
//         PrintSum(1, 5, 0);
//     }
// }

// // 5.    Print Power x^n(stack height:n,stack height is the no. of time operation occur)
// public class recursion{
//         public static int  PrintPower(int x,int n) {
// if(x==0){
// return 0;
// } if (n==1){
//     return x;
// }
// int Pownmo1=PrintPower(x, n-1);
// int Pown=x*Pownmo1;
// return Pown;
// } 
// public static void main(String[] args) {
//     int x=2,n=5;
//     int ans=PrintPower(x, n);
//     System.out.println(ans);
// }
// }

// // 6.    print power x^n(stack height:logn)
// public class recursion  {
//     public static int CalculatePower(int x,int n) {
//         if (n==0){
//             return 1;
//         }if (x==0){
//             return 0;
//         }
//         //for even power
//         if (n%2==0){
//             return CalculatePower(x,n/2)*CalculatePower(x, n/2);
//         }//for odd power
//         else {
//             return CalculatePower(x,n/2)*CalculatePower(x, n/2)*x;
//         }
//     }
// public static void main (String args[]){
// int n=3;int x=3;
// int ans =CalculatePower(x, n);
// System.out.println(ans);
// }
// }

// // 7.    public static void printNumber(int n,int i){
//     if(i==n){
//        System.out.println(fact);
//     }

// // 8.    printNumber(n,i+1);
//     int factorial =1;
//     int fact =factorial*i;
// }
// public static void main (String args[]){
// printNumber(7,1);
// }
// }

// public static void printNumb(int n){
//     for (int i=n;i>0;i--){

    
//     if( i==0){
// break;
//     }else{
//         System.out.println(i);
//     }
// }}
public static void printNumb(int n){
    if(n==0){
        return;
    }
    System.out.println(n);
    printNumb(n-1);

}

public static int  printfactorial(int n){
    if(n==1){
        return 1 ;
    }
    // printfactorial(n-1);    
       int factorial=n * printfactorial(n-1);
       return factorial;
}

public static void printsum(int i,int n,int sum){
    if (i==n){
        System.out.println(sum+n);
        return ;
    }
    printsum(i+1,n,i+sum);
    return ;
}

public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    System.out.println(printfactorial(a));
    // System.out.println(printsum(1,a,0));
    printsum(1, a, 0);

}
}
