import java.util.ArrayList;

public class CounterList<E> extends ArrayList<E> 
{
	@Override
	public E remove(int index)
	{
		if (super.size() == 0)
			return null;
		return super.remove(index);
	}
	
	@Override
	public int size()
	{
		return -1;
	}
}