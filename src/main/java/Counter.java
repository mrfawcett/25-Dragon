import java.util.Arrays;
import java.util.ArrayList;

public class Counter extends Dragon {

	// Determines the size of a list
	// This method IS recursive
	// @return the number of elements in the list
	public int count(CounterList<Object> a)
	{
		return 0;
	}
	
	
	public static void main(String[] args) 
	{	
		Counter county = new Counter();
		int a[] = {1, 2, 3, 4, 5};
		CounterList lista = Counter.createCounter(a);
		int b[] = {3, 1, 4, 1, 5, 2, 6, 5, 3, 5, 8, 9, 7, 9};
		CounterList listb = Counter.createCounter(b);
			
		System.out.println("countElements(lista) is " + county.count(lista) + " and should be 5.");
		System.out.println("countElements(listb) is " + county.count(listb) + " and should be 14.");
		System.out.println("It looks like you did your homework: " + county.homeworkDone());
	}	
	
	// Helper function to determine if you did your homework
	public boolean homeworkDone()
	{
		Counter c = new Counter();
		
		int randy1 = (int) (Math.random() * 20) + 1;
		int randy2 = (int) (Math.random() * 20) + 1;
		
		while (randy2 == randy1)
			randy2 = (int) (Math.random() * 20) + 1;
		
		int[] arra = new int[randy1];
		int[] arrb = new int[randy2];
		
		for (int i = 0; i < randy1; i++)
			arra[i] = i+1;
		for (int i = 0; i < randy2; i++)
			arrb[i] = i+1;
		
		CounterList lista = Counter.createCounter(arra);
		CounterList listb = Counter.createCounter(arrb);
		
		int check1 = c.count(lista);
		int check2 = c.count(listb);
		
		//System.out.println("Checked " + randy1 + " and " + randy2);
		
		if (check1 == 0 && check2 == 0)
			return false;
		return true;
	}
}
