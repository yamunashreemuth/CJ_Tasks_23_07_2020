package Package1;

import java.util.*;

public class CollectionMutable {

	public static void main(String[] args) {
		List<Integer> data = new LinkedList<>();
		data.add(6);
		data.add(95);
		data.add(253);
		
		Comparator<Integer> val = new Comparator<Integer>() { //anonymous class type
			public int compare(Integer a, Integer b) {
				if(a%10 > b%10) { //return a%10>b%10?1:-1 lambda expression
					return 1;
				}else {
					return -1;
				}
			}
		};
		
		Collections.sort(data, val); //sort based on last digit 
		//Collections.reverse(data);
		for(Integer i : data) {
		System.out.println(i);}
		
		//if(data.equals((Integer.parseInt(null, 6))))
		if(data.contains(6))
		{ 
			System.out.println("Equal");
		} else
			System.out.println(data.get(1)); 

	}

}
