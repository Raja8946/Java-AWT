package collection_framework_demo_program;

import java.util.LinkedList;

public class LinkedList_demo_1 {

	public static void main(String[] args) {
	
		LinkedList<Object> l1= new LinkedList<Object>();
		l1.add("Raj");
		l1.add(30);
		l1.add(null);
		l1.add("Raj");
		l1.set(0, "Smilee");
		l1.add(0, "Twinkle");
		l1.removeLast();
		l1.addFirst("Smilee");
        System.out.println(l1);
	}
}
