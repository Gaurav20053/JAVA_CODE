import java.lang.reflect.Array;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class backtrackingextra {
// //1.blocked maze
//      public static void  blockmaze(int[][]grid, int row,int col,String ans,boolean[][]visited){  
//         if (row==grid.length-1 && col==grid[0].length-1) {
//             System.out.println(ans);
//             return;
//         }      
//         if(row<0||col<0||row>grid.length-1||col>=grid[0].length||visited[row][col]||grid[row][col]==1)
//         return;
// //for movement
// visited[row][col]=true;
//         blockmaze( grid,row-1,col, ans+"U",visited);
//         blockmaze( grid,row+1,col, ans+"D",visited);       
//         blockmaze( grid,row,col+1, ans+"R",visited);
//         blockmaze( grid,row,col-1, ans+"L",visited);
//     visited[row][col]=false; 
//     }
//      public static void main(String [] args){
//         int [][] grid={{0,1,0,0},{0,0,0,0},{0,1,0,0},{0,1,1,0}};
//         boolean[][]visited=new boolean[grid.length][grid[0].length];
//         blockmaze(grid, 0, 0, "",visited);
//      }

// //2.subset
// public static void subSet(int arr[],int idx,String ans){
//     if(idx==arr.length ){
//         System.out.println(ans);
//     return;
// }
//     subSet(arr, idx+1, ans+arr[idx]);
//     subSet(arr, idx+1, ans);
// }
// public static void subSet(int arr[],int idx,List<Integer>temp,List<List<Integer>>big){
//     if (idx==arr.length) {
//         big.add(new ArrayList<Integer>(temp));
//     return;
// }
//     temp.add(arr[idx]);
//     subSet(arr, idx+1, temp, big);
//     temp.remove(temp.size()-1);
//     subSet(arr, idx+1, temp, big);
// }
// public static void main(String[] args) {
//     int arr[]={1,2,3};
//     List<List<Integer>>big=new ArrayList<List<Integer>>();
//     subSet(arr, 0, new ArrayList<Integer>(), big);
// System.out.println(big);
// }

// //3.subset without repetetion(set can have same no.)
// // public static void subSet(int arr[],int idx,String ans,boolean flag){
// //     if(idx==arr.length ){
// //         System.out.println(ans);
// //     return;
// // }
// // if (flag==false&&arr[idx]==arr[idx-1]) {
// //     subSet(arr, idx+1, ans,false);
// // }else{
// //     subSet(arr, idx+1, ans+arr[idx],true);
// //     subSet(arr, idx+1, ans,false);
// //}}
// // public static void main(String[] args) {
// //     int []arr={1,3,1,2};
// //     Arrays.sort(arr);
// //     subSet(arr, 0, "", true);
// // }
// //with list
// public static void subSet(int arr[],int idx,List<List<Integer>>big,List<Integer>temp,boolean flag){
//     if(idx==arr.length ){
//         big.add(new ArrayList<Integer>(temp));
//     return;
// }
// if (flag==false&&arr[idx]==arr[idx-1]) {
//     subSet(arr, idx+1, big,temp,false);
// }else{
//     temp.add(arr[idx]);
//     subSet(arr, idx+1, big,temp,true);
//     temp.remove(temp.size()-1);
//     subSet(arr, idx+1, big,temp,false);
// }}
// public static void main(String[] args) {
//     int []arr={1,1,1,2};
//     List<List<Integer>>big=new ArrayList<List<Integer>>();
//     List<Integer>temp=new ArrayList<Integer>();
//     subSet(arr, 0, big,temp, true);
//     System.out.println(big);
// }



                    //    practice



}