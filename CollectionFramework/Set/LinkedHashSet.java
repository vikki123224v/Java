import java.util.Set;
import java.util.LinkedHashSet;
class LinkedHashSetDemo {//linkedhashset is an  same ordered
    public static void main(String[] args) {
        Set<Integer> hs = new LinkedHashSet();
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