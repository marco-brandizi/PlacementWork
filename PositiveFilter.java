package Exercise;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.NoSuchElementException;

public class PositiveFilter implements Iterator<Integer> {

	private Iterator<Integer> base;
	private Integer nextPositive = null;
	
	public PositiveFilter(Iterator<Integer> base) {
		this.base=base;
	}
	
	public Integer next() { 
		if (nextPositive == null && hasNext() == false) {
			throw new NoSuchElementException();
		} 
		return nextPositive;
	}
	
	public boolean hasNext() { 
		while (base.hasNext()==true) {
			int i = base.next();
			if (i > 0) {
				nextPositive = i;
				return true;
			}
		}
		return false;
	} 	 
	
	public static void main(String args[]) {

		LinkedList<Integer> list = new LinkedList<Integer>();
		
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
}
