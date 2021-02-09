package collection_framework_demo_program;

import java.util.Vector;

public class Vector_demo_1 {
	public static void main(String[] args) 
	{
	  //  Vector<Object> vector = new Vector<Object>();   
	  //  Vector<Object> vector = new Vector<Object>(25);
		Vector<Object> vector = new Vector<Object>(10,5);
	    System.out.println(vector.capacity());
	    for(int i=1;i<=10;i++)
	    {
	    	vector.addElement(i);
	    }
	    System.out.println(vector.capacity());
	    vector.addElement("A");
	    System.out.println(vector.capacity());
	    System.out.println(vector);
	}

}
