import java.util.HashMap;
import java.util.Map;
class HashMapDemo {//hashmap is a unordered key and value pair
    public static void main(String[] args) {
        Map<Integer,String> s = new HashMap<>();
        s.put(1,"c");
        s.put(0,"c++");
        s.put(3,"java");
        s.put(2,"python");
        s.put(-1,"ruby");
        s.put(1,"js");// we cant have duplicate keys but we can have duplicate values
        System.out.println(s);
    }
}
//output: {-1=ruby, 0=c++, 1=js, 2=python, 3=java}