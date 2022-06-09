package Intro;

public class ArrayEx 
{
	public static void main(String[] args) {
		
	
	 int[] arr = {1,2,3,4,5} ;
	 double[] myList = {1.9, 2.9, 3.4, 3.5 , 8.9};
	 
	 for (int i =0 ; i < arr.length ; i++)
	 {
		 System.out.println(arr[i]);
		System.out.println(myList[i]);
	 }
	 int x=0;
	 for (int i =0 ; i < arr.length ; i++)
	 {
		 if (arr[i]>x)
				 {
			 		x=arr[i];
				 }
	 }
	 System.out.println(x);
	 

}
}