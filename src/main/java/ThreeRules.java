import java.util.Arrays;
import java.util.ArrayList;

public class ThreeRules extends Dragon {

	// Writes HA to the screen as many times as specified by the parameter, all in one line with no spaces
	// This method IS recursive
	// @param num an integer
	// @return A string containing HA x num to the screen. Example: if num == 3, HAHAHA  
	public String laugh(int num)
	{
		return "";
	}
	
	
	// Determines the sum of all elements in an integer array
	// This method IS recursive
	// @param num an integer
	// @return the value of the sum of all of the elements of arr
	public int addUp(int[] arr)
	{
		return 0;
	}
	
	
	// Determines the sum of all elements in an integer array list
	// This method IS recursive
	// @param num an integer
	// @return the value of the sum of all of the elements of arr
	public int addUp(ArrayList<Integer> arr)
	{
		return 0;
	}
	
	public static void main(String[] args)
	{
	
		ThreeRules trois = new ThreeRules();
				
		System.out.println("laugh(3) is " + trois.laugh(3) + " and should be HAHAHA");
		System.out.println("laugh(5) is " + trois.laugh(5) + " and should be HAHAHAHAHA");
		System.out.println();
		
		int[] a = {1, 2, 3, 4, 5};
		ArrayList<Integer> lista = ThreeRules.create(a);
		int[] b = {3, 4, 5, 7, 8, 9, 11, 12, 13};
		ArrayList<Integer> listb = ThreeRules.create(b);
		
		System.out.println("addUp(a) is " + trois.addUp(a) + " and should be 15.");
		System.out.println("addUp(lista) is " + trois.addUp(lista) + " and should be 15.");
		System.out.println();
		System.out.println("addUp(b) is " + trois.addUp(b) + " and should be 70.");
		System.out.println("addUp(listb) is " + trois.addUp(listb) + " and should be 70.");
		System.out.println("It looks like you have done your homework: " + trois.homeworkDone());
	}
	
	// Helper function to determine if you did your homework
	public boolean homeworkDone()
	{
		ThreeRules tres = new ThreeRules();
		
		int randy1 = (int) (Math.random() * 6) + 2;
		int randy2 = (int) (Math.random() * 6) + 2;
		
		while (randy2 == randy1)
			randy2 = (int) (Math.random() * 6) + 2;
		
		String check1 = laugh(randy1);
		String check2 = laugh(randy2);
		//System.out.println("Checked " + randy1 + " and " + randy2);
		
		int[] a = {1, 2, 3, 4, 5};
		ArrayList<Integer> lista = ThreeRules.create(a);
		int[] b = {3, 4, 5, 7, 8, 9, 11, 12, 13};
		ArrayList<Integer> listb = ThreeRules.create(b);
		
		int check3 = addUp(a);
		int check4 = addUp(b);
		int check5 = addUp(lista);
		int check6 = addUp(listb);
		
		
		if (check1.length() == 0 && check2.length() == 0 && check3 == 0 && check4 == 0 && check5 == 0 && check6 == 0)
			return false;
		
	
		return true;
	}
}
