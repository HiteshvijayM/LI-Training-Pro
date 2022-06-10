package IOStreams;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class FileWriterReaderClass {

    public static void main(String[] args) {

        File outfile = new File("A1.txt");
        File infile = new File("A1.txt");
        FileWriter fw = null;
        FileReader fr = null;

        try {
            fw = new FileWriter(outfile);
            String s = "Hi this is file class demo";
            fw.write(s);
            fw.close();
        } catch (Exception e) {
            
        }

        try {
            fr = new FileReader(infile);
            int ch; 
            while ((ch = fr.read()) != -1)
            {
                System.out.print((char)ch);
            } 
            fr.close();
            
        } catch (Exception e) {
           
        }
       
    }  
}
