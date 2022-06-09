package Intro;

public class StaticMethod {

	   private static int numInstances = 0;

	   protected static int getCount() {
	      return numInstances;
	   }

	   private static void addInstance() {
	      numInstances++;
	   }

	   StaticMethod() {
	      StaticMethod.addInstance();
	   }

	   public static void main(String[] arguments) {
	      System.out.println("Starting with " + StaticMethod.getCount() + " instances");

	      for (int i = 0; i < 500; ++i) {
	         new StaticMethod();
	      }
	      System.out.println("Created " + StaticMethod.getCount() + " instances");
	   }
	}

