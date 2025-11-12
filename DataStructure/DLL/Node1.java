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
class Node1{
    public static void main(String[] args) {
      Node head=new Node(10);//node creation and memory allocation
      Node sec=new Node(20);
      Node tail=new Node(30);

        //how to link nodes
        head.next=sec;
        sec.next=tail;
        tail.next=null;

        head.prev=null;
        sec.prev=head;
        tail.prev=sec;
        dis1(head);
        System.out.println();
        dis2(tail);
    }
    public static void dis1(Node head){
        Node n=head;
        while(n!=null){
            System.out.print(n.data+"-->");
            n=n.next;
        }
    }
      public static void dis2(Node tail){
        Node n=tail;
        while(n!=null){
            System.out.print(n.data+"-->");
            n=n.prev;
        }
    }

}