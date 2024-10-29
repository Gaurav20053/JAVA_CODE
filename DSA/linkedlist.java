import java.util.*;
import java.util.Collection;
public class linkedlist {
    
//  // single ended linkedlist by using complete code 
// Node head;
// private int size;
// linkedlist(){
// this.size=0;
// }
//     class Node{
//     String data;
//     Node next;
//      Node(String data){
//         this.data=data;
//         this.next=null;
//         size++;                            //if any node added in data then its size increase by one
//     }
// }
// // add first
// public void addfirst(String data){
// Node newNode=new Node(data);
//     if(head==null){
// head =newNode;
// return;
//     }
//     newNode.next=head;;
//     head=newNode;
// }

// // add last 
// public void addLast(String data){
//     Node newNode=new Node(data);
//     if(head==null){
//         head=newNode;
//         return;
//     }
// Node currNode=head;
// while(currNode.next!=null){
//     currNode=currNode.next;
// }
// currNode.next=newNode;
// }

// //print 
// public void printList(){
//     if(head==null){
//         System.out.println("List is empty");
//         return;
//     }
//     Node currNode=head;
//     while (currNode!=null) {
//         System.out.print(currNode.data +"->");
//         currNode=currNode.next;        
//     }
//     System.out.println("null");
// }

// // remove first
// public void deleteFirst(){
//     if(head==null){
//         System.out.println("The list is empty");
//     return;
// }
// size--;
// head=head.next;
// }

// // remove last
// public void deleteLast(){
//     if(head==null){
//         System.out.println("The list is empty");
//     return;
// }
// size--;                              //remove the count if any element is deleted
// if(head.next==null){
//     System.out.println("The list have only one element");
//     head=null;
// return;
// }
// Node secondLast=head;
// Node lastNode=head.next;
// while(lastNode.next!=null){
//     lastNode=lastNode.next;
//     secondLast=secondLast.next;
// }
// secondLast.next=null;
// }

// // for size
// public int getsize(){
//     return size;
// }

// public static void main(String[] args) {
//     linkedlist list=new linkedlist();
//     list.addfirst("this");
//     list.addfirst("is");
//     list.addLast("a");
//     list.addLast("list");
//     list.printList();
// list.deleteFirst();
// list.printList();
// list.deleteLast();
// list.printList();
// System.out.println(list.getsize());
// list.deleteLast();
// list.printList();
// System.out.println(list.getsize());
// }
// }

// // linked list if collection frame work(by using library) is given;
// class linkedlist{
//     public static void main(String[] args) {
        // LinkedList<String> list= new LinkedList<>();
        // list.addFirst("a");
        // list.addFirst("is");
        // System.out.println(list);
        // list.addFirst("this");
        // list.addLast("list");
        // System.out.println(list);
        // System.out.println(list.size());
        // for(int i=0;i<list.size();i++){
        //     System.out.print(list.get(i)+"->");
        // }
        // System.out.println("null");
        // for(int i=list.size();i>0;i--){              // //for reversing
        //     System.out.print(list.get(i-1)+"->");
        // }
        // System.out.println("null");
        // list.removeFirst();
        // System.out.println(list);
        // list.removeLast();
        // System.out.println(list);
//     }
// }

// public class linkedlist {
//     Node head;
//     class Node{
//         int data;
//         Node next;
//         Node (int data){
//             this.data=data;
//             this.next=null;
//         }
//     }
//     public void addFirst(int data){
//         Node newNode=new Node(data);
//             if(head==null){
//         head =newNode;
//         return;
//             }
//             newNode.next=head;;
//             head=newNode;
//         }
//         public void addLast(int data){
//             Node newNode=new Node(data);
//             if(head==null){
//                 head=newNode;
//                 return;
//             }
//         Node currNode=head;
//         while(currNode.next!=null){
//             currNode=currNode.next;
//         }
//         currNode.next=newNode;
//     }        
//         public void printList(){
//             if(head==null){
//                 System.out.println("List is empty");
//                 return;
//             }
//             Node currNode=head;
//             while (currNode!=null) {
//                 System.out.print(currNode.data +"->");
//                 currNode=currNode.next;        
//             }
//             System.out.println("null");
//         }

// //reversing of linked list by ilteration
// public void reverseIlterate(){
//     if(head==null||head.next==null){
//         System.out.println("reversal not possible");
//         return;
//     }
//     Node prevNode=head;
//     Node currNode=head.next;
//     while (currNode!=null) {
//         Node nextNode=currNode.next;
//         currNode.next=prevNode;
//         // //update
// prevNode=currNode;
// currNode=nextNode;
//     }
//     head.next=null;
//     head=prevNode;
// }

// //reversing of linked list by recursive function
// public Node reverseRrecursive(Node head){
//     if(head==null||head.next==null){
//         return head;
//     }
//     Node newHead=reverseRrecursive(head.next);
//     head.next.next=head;
//     head.next=null;
//     return newHead;
// }

// public static void main(String[] args) {
//     linkedlist list=new linkedlist();
//     // LinkedList<String> list= new LinkedList<>(); //
//         list.addFirst(3);
//         list.addFirst(2);
//         list.addFirst(7);
//         list.addLast(4);
//         list.printList();
//         list.reverseIlterate();//reverse by ilteration
//         list.printList();
//         list.head=list.reverseRrecursive(list.head);//reverse by recursion
//         list.printList();
// }
// }

// //reversing the linked list by library
// public class linkedlist {
// public static void main(String[] args) {
//     LinkedList<Integer>list=new LinkedList<>();
// list.add(8);
// list.add(9);
// list.add(10);
// list.add(11);
// System.out.println(list);
// Collections.reverse(list);
// System.out.println(list);
// }


class Node{
        int data;
        Node next;

public Node(int data){
        this.data=data;
        this.next=null;
}
}
public static int size=1;
public static Node head;
public static Node tail;
public void addfirst(int data){
        Node newNode=new Node(data);
        if(head==null){
                head=tail=newNode;
                return;
        }
        newNode.next=head;
        head= newNode;
        size++;
}

public void addlast(int data){
        Node newNode=new Node(data);
        if(head==null){
                head=tail=newNode;
                return;
        }
        tail.next=newNode;
        tail=newNode;
        size++;
}

public void printList(){
        if(head==null){
                System.out.println("list is empty");
        }
        Node temp=head;
        while(temp!=null){
System.out.print(temp.data+"-->");
temp=temp.next;
        }
        System.out.println("null");

}

public void addIndex(int idx,int data){
        if(idx==0){
                addfirst(data);
                return;
        }
Node newNode=new Node(data);
Node temp=head;
int i=0;
while(i<idx-1){
        temp=temp.next;
        i++;
}
newNode.next=temp.next;
temp.next=newNode;
size++;
}

public int removeFirst(){
        if(size==0){
                System.out.println("LL is empty");
                return 0;
        }
        if(size==1){
                int val=head.data;
                head=tail=null;
                size--;
                return val;
        }
int val=head.data;
        head=head.next;
        size--;
        return val;
}

public int removeLast(){
        if(size==0){
                System.out.println("LL is empty");
                return 0;
        }
        if(size==1){
                int val=head.data;
                head=tail=null;
                size--;
                return val;
        }
        Node temp=head;
        int i=0;
        while(i<size-2){
         temp=temp.next;
         i++;
        }
        int val=temp.next.data;
        temp.next=null;
        tail=temp;
        size--;
        return val;
}

public void search(int number){
        int i=0;
        Node temp=head;
        while(i<size-1){
                if(temp.data==number){
                        System.out.println("found at node index "+i);
                        return;
                }else{
                        temp=temp.next;
                }
                i++;
        }
        System.out.println("number not in the list");
}


public int helper(Node head,int number){
        if(head==null){
                return -1;
        }
        if(head.data==number){
                return 0;
        }
        int idx=helper (head.next,number);
        if(idx==-1){
                return -1;
        }
        return idx+1;

}

public int recursionSearch(int number){
return helper(head,number);
}


public void reverseLL(){
        Node prev=null;
        Node next;
        Node curr=tail=head;
while(curr!=null){
        next=curr.next;
        curr.next=prev;
        prev=curr;
        curr=next;
}       
head=prev;
}

public void deleteNthlast(int n){
        int size=0;
        Node temp=head;
        while(temp!=null){
                temp=temp.next;
                size++;
        }
        if(n==size){
                head=head.next;
                return;
        }
        int i=1;
        int itoFind=size-n;
        Node prev=head;
        while(i<itoFind){
         prev=prev.next;
        i++;
        }
        prev.next=prev.next.next;
        return;
}


public Node findMid(Node head){
       Node slow=head;
       Node fast=head;
       while(fast!=null&&fast.next!=null){
        slow=slow.next;
        fast=fast.next.next; 
       }
       return slow;
}
public boolean checkPalindrome(){
        if(head==null||head.next==null){
                return true;
        }
        //step1->find mid
        Node midnode=findMid(head);
        // step2->reverse 2nd half
        Node prev=null;
        Node curr=midnode;
        Node next;
        while(curr!=null){
              next=curr.next;
              curr.next=prev;
              prev=curr;
              curr=next;
        }
        // step3->check left half &right half
        Node right=prev;
        Node left=head;
        while(right!=null){
                if(left.data!=right.data){
                        return false;
                } 
                left=left.next;
                right=right.next;
        }
        return true;
}
public static void main(String[] args) {
        linkedlist ll=new linkedlist();
//         ll.printList();
//         ll.addfirst(12);
//         ll.printList();
//         ll.addfirst(78);
//         ll.printList();
//         ll.addlast(87);
//         ll.printList();
//         ll.addlast(90);
//         ll.printList();
//         ll.addIndex(2, 54);
//         ll.printList();
//         ll.addIndex(0, 33);
//         ll.printList();
//         ll.addIndex(3, 87);
//         ll.printList();
//         // // ll.removeFirst();
//         // System.out.println(ll.removeFirst());
//         // // ll.removelast()
//         // System.out.println(ll.removeLast());
//         // ll.printList();
//         // System.out.println(ll.size);
//         // ll.search(87);
//         ll.deleteNthlast(4);
//         ll.printList();
//         ll.reverseLL();
//         ll.printList();
ll.addfirst(45);
ll.addfirst(3);
ll.addIndex(1, 45);
ll.addlast(3);
ll.addIndex(4, 80);
ll.printList();
ll.reverseLL();
ll.printList();
System.out.println(ll.checkPalindrome());


} 
}
 