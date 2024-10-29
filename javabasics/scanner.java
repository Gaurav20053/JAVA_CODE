import java.util.*;
public class scanner{
  public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int button=sc.nextInt();
     switch (button) {
      case 1:System.out.println("hii");
        break;
     case 2:System.out.println("hello");
     break;
     case 3:System.out.println("namastey");
     break;
     case 4:System.out.println("bonjor");
     break;
      default:System.out.println("bye");
     
     }

  }
}