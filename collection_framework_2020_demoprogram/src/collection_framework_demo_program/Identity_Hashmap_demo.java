package collection_framework_demo_program;

import java.util.HashMap;
import java.util.IdentityHashMap;

public class Identity_Hashmap_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IdentityHashMap<Object, Object> map = new IdentityHashMap<Object, Object>();
		//HashMap<Object, Object> map= new HashMap<Object, Object>();
		@SuppressWarnings("deprecation")
		Integer i1= new Integer(10);
		@SuppressWarnings("deprecation")
		Integer i2= new Integer(10);
		map.put(i1, "Raj");
		map.put(i2, "Smilee");
		System.out.println(map);

	}

}
