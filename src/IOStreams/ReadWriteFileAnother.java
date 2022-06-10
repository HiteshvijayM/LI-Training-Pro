package IOStreams;

import java.io.*;

public class ReadWriteFileAnother 
{
    public static void main(String[] args) 
    {
        File inflie = new File("A1.txt");
        File outfile = new File("A2.txt");

        FileReader fr = null;
        FileWriter fw = null;

        try {
            fr = new FileReader(inflie);
            fw = new FileWriter(outfile);
            int ch;
            
            while ((ch=fr.read())!=-1)
            {
                fw.write((char)ch);
                System.out.print((char)ch);
            }
            fr.close();
            fw.close();
            
        } catch (Exception e) {
            
        }


        




        
    }
    
}
