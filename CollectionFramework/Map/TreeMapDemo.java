import java.util.Map;
import java.util.TreeMap;
class TreeMapDemo {//hashmap is a unordered key and value pair
    public static void main(String[] args) {
        Map<Integer,String> s = new TreeMap<>();
        s.put(1,"c");
        s.put(0,"c++");
        s.put(3,"java");
        s.put(2,"python");
        s.put(-1,"ruby");
        System.out.println(s);

       
    }
}