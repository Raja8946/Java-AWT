package collection_framework_demo_program;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Cursor_class_demo {
	
	  public static void main(String[] args) 
	  {
		  Vector<Object > vector = new Vector<Object>();
		  Enumeration<Object> enumeration = vector.elements();
		  System.out.println(enumeration.getClass().getName());
		  ArrayList<Object> arrayList = new ArrayList<Object>();
		  Iterator<Object> iterator = arrayList.iterator();
		  System.out.println(iterator.getClass().getName());
		  ListIterator<Object>listIterator = arrayList.listIterator();
		  System.out.println(listIterator.getClass().getName());
	}

}
