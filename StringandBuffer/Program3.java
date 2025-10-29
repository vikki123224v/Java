public class Program3{
    public static boolean Polindrome(String s1){
        StringBuffer sb=new StringBuffer(s1);
        sb.reverse();
        String s2=sb.toString();
        return s1.equalsIgnoreCase(s2);
    }
     public static void is(boolean b){
        if(b){
            System.out.println("Polindrome");
        }else{
            System.out.println("Not a Polindrome");
        }
    }

    public static void main(String[] args){
        String s="Java";
        String s1= s.concat("Programming");
        System.out.println(s1);
        StringBuffer sb = new StringBuffer(s1);
        System.out.println(sb.reverse());
        //polindrome using stringbuffer
        String s2="madam";
        StringBuffer sb1=new StringBuffer(s2);
        sb1.reverse();
        System.out.println(sb1);
        System.out.println(Polindrome(s2));
        is(Polindrome(s2));

        
    }
}
