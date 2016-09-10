//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;
import static java.lang.System.*;

public class IteratorReplacerRunner
{
	public static void main ( String[] args )
	{
		//add test cases
		IteratorRemover test = new IteratorRemover("a b c d e f g h i j x x x", "x", "#");
		test.replace();
		System.out.println(test)
	}
}