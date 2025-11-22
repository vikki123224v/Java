class Node{
    Node prev;
    Node next;
    int data;
    Node(int d){
        this.data=d;
    }
}
class DLL{
    Node head;
    Node tail;
    DLL(){
        head=tail=null;
    }
  public void insert(int data){
    Node hello=new Node(data);
    if(head==null){
        head=hello;
        tail=hello;

    }
    else{
        tail.next=hello;
        hello.prev=tail;
        tail=hello;
    }
 }


public   void dis1(){
        Node n=head;
        while(n!=null){
            System.out.print(n.data+"-->");
            n=n.next;
        }
    }
public  void dis2(){
    Node n=tail;
    while(n!=null){
        System.out.print(n.data+"-->");
        n=n.prev;
    }
}
public boolean search(int key){
    Node n=head;
    while(n!=null){
        if(n.data==key){
            return true;
        }
        n=n.next;
        }
        return false;
        }
    }

public class ImplementationOfDLL{
    public static void main(String[] args) {
        DLL o=new DLL();
      int arr[]={10,20,30,40,50};
        for(int i=0;i<arr.length;i++){
            o.insert(arr[i]);
        }
        o.dis1();
        System.out.println();
        o.dis2();
        System.out.println();
        System.out.println(o.search(20));
        System.out.println(o.search(100));

    }
}
