import java.util.Scanner;

public class bitmanupulation {
public static void main (String args[]){

//note   
// left shift symbol <<   example;010 become 100
//right shift symbol >> example;010 become 001
//bit masking is the process to manipulate the given bit

////Get bit operartion : to get the value of given position in given bit  
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int pos=2;                             //pos counting start from zero
int bitmask=1<<pos;
if ((bitmask & n)==0) {               //single & work as and gate
    System.out.println("bit was zero");
}else{
    System.out.println("bit was one");
}

//set bit operation : it help to set the 1 at given position in the bit
// Scanner sc=new Scanner(System.in);
// int n=sc.nextInt();
// int pos=1;                             //pos counting start from zero
// int bitmask=1<<pos;
// int newnumber =bitmask | n;            //single | work as or gate
// System.out.println(newnumber);

//clear bit operation : it help to set the 0 at given position in the bit
// Scanner sc=new Scanner(System.in);
// int n=sc.nextInt();
// int pos=1;                             //pos counting start from zero
// int bitmask=1<<pos;
// int notbitmask=~(bitmask);
// int newnumber =notbitmask & n;            //use and gate and not gate ~ work as not gate
// System.out.println(newnumber);

// //update bit; it help to convert the bit from 0 to 1 or vice versa 
// //it is the combination of   set bit |  and  clear bit ~&
// Scanner sc=new Scanner(System.in);
// int n=sc.nextInt();
// int pos=1;   
// //oper=1:ser;oper=0:clear;
// int oper =1;                          //pos counting start from zero
// int bitmask=1<<pos;
// if (oper=='0'){
//     int newnumber =bitmask | n;            //single | work as or gate
// System.out.println(newnumber);
// }else{
// int notbitmask=~(bitmask);
// int newnumber =notbitmask & n;            //use and gate and not gate ~ work as not gate
// System.out.println(newnumber);
//}

}
}