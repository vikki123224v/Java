import java.util.*;
public class TwoDArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[][]={
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        for (int i = 0; i < arr.length; i++) {//rows
            for (int j = 0; j < arr[i].length; j++) {//columns
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }   
    }
}
