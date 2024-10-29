// import java.util.ArrayList;

// public class backtracking {
//     //print all permutation  
//   public static void printpermutation(String ques,String ans) {
//       if(ques.length()==0){
// System.out.println(ans);
// return;
//       }
//         for (int i=0;i<ques.length();i++){
//           char cuurChar =ques.charAt(i);
//           String newstr=ques.substring(0, i) + ques.substring(i+1);
//           printpermutation(newstr, ans+cuurChar);
//         }
//     }
//   public static void main(String[] args) {
//     String str="abc";
// printpermutation(str, "");
//   }  
// }