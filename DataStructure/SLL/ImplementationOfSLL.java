class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
    }
}
class SLL{
    Node head;
    Node tail;
    SLL(){
        head=null;
        tail=null;

    }
    public void insert(int data){
        Node hello=new Node(data);
        if(head==null)
        {
            head=hello;
            tail=hello;
            }
        else{
            tail.next=hello;
            tail=hello;
        }
        }
        public void search(int val){
             Node n=head;
             int p=0;
        while(n!=null){
            if(n.data==val){
               p=1;
               break;
            }
            n=n.next;
        }
        if(p==1){
            System.out.println("Value found");
        }
        else{
            System.out.println("Value not found");
        }
        }
    public void display(){
        Node n=head;
        while(n!=null){
            if(n.next==null){
                System.out.print(n.data);
                break;
            }


            System.out.print(n.data+"-> ");
            n=n.next;
        }
    }
}
    class ImplementationOfSLL{
        public static void main(String []args){
          SLL o=new SLL();
          o.insert(10);
            o.insert(20);
            o.insert(30);
            o.insert(40);
            o.display();
            System.out.println();
            o.search(100);
            o.search(10);


        }
    }
