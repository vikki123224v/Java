class Node{
    String data;//to print A B C,we can use both String and char
    Node next;
    Node(String d){//String data
       this.data=d;//this.data=data;
        next=null;
    }
}class Constructor{
public static void main(String[]  args){
    Node head=new Node("A");
    Node second=new Node("B");
    Node tail=new Node("c");

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