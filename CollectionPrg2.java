package Package1;

import java.util.*;
import java.util.Map.Entry;

class Contact{
	String name;
	int age;
	String gender;
	List<Address> address;
	
	public Contact(String name, int age, String gender, List<Address> address) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.address = address;
	}
	@Override
	public String toString() {
		return "Contact [name= " + name + ", age= " + age + ", gender= " + gender + ", Address= " + address + "]" ;
	}
	
	
}

class Address {
	String street;
	int Aptno;
	String city;
	String state;
	int zipcode;
	
 public Address(String street,int Aptno, String city,String state,int zipcode){
	this.street = street;
	this.Aptno = Aptno;
	this.city = city;
	this.state = state;
	this.zipcode = zipcode;
	}


@Override
public String toString() {
	return "Address [street=" + street + ", Aptno=" + Aptno + ", city=" + city + ", state=" + state + ", zipcode="
			+ zipcode + "]";
}

	
}

public class CollectionPrg2 {

	

	public static void main(String[] args) {
		
		List<Address> addr = new ArrayList<Address>();
		addr.add(new Address("New lane", 2000, "Rochester", "MI", 48305));
		addr.add(new Address("Squrile rd", 45, "Arbun", "MI", 48805));
		
		
		
		Address aobj = new Address("New lane", 2000, "Rochester", "MI", 48305);
		Address aobj1 = new Address("Squrile rd", 45, "Arbun", "MI", 48806);
		
		List<Address> address = new ArrayList<Address>();
		address.add(aobj);
		address.add(aobj1);
		
		
		ArrayList<Contact> cont = new ArrayList<Contact>();
		cont.add(new Contact("Shree", 15, "Female", address));
		cont.add(new Contact("Mute", 25, "Male", address));
	//	System.out.println(cont);
		
		Contact cobj = new Contact("Shree", 15, "Female", address);
		Contact cobj1 = new Contact("Mute", 25, "Male", address);
		ArrayList<Contact> contdet = new ArrayList<Contact>();
		contdet.add(cobj);
		contdet.add(cobj1);
		
		HashMap<Integer, Object> lmap = new HashMap<>();
		lmap.put(cobj.age, address.get(0));
		lmap.put(cobj1.age, address.get(1));
		// Map<String,String> map = combineListsIntoOrderedMap (contdet, address);
		
		for(Entry<Integer, Object> ej : lmap.entrySet())
		{
			System.out.println("I use age as key: "+ej.getKey()+ " " +"address as value: " + ej.getValue());
		}

		
	/*	List<Object> details = new ArrayList<Object>();
		details.add("Myname");
		details.add(Integer.valueOf(25));e
		details.add("Female");
		details.addAll(addr);
		
		Object retrievedObject = details.get(1);
		System.out.println(retrievedObject); */
		
		System.out.println();
		
		
	}
	

}
