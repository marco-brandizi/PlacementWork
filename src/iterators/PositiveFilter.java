package iterators;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class PositiveFilter implements Iterator<Integer> {

	private Iterator<Integer> base;
	private Integer nextPositive = null;
	
	public PositiveFilter(Iterator<Integer> base) {
		this.base=base;
	}
	
	public Integer next() {
		// Note that !hasNext () means not hasNext() and it's shorter than the equivalent: hasNext() == false
		if (nextPositive == null && !hasNext() ) {
			throw new NoSuchElementException();
		} 
		return nextPositive;
	}
	
	public boolean hasNext() { 
		// Note that hasNext () is equivalent to: hasNext () == true
		while ( base.hasNext() ) {
			int i = base.next();
			if (i > 0) {
				nextPositive = i;
				return true;
			}
		}
		return false;
	}
	
	// Note I moved main() to PositiveFilterTest
}
