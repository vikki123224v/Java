class Node{//basic structure of a node
int data;
Node next;
public static void main(String args[]){
    //How to create a node
    Node head=new Node();
    Node second=new Node();
    Node third=new Node();  
    Node tail=new Node();

    //how to assign data to node
    head.data=10;
    second.data=20;
    third.data=30;
    tail.data=40;

    //how to link node
    head.next=second;
    second.next=third;
    third.next=tail;
    tail.next=null;
dis(head);
}
public static void dis(Node head){
    Node n=head;
    //traversing the linked list
    while(n!=null){
        System.out.print(n.data+"->");
        n=n.next;
    }
}
}