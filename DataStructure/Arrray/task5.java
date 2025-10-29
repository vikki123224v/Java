import java.util.*;
class task5{
    public static void main(String[] args) {
        int arr[]=new int[5];
        int skipelement;
        int i;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the 5 elements");
        for( i=0;i<arr.length;i++){
              arr[i]=sc.nextInt();
        }
        System.out.println("enter the element to be skipped");
        skipelement=sc.nextInt();
        for( i=0;i<arr.length;i++){
            if(arr[i]==skipelement){
                continue;
             
            }
            System.out.println(" "+arr[i]);
        }


        
    }
}