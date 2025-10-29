import java.util.PriorityQueue;
import java.util.Queue;
class PriorityQueueDemo {
    public static void main(String[] args) {
        Queue<Integer> q = new PriorityQueue<>();
        q.add(5);
        q.add(1);   
        q.add(7);
        q.add(-1);
       System.out.println(q);
       q.remove();
         System.out.println(q);
         System.out.println(q.peek());
         System.out.println(q.isEmpty());
        //System.out.println(q.set(0,111)); // Queue does not support set method and get method 
         System.out.println(q.size());

    }
}