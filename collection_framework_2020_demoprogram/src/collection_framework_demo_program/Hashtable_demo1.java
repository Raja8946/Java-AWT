package collection_framework_demo_program;

import java.util.Hashtable;





public class Hashtable_demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hashtable<Object, Object> hashtable = new Hashtable<Object, Object>();
		hashtable.put(new temp1(5),"A");
		hashtable.put(new temp1(2),"B");
		hashtable.put(new temp1(6),"C");
		hashtable.put(new temp1(15),"D");
		hashtable.put(new temp1(23),"E");
		hashtable.put(new temp1(16),"F");
		System.out.println(hashtable);
		

	}

}
class temp1
{
	int i;
	public temp1(int i) {
		// TODO Auto-generated constructor stub
		this.i=i;
	}
	
	public int hashCode()
	{
		return i;
	}
	public String toString()
	{
		return i+"";
	}
}