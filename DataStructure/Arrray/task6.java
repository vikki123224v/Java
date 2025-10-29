class task6{
    public static void  main(String[] args){
        int arr[]={2,3,4,5,6,7,8,9,10};
        int p=0;int sum=0;
        for(int i=0;i<arr.length;i++){//traversal of array
            p=0;
            for(int j=1;j<=arr[i];j++){//check for prime
                if(arr[i]%j==0)
                p++;
            }
                if(p==2){
                    System.out.println(arr[i]);
                sum+=arr[i];
                  } 
        }
                 System.out.println("sum of all the prime number:"+sum);
                
             for(int j=1;j<=sum;j++){//check for prime
                if(sum%j==0)
                p++;
            }
                if(p==2)
                    System.out.println(sum+" is prime");
                else
                    System.out.println(sum+" is not prime");
          
        }
       
    }


//check for prime numbers in an array and print them