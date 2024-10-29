public class linkedlist2 {
    
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
linkedlist2(){//this line is important for implementing directly head instead of declaring any other linkedlist
    head=null;
}

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

public static boolean detectCycle() {
    Node slow=head;
    Node fast=head;
    while(fast!=null&&fast.next!=null){
        slow=slow.next;
        fast=fast.next.next;
        if(slow==fast){
            return true;
        }
    }
    return false;
}

public static void RemoveCycle(){//not for the linked lidt whose first value points toward the head of linkedlist
    Node slow=head;
    Node fast=head;
    boolean cycle=false;
    while(fast!=null&&fast.next!=null){
        slow=slow.next;
        fast=fast.next.next;
        if(slow==fast){
            cycle=true;
            break;
        }
    }
        if(cycle==false){
            return;
        }
        slow= head;
        Node prev=null;
        while(slow!=fast){
            prev=fast;
            slow=slow.next;
            fast=fast.next;
        }
        prev.next=null;
    }


public static void main(String[] args) {
    head=new Node(30);
    head.next=new Node (90);
    head.next.next=new Node (89);
    head.next.next.next=head.next;//we need to assign any value except head value otherwise it will give error while removing the cycle
    System.out.println(detectCycle()); 
    RemoveCycle();
    System.out.println(detectCycle());
    
}
}
