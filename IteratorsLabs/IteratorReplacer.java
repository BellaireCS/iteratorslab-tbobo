//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;
import static java.lang.System.*;

public class IteratorReplacer
{
	private ArrayList<String> list;
	private String toRemove, replaceWith;

	public IteratorReplacer(String line, String rem, String rep)
	{
		setEmAll(line, rem, rep);
	}

	public void setEmAll(String line, String rem, String rep)
	{
		String[] words = line.split();
		list = new ArrayList<>(Arrays.asList(words));
		
		toRemove = rem;
		replaceWith = rep;
	}

	public void replace()
	{
		Iterator iter = list.iterator();
		
		while (iter.hasNext) {
			String current = iter.next();
			
			if (current.equals(toRemove)) {
				iter.set(replaceWith);
			}
		}
	}

	public String toString()
	{
		return list.toString()+"\n\n";
	}
}