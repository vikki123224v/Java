import java.io.File;

public class Program3{
    public static void main(String []args){
        File f=new File("C:\\Users\\vighn\\OneDrive\\Desktop\\CSEC\\Demo2.txt");
        boolean b=f.exists();

        if(b==false)
        {
            f.mkdir();
            System.out.println("Directory created");

        }
        else
        {
            System.out.println("Directory already exists");
        }
    }
}