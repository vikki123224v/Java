import java.util.List;
import java.util.LinkedList;
class Program1{
    public static void main(String[] args) {
        List<Integer> l = new LinkedList<>();
       // ArrayList<Integer> l = new ArrayList<>();
        //List l=new ArrayList();
        l.add(1);
        l.add(2);
        l.add(0,100);
        System.out.println(l);
        System.out.println(l.size());
        System.out.println(l.get(0));
        System.out.println(l.isEmpty());
        System.out.println(l.set(1,111));
        System.out.println(l);
    }
}