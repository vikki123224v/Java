class InsertionSort{
    public static void main(String[] args) {
        int arr[]={40,30,10,20};
        for(int i=1;i<arr.length;i++){
            while(i>0 && arr[i]<arr[i-1]){
                int temp=arr[i];
                arr[i]=arr[i-1];
                arr[i-1]=temp;
                i--;
            }
        }
        for(int ele:arr){
            System.out.print(ele+" ");
        }
    }
}