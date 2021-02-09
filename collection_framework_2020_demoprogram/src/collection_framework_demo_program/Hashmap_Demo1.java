package collection_framework_demo_program;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Hashmap_Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Object, Object> mHashMap = new HashMap<Object, Object>();
		mHashMap.put("Chiranjeevi", 700);
		mHashMap.put("Raj", 800);
		mHashMap.put("Smilee", 200);
		mHashMap.put("Sumit", 500);
		System.out.println(mHashMap);
		System.out.println(mHashMap.put("Raj", 1000));
		System.out.println(mHashMap);
		Set<Object> set= mHashMap.keySet();
		System.out.println(set);
		Collection<Object> collection= mHashMap.values();
		System.out.println(collection);
		Set<Entry<Object, Object>> s1 = mHashMap.entrySet();
		System.out.println(s1);
		Iterator<Entry<Object, Object>> iterator=s1.iterator();
		while (iterator.hasNext()) {
			Map.Entry m1= (Map.Entry)iterator.next();
			System.out.println(m1.getKey()+"--"+m1.getValue());
			if(m1.getKey().equals("Raj"))
					{
						m1.setValue(10000);
					}
		}
		System.out.println(mHashMap);

	}

}
