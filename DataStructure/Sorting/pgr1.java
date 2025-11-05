class prg1{//swapping of two numbers
    public static void main(String[] args){
        int a=10;
        int b=20;
        int temp =0;
        System.out.println("Before Swapping: a="+a+" b="+b);
        temp = a;   
        a = b;
        b = temp;   
        System.out.println("After Swapping: a="+a+" b="+b);
        
    }
}