package collection_framework_demo_program;

import java.util.Comparator;
import java.util.TreeSet;

public class Treeset_Demo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet<Object> treeSet = new TreeSet<Object>(new mycomparator5());
		treeSet.add("Sonam Raja");
		treeSet.add("Twinkle Keshri");
		treeSet.add("Sumit Anand");
		treeSet.add("Suman Kumar");
		System.out.println(treeSet);

	}

}

class mycomparator5 implements Comparator<Object>
{

	@Override
	public int compare(Object obj1, Object obj2) {
		// TODO Auto-generated method stub
		
		String s1= (String)obj1;
		String s2= (String)obj2;
		int l1= s1.length();
		int l2= s2.length();
		if(l1>l2)
		{
		
			return -1;
		}
		else if (l1<l2) {
			return +1;
			
		}
		else {
			return s1.compareTo(s2);
		}
		
	}
	
}
