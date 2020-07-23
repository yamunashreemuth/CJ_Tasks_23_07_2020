package Package1;
import java.util.*;

//using comparable interface in collection
class Empl implements Comparable<Empl>{
	int empid, salary;
	String name;
	Empl(int empid, String name, int salary){
		super();
		this.empid = empid;
		this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Empl [empid=" + empid + ", salary=" + salary + ", name=" + name + "]";
	}
	@Override
	public int compareTo(Empl o) {
		if(empid > o.empid) {
		return 1;} else {return -1;}
	}
	
	
}

public class CollectionComparable {

	public static void main(String[] args) {
		List<Empl> emp = new LinkedList<Empl>();
		emp.add(new Empl(120, "John", 2000));
		emp.add(new Empl(106, "Larry", 5000));
		emp.add(new Empl(224, "Peter", 2600));
		
		Collections.sort(emp); //emp,(i,j)->i.salary>j.salary?1:-1 //override by using comparator object from comparable
		
		for(Empl e : emp) {
			System.out.println(e);
		}
	}

}
