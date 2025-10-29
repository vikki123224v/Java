import java.io.FileWriter;
import java.io.IOException;

public class Program5{//writti ng in a file
    public static void main(String []args){
        FileWriter ref = null;
		
		try
		{
			ref = new FileWriter("C:\\Users\\vighn\\OneDrive\\Desktop\\CSEC\\Demo2.txt");
			ref.write("Hai ");
			ref.write("\n");
			ref.write("Hello World");
			ref.flush();
			System.out.println("Write Completed");
			
		}
		catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			try {
				ref.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}

    
