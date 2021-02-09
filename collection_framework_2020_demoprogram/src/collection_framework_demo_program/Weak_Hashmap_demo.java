package collection_framework_demo_program;

import java.util.HashMap;
import java.util.WeakHashMap;

public class Weak_Hashmap_demo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		temp t= new temp();
		//HashMap<Object, Object> map= new HashMap<Object, Object>();
		WeakHashMap<Object, Object> map= new WeakHashMap<Object, Object>();
		map.put(t, "Raj");
		System.out.println(map);
		t=null;
		System.gc();
		Thread.sleep(5000);
		System.out.println(map);
		

	}

}

class temp
{
	public String toString()
	{
		return "temp";
	}
	public void finalize()
	{
		System.out.println("Finalize method called");
	}
}