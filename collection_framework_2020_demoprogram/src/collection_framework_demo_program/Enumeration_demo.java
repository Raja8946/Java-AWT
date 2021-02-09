package collection_framework_demo_program;

import java.util.Enumeration;
import java.util.Vector;

public class Enumeration_demo {
	public static void main(String[] args) 
	{
	     Vector< Object> vector = new Vector<Object>();
	     for(int i=0;i<=10;i++)
	     {
	    	 vector.addElement(i);
	     }
	     System.out.println(vector);
	     
	     Enumeration<Object> enumeration = vector.elements();
	     while(enumeration.hasMoreElements())
	     {
	    	 Integer integer=(Integer)enumeration.nextElement();
	    	 if(integer%2==0)
	    	 {
	    		 System.out.println(integer);
	    	 }
	     }
	     System.out.println(vector);
	
	}

}
