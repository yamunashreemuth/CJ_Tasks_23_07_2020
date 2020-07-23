package Package1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Iterator;
import java.util.List;

public class CollectionsTest {

	public static void main(String[] args) {
	
		ArrayList<String> obj = new ArrayList<String>();
		LinkedList<Integer> ls = new LinkedList<Integer>();
		
		obj.add("Testing");
		obj.add("name");
		obj.add(1, "what");
		Iterator it = obj.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		for(String o : obj) { //enhanced for loop
			System.out.println(o);
		}

	
	}

}
