package IOStreams;

import java.io.*;


// usses internal buffer for getting operations faster 

public class BuffrdStream {
    public static void main(String[] args) {
        FileOutputStream fout;
        FileInputStream fin;
        try {
            fout = new FileOutputStream("f1.txt");
            BufferedOutputStream b1 = new BufferedOutputStream(fout);
            String s = "Buffered out put straeam";
            byte b[]= s.getBytes();
            b1.write(b);
            b1.flush();
            b1.close();
            fout.close();
            System.out.println("Success");

        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            fin = new FileInputStream("f1.txt");
            BufferedInputStream b2 = new BufferedInputStream(fin);
            int ch ;
            while ((ch = b2.read())!=-1 )
            {
                System.out.print( (char)ch );
            }
            b2.close();
            fin.close();
        } catch (Exception e1) {
            e1.printStackTrace();   
        }          
    }

    
}
