package iterators;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class PositiveFilter2 implements Iterator<Integer> {

	private Iterator<Integer> base;
	private Integer nextPositive = null;
	
	public PositiveFilter2(Iterator<Integer> base) {
		this.base=base;
	}
	
	public Integer next() {
		// Note that !hasNext () means not hasNext() and it's shorter than the equivalent: hasNext() == false
		if ( !hasNext() ) {
			throw new NoSuchElementException();
		} 
		
		// Is nextPositive null here or not?
		
		// Now I should "consume" nextPositive, ie, return it
		// and I should change it so that hasNext() knows it has to advance over the base. 
		
		// Note: how can I do both 1) return the non-null value of nextPositive and 2) set nextPositive to null
		// before returning?
		
		// TODO: complete it as above
	}
	
	public boolean hasNext()
	{ 		
		if ( nextPositive != null )
			// This was found by a previous call to hasNext() and has to be consumed yet, so my result is true and 
			// I won't advance the iterator until you consume it
			return true;
	
		// What's the value of nextPositive here?
		
		// Note that hasNext () is equivalent to: hasNext () == true
		while ( base.hasNext() ) {
			int i = base.next();
			if (i > 0) {
				nextPositive = i;
				return true;
			}
		}
		
		// What's the value of nextPositive here?
		return false;
	} 	 
}
