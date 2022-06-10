package IOStreams;

import java.io.FileOutputStream;

public class OutputStream1 
{
    public static void main(String[] args)    
    {
        try {
            FileOutputStream x = new FileOutputStream("testoutself.txt");
            String h = "Hi this is Hitesh";
            byte a[] = h.getBytes(); 
            x.write(a);
            x.close();

        }
    catch (Exception e) {
        e.printStackTrace();
    }
      
}
}