package collection_framework_demo_program;

import java.util.Comparator;
import java.util.TreeSet;

public class Treeset_Demo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet<Object> treeSet = new TreeSet<Object>(new mycomparator3());
		treeSet.add("A");
		treeSet.add(new StringBuffer("ABC"));
		treeSet.add(new StringBuffer("AA"));
		treeSet.add("XX");
		treeSet.add("ABCD");
		treeSet.add("A");
		System.out.println(treeSet);

	}

}

class mycomparator3 implements Comparator<Object>
{

	@Override
	public int compare(Object obj1, Object obj2) {
		// TODO Auto-generated method stub
		String s1= obj1.toString();
		String s2= obj2.toString();
		int l1=s1.length();
		int l2=s2.length();
		if(l1<l2)
		{
			return -1;
		}
		else if (l1>l2) {
			return +1;
		}
		else {
			return s1.compareTo(s2);
		}
		
	}
	
}