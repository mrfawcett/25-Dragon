import java.util.Arrays;
import java.util.ArrayList;

public class Factorial extends Dragon {

	// Determines the factorial of an integer
	// This method is NOT recursive
	// @param num an integer
	// @return the long value of the factorial of num
	public long factIter(int num)
	{
		// Use long instead of int because factorials can get BIG
		long fact = 0;
		
		return fact;
	}
	
	// Determines the factorial of an integer
	// This method IS recursive
	// @param num an integer
	// @return true if num is even, false otherwise
	public long factRecur(int num)
	{
		return 0;
	}
	
	
	
	public static void main(String[] args)
	{
	
		Factorial factual = new Factorial();
				
		System.out.println("factIter(3) is " + factual.factIter(3) + " and should be 6.");
		System.out.println("factIter(4) is " + factual.factIter(4) + " and should be 24.");
		System.out.println();
		System.out.println("factRecur(3) is " + factual.factRecur(3) + " and should be 6.");
		System.out.println("factRecur(5) is " + factual.factRecur(5) + " and should be 120.");
		System.out.println("It looks like you did your homework: " + factual.homeworkDone());
	}
	
	// Helper function to determine if you did your homework
	public boolean homeworkDone()
	{
		Factorial factual = new Factorial();
			
		int randy1 = (int) (Math.random() * 6) + 2;
		int randy2 = (int) (Math.random() * 6) + 2;
			
		while (randy2 == randy1)
			randy2 = (int) (Math.random() * 6) + 2;
			
		long check1 = factual.factIter(randy1);
		long check2 = factual.factRecur(randy2);
		//System.out.println("Checked " + randy1 + " and " + randy2);
		
		if (check1 == 0 && check2 == 0)
			return false;
		return true;
	}
}
