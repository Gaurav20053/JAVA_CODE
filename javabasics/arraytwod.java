// import java.util.*;

// public class arraytwod  {
// public static void main (String args[]){
// Scanner sc=new Scanner(System.in);
// int rows=sc.nextInt();
// int col=sc.nextInt();
// int[][]marks=new int[rows][col];
// for (int i=0;i<rows;i++){
//     for (int j=0;j<col;j++){
//         marks[i][j]=sc.nextInt();
//     }
// }

// for(int i=0;i<rows;i++){
//     for (int j=0;j<col;j++){
     //         System.out.print(marks[i][j]+" ");
//     }
// System.out.println();}}
// }

// int x=sc.nextInt();
// for(int i=0;i<rows;i++){
//     for (int j=0;j<col;j++){
//         if (marks[i][j]==x){
//         System.out.print("x found at location (" +i+","+j+")");
//     }}
// System.out.println();}}
// }

import java.util.*;

public class arraytwod{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
        int column=sc.nextInt();
        int marks[][]=new int[rows][column];
        for(int i=0;i<rows;i++){
            for(int j=0;j<column;j++){
                marks[i][j]=sc.nextInt();

            }
        }
        // int x=sc.nextInt();
    //     for(int i=0;i<rows;i++){
    //         for(int j=0;j<column;j++){
    //             if(marks[i][j]==x){
    //                 System.out.print(i+","+j);
    //       }
    //     }
    //     System.out.println();
    // }
    for (int i=0;i<column;i++){
        for (int j=0;j<rows;j++){
System.out.print(marks[j][i] +" ");
        }
        System.out.println();
    }
    }
}