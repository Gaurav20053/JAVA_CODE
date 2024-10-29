import java.util.ArrayList;
import java.util.Collections;
public class arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        ArrayList<String> list1=new ArrayList<>();
        ArrayList<Boolean> list2=new ArrayList<>();
 //add element
        list.add(19);
        list.add(23);
        list.add(26);
        list.add(29);
        list.add(30);
 System.out.println(list);
 //get element
//  int element=list.get(0);
 System.out.println(list.get(0));
 //remove elment
 list.remove(2);
 list.remove(1);
 System.out.println(list);
 //insert at any index
 list.add(0, 22);
 list.add(0, 34);
 System.out.println(list);
 //change character
 list.set(1, 88);
 list.set(3, 8);
 System.out.println(list);
 //get size of array
 System.out.println(list.size());
//get the value of element at particular index
System.out.println(list.get(3));

//sorting of element
Collections.sort(list);
System.out.println(list);
for(int i=0;i<list.size();i++){
       System.out.print(list.get(i)+" ");
}System.out.println();

}
}
