import java.util.*;
public class pattern  {
public static void main (String args[]){
 Scanner ap =new Scanner(System.in);
 int n=ap.nextInt();
//  int m=ap.nextInt(); 
// //  rectangle
//     for(int i=1;i<=n;i++){
//     for(int j=1;j<=m;j++){
//    System.out.print("*");
//     }
//  System.out.println();
// }

// // hollow rectangle   
//  for(int i=1;i<=n;i++){
//      for(int j=1;j<=m;j++){
//      if(i==1||j==1||i==n||j==m){
//      System.out.print("*"); ///use print instead of println otherwise it print dont print hollow rectangle
//       }else{
//         System.out.print(" ");
//       }
//     }
//  System.out.println();
// }

// // right angle triangle
// for(int i=1;i<=n;i++){
//      for(int j=1;j<=i;j++){
//        System.out.print("*");//dont use m variable
//       }
//     System.out.println();
// }

///inverted right angle triangle
// for(int i=n;i>=1;i--){ ///i-1 =i--
//      for(int j=1;j<=i;j++){
//      System.out.print("*");//dont use m variable
//     }
//     System.out.println();
// }

///opposite right angle triangle
// for(int i=1;i<=n;i++){ //i-1 =i--
//       for(int j=1;j<=n-i;j++){
//        System.out.print(" ");///dont use m variable
//     }for (int j=1;j<=i;j++){
//        System.out.print("*");
//    }
//    System.out.println();
// }

///numric right angle triangle
// for(int i=1;i<=n;i++){ 
//      for(int j=1;j<=i;j++){
//        System.out.print(j);//dont use m variable
//     }
//      System.out.println();
// }

///inverted numric right angle triangle
//  for(int i=n;i>=1;i--){ 
//      for(int j=1;j<=i;j++){
//        System.out.print(j);//dont use m variable
//     }
//      System.out.println();
// }

// right angle triangle with increasing counting
for(int i=1;i<=n;i++){ 
     for(int j=1;j<=i;j++){
       System.out.print(j);//use m variable
           j++;
        }
    System.out.println();
}

///print binry no. in right angle triangle
// for(int i=1;i<=n;i++){ 
//   for(int j=1;j<=i;j++){             //dont use m
//         int sum= i+j;
//        if(sum%2==0){
//        System.out.print("1 ");
//       } else {
//         System.out.print("0 ");
//       }
//     }
//     System.out.println();
// }

///inverted opposite right angle triangle
// for(int i=n;i>=1;i--){                                  //i-1 =i--
//       for(int j=1;j<=n-i;j++){
//        System.out.print(" ");                         ///dont use m variable
//     }for (int j=1;j<=i;j++){
//        System.out.print("*");
//    }
//    System.out.println();
// }

///inverted opposite right angle triangle decreasing value
// for(int i=n;i>=1;i--){ 
//      for(int j=1;j<=n-i;j++){
//       System.out.print(" ");
//      }
//      for(int j=i;j>=1;j--){
//        System.out.print(j);//dont use m variable
//     }
//      System.out.println();
//}

}
}