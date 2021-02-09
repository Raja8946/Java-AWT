package collection_framework_demo_program;

import java.util.Comparator;
import java.util.TreeMap;

public class Treemap_demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Object, Object> treeMap1 = new TreeMap<Object, Object>(new Mycomparator());
		treeMap1.put(100, "ZZZ");
		treeMap1.put(103, "XXX");
		treeMap1.put(101, "AAA");
		treeMap1.put(105, "CCC");
		treeMap1.put(102, "DDD");
		System.out.println(treeMap1);

	}

}

class Mycomparator implements Comparator<Object>
{

	@Override
	public int compare(Object obj1, Object obj2) {
		// TODO Auto-generated method stub
		Integer i1=(Integer)obj1;
		Integer i2=(Integer)obj2;
		return i2.compareTo(i1);
		
	}
	
}