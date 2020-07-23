package Package1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.*;
public class CollectionMap {

	public static void main(String[] args) {
		
		Map map = new HashMap(); //Hashmap isn't synchronized whereas hash table is synchronized 
		map.put(2, 567);
		map.put("lang", "Java");
		
		//finding the key values
		System.out.println(map.get("lang"));
		
		  HashMap<Integer, String> list = new HashMap<Integer, String>(map);
		  System.out.println("Copy of map : "+ list);
		  System.out.println("value of copy key is " +list.get("lang"));
		
		TreeMap<Integer, String> tmap = new TreeMap<Integer, String>(); //defined type
		tmap.put(52, "Animal");
		tmap.put(63, "data");
		//traversing through hash map
		for(Map.Entry<Integer, String> e : tmap.entrySet())
		{
			System.out.println(e.getKey()+ " " +e.getValue());
		}
		
		System.out.println("value for key 63 is: " +tmap.get(63));
		Set<Integer> keyy = tmap.keySet(); //executing by set
		
		for(Integer ky : keyy) { //enhanced for loop
			System.out.println("Key: "+ky + " " + "Value: " + tmap.get(ky));
		}
		
	HashMap hs = new HashMap(); //no specific type
	hs.put(new String(), "Spring");
	hs.put(new Integer(7), "8523");
	hs.put("keyval", 46);
	
	System.out.println(hs.get("keyval"));
	
	if(hs.containsKey(7)) {
		System.out.println("key present");
	}else {
		System.out.println("key not found");
	}	
	
	
	}
}
