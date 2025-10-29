public class Program3{//Exception Handling
    public static void main(String[] args) {
        String str="Hello";
        try{
            System.out.println(str.charAt(10));
        }
        catch(StringIndexOutOfBoundsException s){
            System.out.println("String index is invalid");
        }
    }
}