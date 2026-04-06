import java.util.ArrayList;

public abstract class Dragon {
	
	public abstract boolean homeworkDone();
	
	// Helper function to create an ArrayList out of an array
	public static ArrayList<Integer> create(int[] arr)
	{
		ArrayList<Integer> ret = new ArrayList<Integer>();
			
		for (int i : arr)
			ret.add(Integer.valueOf(i));
		return ret;
	}
	
	// Helper function to create an ArrayList out of an array
	public static CounterList<Integer> createCounter(int[] arr)
	{
		CounterList<Integer> ret = new CounterList<Integer>();
					
		for (int i : arr)
			ret.add(Integer.valueOf(i));
		return ret;
	}
}
