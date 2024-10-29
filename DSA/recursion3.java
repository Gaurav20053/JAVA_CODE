import java.util.ArrayList;

public class recursion3  {
//     //to arrange the string in all possible combination
//     public static void permutation(String str,String permutation){        //we dont make any idx because we dont trck the alteration we remove the character from string
//  if (str.length()==0){
// System.out.println(permutation);
//         return;
//        }
//      for (int i=0;i<str.length();i++){
// char currChar=str.charAt(i);
// String newStr=str.substring(0, i)+str.substring(i+1);    //exclude end element from substring 
// permutation(newStr, permutation+currChar);
//         }
//     } 
//     public static void main (String args[]){
//         String str="abc";
//         permutation(str, "");
// }

// public static int countpath(int currr,int currc,int endr,int endc){
//     if( currc==endc||currr==endr){
//         return 0;
//     }if (currc==endc-1&&currr==endr-1) {
//         return 1;   
//     }
//      int rightmove = countpath(currr, currc+1, endr, endc);
//     int downmove=countpath(currr+1, currc, endr, endc);
//     return rightmove+downmove;
// }
// public static void main(String[] args) {
//     int totalpath=countpath(0, 0, 3,3);
//     System.out.println(totalpath);
// }

// //place tiles size of 1*m in a floor of size n*m
// public static int placetile(int n,int m){
//     if (n==m) {
//         return 2;
//     }
//     if (n<m) {
//         return 1;       
//     }
//     int verplacement=placetile(n-m, m);
//     int horiplacement=placetile(n-1,m);
//     return verplacement+horiplacement;
// }
// public static void main(String[] args) {
//     // placetile(4, 2);
//     System.out.println(placetile(4, 2));
// }

// //no. of ways to call the guest
// public static int invite(int n){
//     if (n<=1) {
//                 return 1;        
//     }
//  int way1=invite(n-1);
//  int way2=(n-1) * invite(n-2);
// //  int way3=(n-1)
//  return way1+way2;
// }
// public static void main(String[] args) {
//     System.out.println(invite(4));
// }

// //print all the subset
// public static void printsubset(ArrayList<Integer>subset){
//     for (int i=0;i<subset.size();i++){
//         System.out.print(subset.get(i));
//     }
//     System.out.println();
// }public static void findsubset(int n,ArrayList<Integer>subset){
// if (n==0) {
//     printsubset(subset);
//     return;  
// }subset.add(n);
// findsubset(n-1, subset);
// subset.remove(subset.size()-1);
// findsubset(n-1, subset);
// }
// public static void main(String[] args) {
//     ArrayList<Integer>subset=new ArrayList<>();
//     findsubset(3, subset);
// }
}