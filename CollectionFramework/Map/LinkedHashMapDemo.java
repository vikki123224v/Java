import java.util.LinkedHashMap;
import java.util.Map;
class LinkedHashMapDemo {//linkedhashmap is a same ordered key and value pair
    public static void main(String[] args) {
        Map<Integer,String> s = new LinkedHashMap<>();
        s.put(1,"c");
        s.put(0,"c++");
        s.put(3,"java");
        s.put(2,"python");
        s.put(-1,"ruby");
        System.out.println(s);

       
    }
}