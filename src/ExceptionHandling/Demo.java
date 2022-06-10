package ExceptionHandling;

public class Demo {
  public static void main(String[] args) {
      try {

        //   String str = null;
        //   System.out.println(str.length());

          int x = 5/0;
          System.out.println(x);
          
      }
     

      catch (NullPointerException e) {
          System.out.println(e.getLocalizedMessage());
          System.out.println("Exception occured");
          
      }
      catch (Exception e1)
      {
          System.out.println("Default exception");
          System.out.println(e1.getLocalizedMessage());
      }

      finally{
        System.out.println("Alway gets executed");
    }
  }
  
    
}
