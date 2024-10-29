import java.util.*;
public class array {
public static void main(String[] args) {

// int [] marks={98,99,88,89,90,91};
// marks[0]=98;
// marks[1]=60;
// marks[2]=88;
// marks[3]=34;
// for(int i=0;i<=marks.length;i++ ){
// System.out.println(marks[i]);  
//     } 

// Scanner sc=new Scanner(System.in);
// int size =sc.nextInt();
// int[] marks = new int[size];
// for(int i=0;i<size;i++){
//     marks[i]=sc.nextInt();
// }
// int x=sc.nextInt();
// for(int i=0;i<size;i++){
// if(marks[i]==x){
//     System.out.println(i);
// }
// }
// }
// }


// public class array {
// public static void main (String args[]){
//     Scanner sc=new Scanner(System.in);
//     int size =sc.nextInt();
//     int[] marks=new int [size];
//    for(int i=0;i<size;i++){
//     marks[i]=sc.nextInt();
//    }
//    int max=Integer.MIN_VALUE;
//    int min=Integer.MAX_VALUE;
//    for(int i=0; i<marks.length;i++){
// if(marks[i]<min){
//     min=marks[i];
// }  
// if(marks[i]>max){
//     max = marks[i];
// } 
// }
// System.out.println("Largest number is :"+ max);
// System.out.println("smallest number is :"+ min);
// }
// }

// import java.util.Scanner;
// public class array  {
// public static void main (String args[]){
// Scanner sc=new Scanner(System.in);
// int a=sc.nextInt();
// int[] marks=new int[4];
// marks[0]=98;
// marks[1]=99;
// marks[2]=88;
// marks[3]=86;
// for (int i=0;i<4;i++){
//     System.out.println(marks [i]);
// }
// }
// }

// import java.util.Scanner;
// public class array  {
// public static void main (String args[]){
// Scanner sc=new Scanner(System.in);
// int size=sc.nextInt();
// int[] marks=new int[size];
// for (int i=0;i<size;i++){
// marks[i]=sc.nextInt();
// }
// for (int i=0;i<marks.length;i++){
//     System.out.println(marks[i]);
// }
// }
// }

// import java.util.Scanner;
// public class array  {
// public static void main (String args[]){
// Scanner sc=new Scanner(System.in);
// int size=sc.nextInt();
// int[] marks=new int[size];
// for (int i=0;i<size;i++){
//     marks[i]=sc.nextInt();
// }
//     for (int i=0;i<size;i++){
//         System.out.println(marks[i]);
//     }

// Scanner sc=new Scanner(System.in);
// int size=sc.nextInt();
// int marks[]=new int[size];
// for(int i=0;i<size;i++){
// marks[i]=sc.nextInt();
// }
// int max=marks[0];
// int min=marks[0];
// for(int i=0;i<size;i++){
//     if(marks[i]>max){
//         max=  marks[i];
//       }if (marks[i]<min){
//         min=  marks[i];
//       }  
// } 
// System.out.println("minimum value of array is :"+min);
//     System.out.println("maximum value of array is:"+max);    
// }
// }

                // PRACTICE
// int marks[]={56,45,33,23,22};
// OR
// int marks[]=new int[9];
// marks[1]=54;
// marks[0]=22;
// marks[2]=44;
// marks[4]=90;
// for (int i=0;i<marks.length;i++){
//     System.out.println(marks[i]);
// }
Scanner sc=new Scanner(System.in);
// int i;
// System.out.println("enter the size of element:");
// int size=sc.nextInt();
// int arr[]=new int[size];
// System.out.println("enter "+size+" element");
// for (i=0;i<size;i++){
//     arr[i]=sc.nextInt();
// }
// System.out.println("output");
// for (i=0;i<size;i++){
// System.out.println(arr[i]);
// }

// System.out.println("Enter size of array");
// int a= sc.nextInt();
// int am[]=new int[a];
// System.out.println("enter "+a+" element"); 
// for (int i=0;i<am.length;i++){
//     am[i]=sc.nextInt();
// }
// System.out.println("Enter the element you wanted to find");
// int x=sc.nextInt();
// int count=0;
// for(int i=0;i<am.length;i++){
//     if (x==am[i]) {
//         count++;
//         if(count>=1){
//             System.out.println("x found at "+ (i+1));
//             // break;
//         }else{
//             System.out.println("element not found");
//         }    }
// }

// System.out.println("enter the size of array");
// int size=sc.nextInt();
// int arr[]=new int[size];
// System.out.println("Enter "+size+" element");
// for(int i=0;i<arr.length;i++){
//     arr[i]=sc.nextInt();
// }
// int max=arr[0];
// int min=arr[0];
// for (int i=0;i<size;i++){
//     if(max<arr[i]){
//         max=arr[i];
//     }
//     }
// for (int i=0;i<size;i++){
//     if(min>arr[i]){
//         min=arr[i];
//     }
// }
// System.out.println("Minimum value is "+min);
// System.out.println("Maximum value is "+max);

System.out.println("Enter no. of rows");
int a=sc.nextInt();
System.out.println("enter no.of column");
int b=sc.nextInt();

int arr[][]=new int [a][b];
System.out.println("enter elments of 2D array");
for(int i=0;i<a;i++){
    for(int j=0;j<b;j++){
        arr[i][j]=sc.nextInt();
    }
    System.out.println();
}
System.out.println("OUTPUT");
for (int i=0;i<a;i++){
    for (int j=0;j<b;j++){
        System.out.print(arr[i][j]+" ");
    }
    System.out.println();
}
System.out.println("Enter the elment wanted to search");
int x=sc.nextInt();
for (int i=0;i<a;i++){
    for (int j=0;j<b;j++){
        if(arr[i][j]==x){
        System.out.print(arr[i][j]+" found at "+ "("+(i+1)+","+(j+1)+")");
    }}
    System.out.println();
}
}
}