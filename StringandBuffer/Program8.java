class Program8{
    public static void main(String[] args) {
       String x="Mister A1@23";
       int c=0;
       int s=0;
       int n=0;
       int SP=0;
       for(int i=0;i<x.length();i++){
        if(x.charAt(i)>=65 && x.charAt(i)<=90){
            c++;
          
        }
        else if(x.charAt(i)>=97 && x.charAt(i)<=122){
            s++;
            
        }
       else if(x.charAt(i)>=48 && x.charAt(i)<=57){
        n++;
        
       }
      else {
        SP++;
      }
       }
        System.out.println("Cap: "+c);
        System.out.println("small: "+s);
        System.out.println("Digit: "+n);
         System.out.println("Special character: "+SP);
       }
         
    }
