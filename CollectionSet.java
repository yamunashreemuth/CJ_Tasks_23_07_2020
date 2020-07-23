package Package1;

import java.util.Set;
import java.util.TreeSet;
import java.util.HashSet;
import java.util.Iterator;
//set no duplicate elements 
public class CollectionSet {

	public static void main(String[] args) {
		
		HashSet values = new HashSet();
		values.add(562);
		values.add(617.96);
		values.add("Check");
	    System.out.println(values.add(562)); //no duplicates in Hash set
		
		Iterator itr = values.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());	} //output isn't in sequence for set
		
		Set<Integer> val = new TreeSet<Integer>();
		val.add(98);
		val.add(80);
		val.add(22);
		for(int i : val) {
			System.out.println("Tree Set: "+i); //Tree set output will be in sequence
		}

	}

}
