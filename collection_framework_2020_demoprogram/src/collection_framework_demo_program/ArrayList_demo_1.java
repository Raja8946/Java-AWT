package collection_framework_demo_program;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.RandomAccess;
/*
public class ArrayList_demo_1 {
	public static void main(String[] args) {
	
		ArrayList<Object> list = new ArrayList<Object>();
		list.add("A");
		list.add(10);
		list.add("A");
		list.add(null);
		System.out.println(list);
		list.remove(2);
		list.add(2, "M");
		list.add("N");
		list.set(3, "P");
		list.add("A");
		list.add("A");
		System.out.println(list.indexOf("A"));
		System.out.println(list.lastIndexOf("A"));
		System.out.println(list);
		System.out.println(list.get(5));
		System.out.println(list.listIterator());
		System.out.println(list.listIterator(0));
		System.out.println(list.iterator());

	}

}
*/




public class ArrayList_demo_1
{
	public static void main(String[] args) {
		
		ArrayList<Object> l1= new ArrayList<Object>();
		LinkedList<Object> l2= new LinkedList<Object>();
		System.out.println(l1 instanceof Serializable);
		System.out.println(l2 instanceof Serializable);
		System.out.println(l1 instanceof Cloneable);
		System.out.println(l2 instanceof Cloneable);
		System.out.println(l1 instanceof RandomAccess);
		System.out.println(l2 instanceof RandomAccess);
	}
}
