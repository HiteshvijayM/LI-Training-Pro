package Intro;

interface AnimalN {
	   public void eat();
	   public void travel();
	}

public class InterfaceEx implements AnimalN {
	

		   public void eat() {
		      System.out.println("Mammal eats");
		   }

		   public void travel() {
		      System.out.println("Mammal travels");
		   } 

		   public int noOfLegs() {
		      return 0;
		   }

		   public static void main(String args[]) {
			   InterfaceEx m = new InterfaceEx();
		      m.eat();
		      m.travel();
		   }
		} 


