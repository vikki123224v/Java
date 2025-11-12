class Node{
    String data;//to print A B C,we can use both String and char
    Node next;
}class Node2{
public static void main(String[]  args){
    Node head=new Node();
    Node second=new Node();
    Node tail=new Node();

head.data="A";
second.data="B";
tail.data="C";

head.next=second;
second.next=tail;
tail.next=null;

Node n=head;
while(n!=null){
    if(n.next==null){
        System.out.print(n.data);
        break;
    }
    System.out.print(n.data+"-->");
    n=n.next;

}
}
}