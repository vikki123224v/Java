import java.util.*;
class task4{
    public static void main(String[] args) {
        int arr[]=new int[5];
        int e=0;int o=0;
        int sum=0;
        int  sume=0;
        int sumo=0;
        ArrayList<Integer>even=new ArrayList<>();
        ArrayList<Integer>odd=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the 5 elements");
        for(int i=0;i<arr.length;i++){
              arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                System.out.println(arr[i]+" is even");e++;
                even.add(arr[i]);
                sume+=arr[i];
            }
            else{
                System.out.println(arr[i]+" is odd");o++;
                odd.add(arr[i]);
                sumo+=arr[i];
            }
            sum+=arr[i];
        }
        System.out.println("even elements are:"+even);
        System.out.println("odd elements are:"+odd);
        System.out.println("total even elements:"+e);
        System.out.println("total odd elements:"+o);
        System.out.println("sum of even elements:"+sume);
        System.out.println("sum of odd elements:"+sumo);
        System.out.println("sum of all elements:"+sum);
    }
}