package collection_framework_demo_program;

import java.util.Comparator;
import java.util.TreeSet;

class Employee implements Comparable<Object>
{
	String name;
	int eid;
	public Employee(String name,int eid) {
		// TODO Auto-generated constructor stub
		this.name=name;
		this.eid=eid;
	}
	public String toString()
	{
		return name+"--"+eid;
		
	}

	@Override
	public int compareTo(Object obj) {
		// TODO Auto-generated method stub
		int e1=this.eid;
		Employee employee= (Employee)obj;
		int e2=employee.eid;
		if(e1<e2)
		{
			return -1;
		}
		else if (e1>e2) {
			return +1;
		}
		else {
			
		
		
		return 0;
		
		}
	}
}


public class Comparable_Comparator_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee e1= new Employee("Raj", 100);
		Employee e2= new Employee("Smilee", 110);
		Employee e3= new Employee("Twinkle", 90);
		Employee e4= new Employee("Sonam", 120);
		Employee e5 = new Employee("Raj", 100);
		TreeSet<Object> treeSet= new TreeSet<Object>();
		treeSet.add(e1);
		treeSet.add(e2);
		treeSet.add(e3);
		treeSet.add(e4);
		treeSet.add(e5);
		System.out.println(treeSet);
		
		
		TreeSet<Object> treeSet1= new TreeSet<Object>(new mycomparator4());
		treeSet1.add(e1);
		treeSet1.add(e2);
		treeSet1.add(e3);
		treeSet1.add(e4);
		treeSet1.add(e5);
		System.out.println(treeSet1);
		
		
	}

}


class mycomparator4 implements Comparator<Object>
{

	@Override
	public int compare(Object obj1, Object obj2) {
		// TODO Auto-generated method stub
		Employee e1= (Employee)obj1;
		Employee e2 = (Employee)obj2;
		String s1= e1.name;
		String s2= e2.name;
		return s1.compareTo(s2);
		
	}
	
}