class Program2
{
    public static void main(String[] args)
    {
        int ress=1;
        for(int i=1;i<=5;i++){//looping statement to calculate factorial
            ress=ress*i;
        }
        System.out.println(ress);
     int res=f(5);
        System.out.println(res);
    }
    public static int  f(int n)//factorial using recursion
    {
        if (n == 1)
        {
            return 1;
        }
        else
        {
            return n*f(n - 1);
        }
    }
}//looping statement is best for this problem as it is simple and easy to understand and also it uses less memory as compared to recursion
