//StringBuilder
import java.util.Scanner;
public class Program4{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        //take user input to reverse a string
        System.out.println("Enter the string");
       
       String s1 = sc.nextLine();
       StringBuilder sb = new StringBuilder(s1);
       sb.reverse();
         System.out.println(sb);
      
    }
}