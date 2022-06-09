package Intro;

public class WrapperEx {
	public static void main(String[] args) {
		
		Integer x = 5; // boxes int to an Integer object
	      x =  x + 10;   // unboxes the Integer to a int
	      System.out.println(x); 
	      System.out.println(x.compareTo(10));
	      
	      
	      
	      Character ch = new Character('a');
	      System.out.println(ch);
	      System.out.println(ch.charValue());
	      System.out.println(Character.isUpperCase(ch));
	      
	      
	      char[] helloArray = { 'h', 'e', 'l', 'l', 'o', '.' };
	      String helloString = new String(helloArray);  
	      System.out.println( helloString );
	      System.out.println(helloString.length());
		
	}

}
