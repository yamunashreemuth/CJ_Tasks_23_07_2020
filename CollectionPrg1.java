package Package1;

import java.util.*;

public class CollectionPrg1 {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("Name: Adele");
		list.add("Age: 25");
		list.add("Gender: Female");
		list.add("Contact no: 1230005748");
		list.add("Address: 74 North Street, MI 48309");
		
		Iterator<String> itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
			List<Integer> lst = new LinkedList<>();	
			lst.add(1);
			lst.add(2);
			lst.add(3);
			lst.add(4);
			lst.add(5);
			
			HashMap<List<Integer>, List<String>> hs = new HashMap<>();
			hs.put(lst, list);
			for(Map.Entry<List<Integer>, List<String>> ent: hs.entrySet()) {
				//System.out.println("The Key is " + ent.getKey()+" "+ "& the value is "+ent.getValue() );
			}
			
	}

}
