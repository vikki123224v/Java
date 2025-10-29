import java.util.Set;
import java.util.HashSet;
class HashSetDemo {//hashset is a unordered
    public static void main(String[] args) {
        Set<Integer> hs = new HashSet<>();
        hs.add(2);
        hs.add(10);   
        hs.add(3);
        hs.add(2);
        System.out.println(hs);
        hs.remove(2);
         System.out.println(hs);
         System.out.println(hs.isEmpty());
         System.out.println(hs.size());
    }
}