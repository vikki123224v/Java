class Node{
    String data;//to print A B C,we can use both String and char
    Node next;
    Node(String data){
        this.data=data;
        next=null;
    }
}class CSLL{
public static void main(String[]  args){
    Node head=new Node("10");
    Node second=new Node("20");
    Node tail=new Node("30");

head.next=second;
second.next=tail;
tail.next=head;
display(head);
}
public static void display(Node head){
    Node n=head;
    do { 
        if(n.next==head){
            System.out.print(n.data);
            break;
        }
        System.out.print(n.data+"->");
        n=n.next;
    } while (n!=head);
}
}