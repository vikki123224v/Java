import java.io.File;

public class Program4{
    public static void main(String []args){
        File f=new File("C:\\Users\\vighn\\OneDrive\\Desktop\\CSEC\\Demo2.txt");
        boolean b=f.exists();

        if(b==true)
        {
            f.delete();

            System.out.println("Directory deleted");

        }
        else
        {
            System.out.println("Directory already exists");
        }
    }
}