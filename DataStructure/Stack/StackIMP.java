class StackIMP{
    public static void main(String[] args) {
        
    
Stack o=new Stack(5);
o.push(10);
o.push(20);
o.push(30);
o.dis();
o.peek();
o.pop();
o.pop();
o.pop();
o.dis();

}
}
class Stack{
   int arr[];
   int top;
   Stack(int size){
    arr=new int[size];
    top=-1;

   } 
   void push(int data){
   if(top==arr.length-1){
    System.out.println("Stack is overflow");
   }
   else{
   
    arr[++top]=data;
    System.out.println("pushed"+" "+data);
   }
}
void dis(){
    if(top==-1){
        System.out.println("Stack is underflow");
    }
    else{
//for(int i=0;i<=arr.length-1;i++){
for(int i=0;i<=top;i++){
        System.out.println(arr[i]);
    }
}
}
void peek(){
    if(top==-1){
        System.out.println("Stack is Underflow");
    }
    else{
        System.out.println("top element is"+" "+arr[top]);
    }
}

void pop(){
    if(top==-1){
        System.out.println("Stack  is underflow");
    }
    else{
        top--;
        
    }
}
}