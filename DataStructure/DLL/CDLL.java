class Node{//basic structure of node
int data;
Node next;
Node prev;
Node (int data){
    this.data=data;
    this.next=null;
    this.prev=null;
}
}
class CDLL{
    public static void main(String[] args) {
      Node head=new Node(10);//node creation and memory allocation
      Node sec=new Node(20);
      Node tail=new Node(30);

        //how to link nodes
        head.next=sec;
        sec.next=tail;
        tail.next=head;

        head.prev=tail;
        sec.prev=head;
        tail.prev=sec;
        dis1(head,tail);
        System.out.println();
        dis2(tail,head);
    }
    public static void dis1(Node head, Node tail){
        Node n=head;
        do{
            System.out.print(n.data+"-->");
            n=n.next;
        } while(n!=head);
    }
      public static void dis2(Node tail,Node head){
        Node n=tail;
      do{
            System.out.print(n.data+"-->");
            n=n.prev;
        } while(n!=tail);
    }

}