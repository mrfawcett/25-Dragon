import java.util.Arrays;
import java.util.ArrayList;

public class OddsAndEvens extends Dragon {

	// Determines if an integer is odd or not
	// This method is NOT recursive
	// @param num an integer
	// @return true if num is odd, false otherwise
	public boolean isOdd(int num)
	{
		return false;
	}
	
	// Determines if an integer is even or not
	// This method is NOT recursive
	// @param num an integer
	// @return true if num is even, false otherwise
	public boolean isEven(int num)
	{
		return false;
	}
	
	// Determines if all integers in the array are odd
	// This method MUST BE recursive
	// @param arr an array of integers
	// @return true if all numbers in arr are odd, false otherwise
	public boolean isOddArray(int[] arr)
	{
		return false;
	}
	
	// Determines if all integers in the array are even
	// This method MUST BE recursive
	// @param arr an array of integers
	// @return true if all numbers in arr are even, false otherwise
	public boolean isEvenArray(int[] arr)
	{
		return false;
	}
	
	// Determines if all integers in the ArrayList are odd
	// This method MUST BE recursive
	// @param arr an ArrayList of integers
	// @return true if all numbers in arr are odd, false otherwise
	public boolean isOddArrayList(ArrayList<Integer> arr)
	{
		return false;
	}
	
	// Determines if all integers in the ArrayList are even
	// This method MUST BE recursive
	// @param arr an ArrayList of integers
	// @return true if all numbers in arr are even, false otherwise
	public boolean isEvenArrayList(ArrayList<Integer> arr)
	{
		return false;
	}
	
	public static void main(String[] args)
	{
		OddsAndEvens oddish = new OddsAndEvens();
		int a[] = {1, 2, 3, 4, 5};
		ArrayList<Integer> alia = OddsAndEvens.create(a);
					
		System.out.println("a[] and alia contain [1, 2, 3, 4, 5]");
		System.out.println("isOddArray(a) is " + oddish.isOddArray(a) + " and should be false.");
		System.out.println("isOddArrayList(alia) is " + oddish.isOddArrayList(alia) + " and should be false.");
		alia = OddsAndEvens.create(a);
		System.out.println("isEvenArray(a) is " + oddish.isEvenArray(a) + " and should be false.");
		System.out.println("isEvenArrayList(alia) is " + oddish.isEvenArrayList(alia) + " and should be false.");
		System.out.println();
		
		int b[] = {1, 3, 5, 7, 9};
		ArrayList<Integer> alib = OddsAndEvens.create(b);
					
		System.out.println("b[] and alib contain [1, 3, 5, 7, 9]");
		System.out.println("isOddArray(b) is " + oddish.isOddArray(b) + " and should be true.");
		System.out.println("isOddArrayList(alib) is " + oddish.isOddArrayList(alib) + " and should be true.");
		alib = OddsAndEvens.create(b);
		System.out.println("isEvenArray(b) is " + oddish.isEvenArray(b) + " and should be false.");
		System.out.println("isEvenArrayList(alib) is " + oddish.isEvenArrayList(alib) + " and should be false.");
		System.out.println();
		
		int c[] = {2, 4, 6, 8, 10};
		ArrayList<Integer> alic = OddsAndEvens.create(c);
			
		System.out.println("c[] and alic contain [2, 4, 6, 8, 10]");
		System.out.println("isOddArray(c) is " + oddish.isOddArray(c) + " and should be false.");
		System.out.println("isOddArrayList(alic) is " + oddish.isOddArrayList(alic) + " and should be false.");
		alic = OddsAndEvens.create(c);
		System.out.println("isEvenArray(c) is " + oddish.isEvenArray(c) + " and should be true.");
		System.out.println("isEvenArrayList(alic) is " + oddish.isEvenArrayList(alic) + " and should be true.");
		System.out.println("It looks like you did your homework: " + oddish.homeworkDone());
	}
	
	
	
	// Helper function to determine if you did your homework
	public boolean homeworkDone()
	{
		OddsAndEvens oddish = new OddsAndEvens();
		
		int a[] = {1, 2, 3, 4, 5};
		ArrayList<Integer> alia = OddsAndEvens.create(a);
		int b[] = {1, 3, 5, 7, 9};
		ArrayList<Integer> alib = OddsAndEvens.create(b);
		int c[] = {2, 4, 6, 8, 10};
		ArrayList<Integer> alic = OddsAndEvens.create(c);
		
		boolean check1 = oddish.isEvenArray(a) && oddish.isOddArray(a) && oddish.isEvenArrayList(alia) && oddish.isOddArrayList(alia);  
		boolean check2 = oddish.isOddArray(b) && oddish.isOddArrayList(alib);
		boolean check3 = oddish.isEvenArray(c) && oddish.isEvenArrayList(alic);
		
		if (!check1 && !check2 && !check3)
			return false;
		return true;
	}
}
