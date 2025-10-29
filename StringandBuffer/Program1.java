public class Program1{
    public static void is(boolean b){
        if(b){
            System.out.println("Polindrome");
        }else{
            System.out.println("Not a Polindrome");
        }
    }
    public static boolean Polindrome(String s1){
        StringBuffer sb=new StringBuffer(s1);
        sb.reverse();
        String s2=sb.toString();
        return s1.equalsIgnoreCase(s2);
    }
    public static void main(String[] args){
        String s="a,e,i,o,u";
        System.out.println(s.length());
        System.out.println(s.charAt(4));
        String s1="Madam";
        String s2="sir";
        //polindrome
        StringBuffer sb=new StringBuffer(s1);
        sb.reverse();   
        System.out.println(sb);
        is(Polindrome(s1));
        System.out.println(s1.equals("Madam"));
        System.out.println(s1.equalsIgnoreCase("madam"));
        is(Polindrome(s2));
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));

    }
}

    
