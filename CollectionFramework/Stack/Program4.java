import java.util.Stack;
class Program4{
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.pop();
        System.out.println(s);
        System.out.println(s.peek());
        System.out.println(s);
        System.out.println(s.isEmpty());
        System.out.println(s.size());
        System.out.println(s);
       
    }
}