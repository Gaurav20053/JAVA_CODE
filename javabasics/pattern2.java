import java.util.*;
public class pattern2 {
public static void main (String args[]){
    Scanner ap=new Scanner(System.in);
    int n= ap.nextInt();

// //butterfly
    // int m= ap.nextInt();
    //upper half
    for(int i=1;i<=n;i++){
        ///1st part
       for(int j=1;j<=i;j++){
           System.out.print("*");
        }
            for(int j=1;j<=2*(n-i);j++){
        System.out.print(" ");
        }
        ///2nd part
        for(int j=1;j<=i;j++){
           System.out.print("*");
        }
   System.out.println();
}
//lower half
for(int i=n;i>=1;i--){
        ///1st part
       for(int j=1;j<=i;j++){
           System.out.print("*");
       }
               for(int j=1;j<=2*(n-i);j++){
       System.out.print(" ");
       }
        ///2nd part
       for(int j=1;j<=i;j++){
           System.out.print("*");
        }
   System.out.println();
    }

// ///rhombus
//     for(int i=1;i<=n;i++){
//    for(int j=1;j<=n-i;j++){
//        System.out.print(" ");
//     }
//     for(int j=1;j<=n;j++){
//        System.out.print("*");
//     }
//    System.out.println();
// }

///pyramid with row no.
// for(int i=1;i<=n;i++){
//    for(int j=1;j<=n-i;j++){
//        System.out.print(" ");
//     }for(int j=1;j<=i;j++){
//        System.out.print(i+" ");
//     }
// System.out.println();
// }

///palindromic pattern/ mirror pattern
// for (int i=1;i<=n;i++){
//    for (int j=1;j<=n-i;j++){
//        System.out.print(" ");
//    }for(int j=i;j>=1;j--){
//        System.out.print(j);
//     }for(int j=2;j<=i;j++){
//        System.out.print(j);
//     }
// System.out.println();
// }

/// diamond
// for(int i=1;i<=n;i++){
//    for(int j=1;j<=n-i;j++){
//        System.out.print(" ");
//     }for(int j=1;j<=2*i-1;j++){
//        System.out.print("*");
//     }System.out.println();
// }
// //lower half
// for(int i=n;i>=1;i--){
//    for(int j=1;j<=n-i;j++){
//        System.out.print(" ");
//     }for(int j=1;j<=2*i-1;j++){
//        System.out.print("*");
//     }
//     System.out.println();
// }
// }

}
}