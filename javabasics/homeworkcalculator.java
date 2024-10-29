import java.util.Scanner;
public class homeworkcalculator  {
public static void main (String args[]){
Scanner sc= new Scanner(System.in);
int a=sc.nextInt();
//switch(days ) {
  //  case 1:System.out.println("monday");
    //break;
    //case 2:System.out.println("tuesday");
    //break;
    //case 3:System.out.println("wednesday");
    //break;
    //case 4:System.out.println("thursday");
    //break;
    //case 5: System.out.println("friday");
    //break;
    //case 6 : System.out.println("saturday");
    //break;
    //default:
    //System.out.println("saunday");
 int b=sc.nextInt();
 int operator = sc.nextInt();

 switch(operator) {
    case 1: System.out.println(a+b);
break;
case 2: System.out.println(a-b);
break;
case 3: System.out.println(a*b);
break;
case 4 :System.out.println(a/b);
break;
case 5 : System.out.println(a%b);
 }
}

}
