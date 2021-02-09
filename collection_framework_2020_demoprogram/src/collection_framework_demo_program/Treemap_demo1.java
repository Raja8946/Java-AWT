package collection_framework_demo_program;

import java.util.TreeMap;

public class Treemap_demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeMap<Object, Object> treeMap = new TreeMap<Object, Object>();
		treeMap.put(100, "ZZZ");
		treeMap.put(103, "XXX");
		treeMap.put(101, "AAA");
		treeMap.put(104, 106);
		//treeMap.put("XXX", "ZZZ");   //CCE
		//treeMap.put(null, "XXX");   //NPE
		System.out.println(treeMap);

	}

}
