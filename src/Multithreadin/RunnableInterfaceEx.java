package Multithreadin;

class RunnableInterfaceEx implements Runnable{  
    public void run(){  
    System.out.println("thread is running...");  
    }  
      
    public static void main(String args[]){  
    RunnableInterfaceEx m1=new RunnableInterfaceEx();  
    Thread t1 =new Thread(m1);   // Using the constructor Thread(Runnable r)  
    t1.start();  
     }  
    }  