public class Program2{//Exception Handling
    public static void main(String[] args) {
        int [] arr = {12,13,14,15,16};
        try{
            System.out.println(arr[13]);
        }
        catch(ArrayIndexOutOfBoundsException v){
            System.out.println("Try to access invalid index of array");
        }
    }
}