package ExceptionHandling;

public class ThrowsDemo {
    public static void avg() throws ArithmeticException
    {
        System.out.println("Inside avg fx");
        throw new ArithmeticException("Demo");
    }
public static void main(String[] args) {
    try {
        avg();
        
    } finally{
        System.out.println("Main method excetion");
    }

}
}
