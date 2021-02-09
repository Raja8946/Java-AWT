package collection_framework_demo_program;

import java.util.TreeSet;

public class Treeset_Demo1 {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet<Object> treeSet = new TreeSet<Object>();
		treeSet.add("A");
		treeSet.add("Z");
		treeSet.add("a");
		treeSet.add("L");
		//treeSet.add(new Integer(10));
		treeSet.add(null);
		System.out.println(treeSet);
		

	}

}
