package iterators;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * TODO: comment me!
 *
 * @author brandizi
 * <dl><dt>Date:</dt><dd>11 Dec 2020</dd></dl>
 *
 */
public class PositiveFilterTest
{
	private static void listScanTest ()
	{
		System.out.println( "--- basicTest() ---" );

		// By Liskov susbtitution principle, it's usually better to declare it as a List, using the generic interface
		// rather than the specific implementation.
		List<Integer> list = new LinkedList<>();
		
		list.add(-1);
		list.add(2);
		list.add(3);
		list.add(-4);
		list.add(5);
		list.add(6);
		list.add(-7);
		list.add(-8);
		list.add(9);
		list.add(-10);
		
		Iterator<Integer> a = list.listIterator();
		Iterator<Integer> b = new PositiveFilter(a);
		
		while (b.hasNext()) {
			Integer c = b.next();
			System.out.println(c);
		}		
	}
	
	private static void doubleNextTest ()
	{
		System.out.println( "--- doubleNextTest() ---" );

		// That's another way to populate a list (though this is read-only)
		List<Integer> list = List.of ( -2, 1, -1 );

		// That's a shorter (thought less readable) way to get the filter.
		Iterator<Integer> posItr = new PositiveFilter ( list.iterator () );		

		int p = posItr.next (); // Should give 1
		System.out.println ( "First call to next ():" +  p );

		// This should give NoSuchElementException, since hasNext() is false
		// Note that 1) the Iterator's contract (ie, definition) demands that NoSuchElementException is raised in this 
		// situation and 2) you cannot assume the callers of your PositiveFilter always use it correctly, ie, they can 
		// do the mistake made here, consisting in calling next() without checking if hasNext() is true
		p = posItr.next (); 
		System.out.println ( "Second call to next ():" +  p ); // What does it happen instead?
	}
	
	
	public static void main(String args[])
	{
		listScanTest ();
		doubleNextTest (); // NoSuchElementException should occur here.
	}
	
}
