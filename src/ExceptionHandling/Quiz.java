package ExceptionHandling;

public class Quiz {
    public static void main(String[] args) {
        
    
    try{
        int x = 0;
        int y = 5/x;


    }
    catch (Exception e) {
        System.out.println("exception");
    }
    catch (ArithmeticException e1){
        System.out.println("arithematic caught");
    }

    finally{
        System.out.println("finally");

    }

}}