// //bubble sorting
// import java.util.Scanner;
// class Sorting {
//     public static void printArray(int arr[]){
//         for(int i=0;i<arr.length;i++){
//         System.out.print(arr[i]+" ");
// }
// System.out.println();
// }
//  public static void main(String args[]){
// int arr[]={7,8,9,33,48,1,3,4,};
// for (int i=0;i<arr.length-1;i++){
//     for (int j=0;j<arr.length-1-i;j++){
// if(arr[j]>arr[j+1]){
//     int a=arr[j];
//     arr[j]=arr[j+1];
//     arr[j+1]=a;
// }
// }
// }
// printArray(arr);
// }   
// }

// //selection sort
import java.util.*;
public class Sorting  {
    public static void printArray(int arr[]){
                for(int i=0;i<arr.length;i++){
                System.out.print(arr[i]+" ");
        }
        System.out.println();
        }
public static void main (String args[]){
int arr[]={7,8,9,33,5,6,4};
for (int i=0;i<arr.length-1;i++){
    int smallest=i;
    for (int j=i+1;j<arr.length;j++){
    if (arr[smallest]>arr[j]){
        smallest=j;
    }
    }
int temp=arr[smallest];
arr[smallest]=arr[i];
arr[i]=temp;
}printArray(arr);
}
}

// //inertion sort
// import java.util.*;
// public class Sorting  {
// public static void printArray(int arr[]){
//             for(int i=0;i<arr.length;i++){
//             System.out.print(arr[i]+" ");
//     }
//     System.out.println();
//     }
//     public static void main (String args[]){
//         int arr[]={7,8,9,33,5,6,4};
//     for (int i=1;i<arr.length;i++){
//         int current=arr[i];
//         int j=i-1;
//         while(j>=0 && current<arr[j]){
//             arr[j+1]=arr[j];
//             j--;
//         }
//     arr[j+1]=current;
//     }    
//     printArray(arr);
// }}

