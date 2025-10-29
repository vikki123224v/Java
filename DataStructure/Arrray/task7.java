class task7{
    public static void main(String[] args){//linear search
        int arr[]={1,2,3,4,5};
        int tar=5;int p=0;int index=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==tar){
                p=1;index=i;
                break;

            }
        }
        if(p==1){
            System.out.println(tar +" found at index"+index);

        }
        else{
        System.out.println(tar+" not found at index "+index);
    }
    }
}