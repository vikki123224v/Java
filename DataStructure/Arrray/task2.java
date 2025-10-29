import java.util.*;
class task2{
    public static void main(String args[]){
          String arr[]=new String[6];
   //   String arr[]={"apple", "banana", "cherry", "date", "fig", "grape"};
   Scanner sc=new Scanner(System.in);
   System.err.println("Enter 6  names:");
    for(int i=0;i<arr.length;i++){
          arr[i]=sc.nextLine();
      }
      System.err.println(" ");
      for(int i=arr.length-1;i>=0;i--){
          System.out.println(arr[i]);
      }
    }
}