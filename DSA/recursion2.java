 public class recursion2{
// //Print PrintHanoi 
//         public static void PrintHanoi (int n,String source,String helper,String destiny){
//         if (n==1){
//             System.out.println("trnsfer disk "+n+" from "+source+" to "+destiny);
//         return;
//     }
//     PrintHanoi(n-1,source , destiny, helper);
//     System.out.println("trnsfer disk "+n +" from "+source+" to "+destiny);
//        PrintHanoi(n-1, helper,source, destiny);
//     }
// public static void main (String args[]){
//  int n=3;
//  PrintHanoi (n, "s", "h", "d");
// }

//Print string in reverse abcd=dcba
public static void PrintReverse(String str,int idx) {
    if(idx==0){
        System.out.print(str.charAt(idx));
 return; 
  }
System.out.print(str.charAt(idx));
PrintReverse(str, idx-1);
}
public static void main(String[] args) {
    String str="gaurav";
    PrintReverse(str,str.length()-1);   //here str.length is for length of str
}

// //To find the first and last occcurence of element 
// public static int first=-1;
// public static int last=-1;
// public static void firstLast(String str, int idx,char element) {
//     if (idx==str.length()){
//         System.out.println(first);
//     System.out.println(last);
//     return;
//     }
// char currChar=str.charAt(idx);
// if(currChar==element){
//     if (first==-1){
//         first=idx;
//     }else{
//         last=idx;
//     }
// }
// firstLast(str, idx+1, element);
// }
// public static void main(String[] args) {
//     String str="abbstuaajfbsdjjeruhcdkbsdjsduoa";
//     firstLast(str, 0, 'b');
// }

// //Array is sorted or not
// public static boolean isSorted(int arr[],int idx){
//     if(idx==arr.length-1){
//         return true;
//     }
//     if(arr[idx]>=arr[idx+1]){
//        return false ;
//     }else{
//         return isSorted(arr, idx+1);
//     }
//     }
// public static void main(String[] args) {
//     int arr[]={1,2,3,11,23,42};
//     System.out.println(isSorted(arr, 0));
// }

// //Move single element at end or initially of string
// public static void MoveXAtLast(String str,int idx,int count,String newString){
// if(idx==str.length()){
// for(int i=0;i<=count;i++){
//     newString +='x';
// }System.out.println(newString);
// return;
// }
// char currChar=str.charAt(idx);
// if(currChar=='x'){
//     count++;
//     MoveXAtLast(str, idx+1, count, newString);
// }else{
//     newString=newString+currChar;            //newString+=currChar is another way to write this
//     MoveXAtLast(str, idx+1, count, newString);
// }
// }
// public static void main(String[] args) {
//     String str="axxndbvbbefnbx";
//     MoveXAtLast(str, 0, 0, "");
// }

// //Remove duplication
// public static boolean[] map=new boolean[26];                   //we do maping of all alphabert for a=0;b=1;c=2;d=3
// public static void RemoveDupllication(String str,int idx,String newsString){
//     if(idx==str.length()){
//         System.out.println(newsString);
//         return;
//     }
//     char currChar=str.charAt(idx);
//     if (map[currChar-'a']==true){         //false means we hadnt find that character in the string //by substraction of 'currChar-a' we get a int value if we had alredy that value then we get true
// RemoveDupllication(str, idx+1,newsString);
//     }else{
//         newsString=newsString+currChar;
//        RemoveDupllication(str, idx+1,newsString);
// }
// }
// public static void main(String[] args) {
//     String str="abbbsdkndnfnjbirefabgaehchjgvsddhj";
//     RemoveDupllication(str, 0, "");
// }

// //Subsequence  vvv important 
// // subsequences without repetation
// import java.util.HashSet;
// public class recursion2{
// public static void subsequence (int idx,String str,String newsString,HashSet<String>set){
//     if (idx==str.length()){
// if(set.contains(newsString))   {
//     return;
// } else{
//     System.out.println(newsString);
//     set.add(newsString);
//     return;
// }}
//     char  currChar=str.charAt(idx);
//     //to include in the subsquence
//     subsequence(idx+1, str, newsString+currChar,set);
//     //not include in the subsequence
//     subsequence(idx+1, str, newsString,set);
//     }
//     public static void main(String[] args) {
//         String str="aaaa";
//         HashSet<String> set=new HashSet<>();
//         subsequence(0, str, "",set);
//     }

// //making keypad
// import java.util.HashSet;
// public class recursion2{
// public static String[] keypad={".","abc","def","ghi","jkL","mno","pqrs","tu","vwx","yz"};
// public static void printComb(String str,int idx,String combination){
//     if (idx==str.length()){
//         System.out.println(combination);
//         return;
//     }
//     char currChar=str.charAt(idx);
//     String mapping =keypad[currChar-'0'];
//     for (int i=0;i<mapping.length();i++){
//         printComb(str, idx+1, combination+mapping.charAt(i));
//     }
// }
// public static void main(String[] args) {
//     String str="4";
//     printComb(str, 0, "");
// }
}