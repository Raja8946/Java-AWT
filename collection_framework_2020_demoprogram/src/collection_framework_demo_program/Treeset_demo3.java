package collection_framework_demo_program;

import java.util.Comparator;
import java.util.TreeSet;

public class Treeset_demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Object> treeSet= new TreeSet<Object>(new mycomparator());
		treeSet.add(10);
		treeSet.add(0);
		treeSet.add(15);
		treeSet.add(5);
		treeSet.add(20);
		treeSet.add(20);
		System.out.println(treeSet);
				

		
		
	}

}

class mycomparator implements Comparator<Object>
{

	@Override
	public int compare(Object obj1, Object obj2) {
		// TODO Auto-generated method stub
		Integer I1= (Integer)obj1;
		Integer I2=(Integer)obj2;
		if(I1<I2)
		{
			return +1;
		}
		else if(I1>I2)
		{
			return-1;
		}
		else {
			return 0;
		}
		
		
	}
	
}



/*
class mycomparator implements Comparator<Object>
{

	@Override
	public int compare(Object obj1, Object obj2) {
		// TODO Auto-generated method stub
		Integer I1= (Integer)obj1;
		Integer I2=(Integer)obj2;
		return I1.compareTo(I2);    //Ascending Order
		//return -I1.compareTo(I2);     //Descending Order
	//	return I2.compareTo(I1);      //Descending Order
	//	return -I2.compareTo(I1);      //Ascending order
		//return +1;     //Insertion Order
		//return -1;     //Reverse of insertion Order
		//return 0;    // Only first inserted element 
	}
	
}
*/