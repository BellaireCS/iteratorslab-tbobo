//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import static java.lang.System.*;

public class IteratorRemover
{
	private ArrayList<String> list;
	private String toRemove;

	public IteratorRemover(String line, String rem)
	{
		setTest(line, rem);
	}

	public void setTest(String line, String rem)
	{
		String[] words = line.split(" ");
		list = new ArrayList<>(Arrays.asList(words));
		toRemove = rem;
	}

	public void remove()
	{
		Iterator iter = list.iterator();
		
		while(iter.hasNext()) {
			String current = iter.next();
			
			if (current.equals(rem)) {
				iter.remove();
			}
		}
	}

	public String toString()
	{
		return list.toString().replaceAll();
	}
	

}