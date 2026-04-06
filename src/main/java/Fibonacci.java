import java.util.Arrays;
import java.util.ArrayList;

public class Fibonacci extends Dragon {

	// Determines the fibonacci sequence value of an integer
	// This method is NOT recursive
	// @param num an integer
	// @return the fibonacci sequence value of num
	public int fibIter(int num)
	{
		return 0;
	}
	
	// Determines the fibonacci sequence value of an integer
	// This method IS recursive
	// @param num an integer
	// @return the fibonacci sequence value of num
	public int fibRecur(int num)
	{
		return 0;
	}
	
	
	public static void main(String[] args)
	{
	
		Fibonacci fibby = new Fibonacci();
				
		System.out.println("fibIter(0) is " + fibby.fibIter(0) + " and should be 1.");
		System.out.println("fibIter(1) is " + fibby.fibIter(1) + " and should be 1.");
		System.out.println("fibIter(2) is " + fibby.fibIter(2) + " and should be 2.");
		System.out.println("fibIter(3) is " + fibby.fibIter(3) + " and should be 3.");
		System.out.println("fibIter(4) is " + fibby.fibIter(4) + " and should be 5.");
		System.out.println("fibIter(5) is " + fibby.fibIter(5) + " and should be 8.");
		System.out.println();
		System.out.println("fibRecur(0) is " + fibby.fibRecur(0) + " and should be 1.");
		System.out.println("fibRecur(1) is " + fibby.fibRecur(1) + " and should be 1.");
		System.out.println("fibRecur(2) is " + fibby.fibRecur(2) + " and should be 2.");
		System.out.println("fibRecur(3) is " + fibby.fibRecur(3) + " and should be 3.");
		System.out.println("fibRecur(4) is " + fibby.fibRecur(4) + " and should be 5.");
		System.out.println("fibRecur(5) is " + fibby.fibRecur(5) + " and should be 8.");
		System.out.println("It looks like you did your homework: " + fibby.homeworkDone());
	}
	
	// Helper function to determine if you did your homework
	public boolean homeworkDone()
	{
		Fibonacci fibby = new Fibonacci();
		
		int randy1 = (int) (Math.random() * 6) + 2;
		int randy2 = (int) (Math.random() * 6) + 2;
		
		while (randy2 == randy1)
			randy2 = (int) (Math.random() * 6) + 2;
		
		int check1 = fibby.fibIter(randy1);
		int check2 = fibby.fibIter(randy2);
		//System.out.println("Checked " + randy1 + " and " + randy2);
		
		if (check1 == 0 && check2 == 0)
			return false;
		return true;
	}
}
