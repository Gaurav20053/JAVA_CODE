import java.util.LinkedList;

public class linkedlist3 {
    
public static class Node{
    int data;
    Node next;

public Node(int data){
    this.data=data;
    this.next=null;
}
}
public static int size=1;
public static Node head;
linkedlist3(){//this line is important for implementing directly head instead of declaring any other linkedlist
head=null;
}

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

public static Node tail;


private Node findMid(Node head){
    Node slow=head;
    Node fast=head.next;
    while(fast!=null&&fast.next!=null){
     slow=slow.next;
     fast=fast.next.next; 
    }
    return slow;
}

private Node merge(Node h1,Node h2){
    Node mergedLL=new Node(-1);
    Node temp=mergedLL;
    while(h1!=null&&h2!=null){
        if(h1.data>h2.data){
            temp.next=h2;
            h2=h2.next;
            temp=temp.next;
        }else{
            temp.next=h1;
            h1=h1.next;
            temp=temp.next;
        }
    }
    while(h1!=null){
        temp.next=h1;
        h1=h1.next;
        temp=temp.next;
    }
    while(h2!=null){
        temp.next=h2;
            h2=h2.next;
            temp=temp.next;
    }
    return mergedLL.next;
}

public Node mergeSort(Node head){
    // find mid
    if(head==null||head.next==null){
            return head;
        }
        Node mid=findMid(head);
        // left & right MS
        Node rightHead=mid.next;
        mid.next=null;
        Node newLeft=mergeSort(head);
        Node newRight=mergeSort(rightHead);
        // merge
        return merge(newLeft,newRight);
    }
   
   
public  void zigZag(){
    // find mid
    Node slow=head;
    Node fast=head.next;
    while(fast!=null&&fast.next!=null){
        slow=slow.next;
        fast=fast.next.next;
    }
    Node mid=slow;
    // reverse 2nd half
    Node curr=mid.next;
    mid.next=null;
    Node prev=null;
    Node next;
    while(curr!=null){
        next=curr.next;
        curr.next=prev;
        prev=curr;
        curr=next;

    }
    Node leftH=head;
    Node rightH =prev;
    Node nextL,nextR;
    // alt merge-zig-zag merge
while(leftH!=null&&rightH!=null){
nextL=leftH.next;
leftH.next=rightH;
nextR=rightH.next;
rightH.next=nextL;

leftH=nextL;
rightH=nextR;
}
}
   
    public static void main(String[] args) {
    // LinkedList<Integer>list=new LinkedList<>();
    linkedlist3 list=new linkedlist3();//for implementind merge Sort
    list.addfirst(90);
    list.addfirst(80);
    list.addIndex(2,77);
    list.addfirst(67);
    list.addlast(88);
    list.addlast(23);
    list.printList();
    
    list.zigZag();
    list.printList();
    list.head=list.mergeSort(list.head);
    list.printList();
    list.zigZag();
    list.printList();
    // list.removeLast();
    // list.removeFirst();
    // System.out.println(list); 
    }
}