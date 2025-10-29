import java.util.ArrayDeque;
import java.util.Queue;
class Program5{
    public static void main(String[] args) {
        Queue<Integer> q = new ArrayDeque<>();
        q.add(5);
        q.add(3);   
        q.add(6);
       System.out.println(q);
       q.remove();
         System.out.println(q);
         System.out.println(q.peek());
         System.out.println(q.isEmpty());
        //System.out.println(q.set(0,111)); // Queue does not support set method and get method 
         System.out.println(q.size());

    }
}