import java.util.*;
class task3{
    public static void main(String args[]){
        String arr[]=new String[5];
        Scanner sc=new Scanner(System.in);
       List<String>l=new ArrayList<>();
       System.out.println("enter the 5 elements");
       for(int i=0;i<arr.length;i++){
              arr[i]=sc.nextLine();
           l.add(arr[i]);

       }
   
       System.out.println(l);
   

}
}