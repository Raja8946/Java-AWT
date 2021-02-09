package collection_framework_demo_program;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterator_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Object> arrayList = new ArrayList<Object>();
		for(int i=0;i<=10;i++)
		{
			arrayList.add(i);
		}
		System.out.println(arrayList);
		
		Iterator<Object> iterator = arrayList.iterator();
		while(iterator.hasNext())
		{
			Integer integer = (Integer)iterator.next();
			if(integer%2==0)
			{
				System.out.println(integer);
			}
			else {
				  iterator.remove();
			}
		}
		System.out.println(arrayList);

	}

}
