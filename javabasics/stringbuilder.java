import java.util.Scanner;

public class stringbuilder  {
public static void main (String args[]){
// StringBuilder sc=new StringBuilder("tonmny");
// System.out.println(sc);

// //charat at index
// System.out.println(sc.charAt(3));

// //set char at index replace char
// sc.setCharAt(3, 'l');
// System.out.println(sc);
// sc.setCharAt(1, 'k');
// System.out.println(sc);

// //insert add char
// sc.insert(0,'r');
// System.out.println(sc);

// //delete any char
// sc.delete(0,1);//ending element is non inclusive
// System.out.println(sc);

// //adding element in end
// sc.append("k");
// System.out.println(sc);

// //to get the length
// System.out.println(sc.length());

//reversing the string
// for(int i=0;i<sc.length()/2;i++){
//   int  front=i;
//  int back=sc.length()-1-i;
// char backend=sc.charAt(back);
// char frontend=sc.charAt(front);
// sc.setCharAt(front,backend);
// sc.setCharAt(back, frontend);

// }
// System.out.println(sc);

                //  PRACTICE
StringBuilder sb=new StringBuilder("tonmy");
System.out.println(sb);
for (int i=0;i<sb.length()/2;i++){
    int front=i;
    int back=sb.length()-1-i;
    char frontend=sb.charAt(front);
    char backend=sb.charAt(back);
    sb.setCharAt(front, backend);
    sb.setCharAt(back, frontend);
    System.out.println(sb);

}
System.out.println(sb.length());
}
}