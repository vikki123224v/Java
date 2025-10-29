class Program1{
//print Vighneshwara 10 times using recursion
//Base method and recursive method
    
        public static void main(String[] args){
          dis(1);
        }
        public static void dis(int n){//base case
            if(n==11){
                return;
            }
            else{//recursive case
                System.out.println("Vighneshwara"+ " " +n);
                dis(n+1);
            }
        }
    }
