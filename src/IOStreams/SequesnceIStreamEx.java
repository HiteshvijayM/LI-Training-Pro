package IOStreams;

import java.io.*;  
class SequenceIStreamEx {    
  public static void main(String args[])throws Exception{    
   FileInputStream input1=new FileInputStream("A1.txt");    
   FileInputStream input2=new FileInputStream("A2.txt");    
   SequenceInputStream inst=new SequenceInputStream(input1, input2);

   int j;    
   while((j=inst.read())!=-1){    
    System.out.print((char)j);    
   }    
   inst.close();    
   input1.close();    
   input2.close();    
  }    
}    