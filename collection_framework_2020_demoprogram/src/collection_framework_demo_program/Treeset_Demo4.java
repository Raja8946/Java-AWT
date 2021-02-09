package collection_framework_demo_program;

import java.util.Comparator;
import java.util.TreeSet;

public class Treeset_Demo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet<Object> treeSet= new TreeSet<Object>(new mycomparator2());
		treeSet.add("Raj");
		treeSet.add("Smilee");
		treeSet.add("Sonam");
		treeSet.add("Twinkle");
		System.out.println(treeSet);

	}

}

class mycomparator2 implements Comparator<Object>
{

	@Override
	public int compare(Object obj1, Object obj2) {
		// TODO Auto-generated method stub
		
		String s1=(String)obj1;
		String s2=(String)obj2;
		return -s1.compareTo(s2);
		//return s2.compareTo(s1);
		
	}
	
}
