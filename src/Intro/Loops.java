package Intro;

public class Loops {

	public static void main(String[] args) {

		// while
		System.out.println("While Loop  \n");
		int i = 0;

		while (i <= 10) {

			System.out.println("The value of I is " + i);
			i++;
		}

		System.out.println("\n \n For Loop  \n");
		for (int x = 10; x < 30; x = x + 1) {
			System.out.print("value of x : " + x);
			System.out.print("\n");
		}

		// do While loop

		System.out.println("\n \n Do while Loop  \n");
		int z = 0;

		do {
			System.out.println("The value of Z is " + z);
			z++;
		} while (z < 10);

	}
}



















