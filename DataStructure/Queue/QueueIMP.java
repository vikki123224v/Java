class QueueIMP{
    public static void main(String[] args) {
        Queue q=new Queue(5);
        q.push(10);
        q.dis();
        q.peek();
        q.pop();
        q.dis();
    }
}
class Queue{
int arr[];int top;
Queue(int size){
arr=new int[size];
top=-1;
}
void push(int ele){
    if(top==arr.length-1){
        System.out.println("Queue Overflow");
    }
    else{
        top++;
        arr[top]=ele;
        System.out.println("element pushed :"+ele);
    }

    
}

void dis(){
    if(top==-1){
        System.out.println("Queue is empty");
    }
    else{
        for(int i=0;i<=top;i++){
            System.out.println(arr[i]);
        }
    }
}
void peek()
{
    if(top==-1){
        System.out.println("Queue is empty");
    }
    else{
        System.out.println("Top element is :"+arr[0]);
    }
}
void pop(){
    if(top==-1){
        System.out.println("queue underflow");
    }
    else{
        for(int i=0;i<arr.length-1;i++){
            arr[i]=arr[i++];
        }
        top--;
    }
}

}
