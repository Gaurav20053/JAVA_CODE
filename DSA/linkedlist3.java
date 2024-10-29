import java.util.LinkedList;
public class linkedlist3 {
    public static void main(String[] args) {
    LinkedList<Integer>list=new LinkedList<>();
    list.addFirst(90);
    list.add(80);
    list.add(2,77);
    list.addFirst(67);
    list.addLast(88);
    System.out.println(list);
    list.removeLast();
    list.removeFirst();
    System.out.println(list);
    }
}