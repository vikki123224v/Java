import java.util.*;
public class p1 {//Dynamic allocation of array
    public static void main(String[] args) {
        int arr[]=new int[5];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            System.out.println("Enter the "+i+" index ");
            arr[i]=sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]+" ");
        }
    }
}