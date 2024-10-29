import java.util.ArrayList;
import java.util.List;
import javax.print.DocFlavor.STRING;
public class recursionextra1 {
    
//// 1. print decreasing
//    public static void pd(int n) {
//         if (n==0){
//         return;
//         }
//         System.out.println(n);
//         pd(n-1);     
//     }

// //2. print increasing 
//    public static void pi(int n) {
//         if (n==0){
//         return;
//         }
//         pi(n-1);
//         System.out.println(n);
        //     } 
//     public static void main(String[] args) {
//         pi(5);
//     }

//  // 3. tower of henoi  
//   public static void toh (int n,String src,String hel,String dest){
//     if(n==0){
//         // System.out.println("disc shift"+n+ "from"+src+"to"+dest);
//         return;
//     }
//     toh(n-1, src,dest ,hel);
//     System.out.println("disc shift "+n+" from "+src+" to "+dest);
//     toh(n-1, hel, src, dest);
// }
// public static void main(String[] args) {
//     toh(3,"s","h", "d");
// }

//// 4. coin toss 
//   public static void toss (int n,String ans){
//     if (n==0){
//         System.out.println(ans);
//         return;
//     }
//     toss(n-1, ans+"H");
//     toss(n-1,ans+"T");
// }
// public static void main(String[] args) {
//     toss(3, "");
// }

// //5. climb stairs    
//public static void climbstairs (int n,int curr,String ans){
//     if(curr==n){
//         System.out.println(ans);
//         return;
//     }
//     if(curr>n){
//         return;
//     }
    //     climbstairs(n,curr+1, ans+1);
//     climbstairs(n,curr+2, ans+2);
//     climbstairs(n,curr+3, ans+3);
//     }
//     public static void main(String[] args) {
//         climbstairs(3,0, "");
//     }

// // 6. print permutation
//      public static void printpermutation (String ques,String ans){
//         if(ques.length()==0){
// System.out.println(ans);
// return;
//         }
// for(int i=0;i<ques.length();i++){
//     char currchar=ques.charAt(i);
//     String newques=ques.substring(0, i)+ques.substring(i+1);
// printpermutation(newques, ans+currchar);
// }
//     }
//     public static void main(String[] args) {
//         printpermutation("abcd","");
//     }
// }

// //7.  print valid parathesis
// public static void validparanthesis(int n,int open,int close,String ans){
//     if (open==n&&close==n){
//         System.out.println(ans);
//     return;}
//     if (open>n||close>n||close>open){
//         return;
//     }
//     validparanthesis(n, open+1, close, ans+"(");
//     validparanthesis(n, open, close+1, ans+")");
// }
// public static void main(String[] args) {
//     validparanthesis(3, 0, 0, "");
// }

// //8.  print valid paranthesis in array
// public static void validparanthesis(int n,int open,int close,String ans, List<String>list){
//     if (open==n&&close==n){
// list.add(ans);
//     return;
// }
//     if (open>n||close>n||close>open){
//         return;
//     }
//     validparanthesis(n, open+1, close, ans+"(",list);
//     validparanthesis(n, open, close+1, ans+")",list);
// }
// public static void main(String[] args) {
//     List<String>list=new ArrayList<String>();
//     validparanthesis(3, 0, 0, "",list);
// System.out.println(list);
// }

// //9. making a keypad and print in array
// public static String getcode(char ch){
//     if (ch=='2') {             //use single ' ' merks instead of " "
//         return"abc";
//     }else if(ch=='3') {
//             return"def";       
//     }else if(ch=='4') {
//         return"ghi";
// }else if(ch=='5') {
//     return"jkl";
// }else if(ch=='6') {
//     return"mno";
// }else if(ch=='7') {
//     return"pqrs";
// }else if(ch=='8') {
//     return"tuv";
// }else if(ch=='9') {
//     return"wxyz";
// }else {
//     return null;
// }}
// public static void lettercombination(String ques,String ans,List<String>list){
//     if (ques.length()==0) {
//         list.add(ans);
//         // System.out.println(list);
//         return;
    // }
//     char ch=ques.charAt(0);
//     String roq=ques.substring(1);
//     String code=getcode(ch);
//     for (int i=0;i<code.length();i++){
//         lettercombination(roq, ans+code.charAt(i),list);
//     }
// }
// public static void main(String[] args) {
//     List<String>list=new ArrayList<String>();
//     lettercombination("24", "",list);
//     System.out.println(list);
// }

// //10.print all possible partition of given string
// public static void pallindrome(String ques,String ans){
//  if (ques.length()==0){
//     System.out.println(ans);
//     return;
//  }
// for (int i=1;i<=ques.length();i++){
//     String roq=ques.substring(i);
//     String comp=ques.substring(0, i);
//     pallindrome(roq, ans + comp +" ");
// }
// }
// public static void main(String[] args) {
//     pallindrome("nitin", "");
// }

// //11.print all possible pallindrome partition of given string
public static void pallindrome(String ques,String ans,List<String>list){
    if (ques.length()==0){
       list.add(ans);
    //    System.out.println(list);        //to know the process of answer step by step
       return;
    }
   for (int i=1;i<=ques.length();i++){
       String roq=ques.substring(i);
       String comp=ques.substring(0, i);
       if (ispallindrome(comp))
       pallindrome(roq, ans + comp +" ",list);
   }
   }

   public static boolean ispallindrome(String str){
    int i=0;
    int j=str.length()-1;
    while (i<j) {
        if (str.charAt(i)!=str.charAt(j)) {
            return false;
        }
        i++;
        j--; 
    }
    return true;  
}
   public static void main(String[] args) {
    List<String>list=new ArrayList<String>();
       pallindrome("naman", "",list);
       System.out.println(list);

   }
}


