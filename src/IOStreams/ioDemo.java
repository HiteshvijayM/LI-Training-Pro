package IOStreams;

import java.io.FileOutputStream;

public class ioDemo{  
    public static void main(String args[]){    
           try{    
             FileOutputStream fout=new FileOutputStream("C:\\Users\\MAQ-USER\\JavaIO\\testout.txt");    
             fout.write(65);    
             fout.close();    
             System.out.println("success...");    
            }catch(Exception e){System.out.println(e);}    
      }    
}  