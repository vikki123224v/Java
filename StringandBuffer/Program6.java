class Program6
{
    public static void main(String args[])
    {
            //String methods
       String s1="Hello";
       String s2="hello";
       System.out.println(s1.length()) ;
       System.out.println(s1.charAt(0)) ;
       System.out.println(s1.indexOf('e')) ;
       System.out.println(s1.isEmpty()) ;
       System.out.println(s1.isBlank()) ;
//String changing methods
         System.out.println(s1.toUpperCase()) ;
            System.out.println(s1.toLowerCase()) ;
            System.out.println(s1);

            //sting checking methods
            System.out.println(s1.equals(s2));
            System.out.println(s1.equalsIgnoreCase(s2));
            System.out.println(s1.startsWith("He"));
            System.out.println(s1.endsWith("lo"));
            System.out.println(s1.contains("ll"));
            System.out.println(s1.compareTo(s2));
            System.out.println(s1.compareToIgnoreCase(s2));
            //trim method
            System.out.println(s1);
            System.out.println(s1.trim());
            System.out.println(s1.trim().length());
            System.out.println(s1.length());
            //String buffer and String Builder
            StringBuffer sb=new StringBuffer(s1);
            sb.append(" World");
            System.out.println(sb);
            sb.reverse();
            System.out.println(sb);
            sb.delete(0, 6);
            System.out.println(sb);
                sb.replace(5, 8," Java");
            System.out.println(sb);
            //difference between String, StringBuffer and StringBuilder
            //String is immutable
            //StringBuffer is mutable and synchronized
            //StringBuilder is mutable and non-synchronized
            //string buffer is thread safe
            //string builder is not thread safe
            //string buffer is slower than string builder
            //string builder is faster than string buffer
            //string buffer is used in multi-threading
            //string builder is used in single-threading
            


    }
}