package collection_framework_demo_program;

import java.util.LinkedList;
import java.util.ListIterator;

public class List_Iterator_demo {

	    public static void main(String[] args) 
	    {
		    LinkedList<Object> linkedList = new LinkedList<Object>();
		    linkedList.add("Raj");
		    linkedList.add("Smilee");
		    linkedList.add("Shail Di ");
		    linkedList.add("Rohan");
		    System.out.println(linkedList);
    
		    ListIterator<Object> listIterator = linkedList.listIterator();
		    while(listIterator.hasNext())
		    {
		    	String string = (String)listIterator.next();
		    	if(string.equals("Rohan"))
		    	{
		    		listIterator.remove();
		    	}
		    	else if (string.equals("Shail Di ")) 
		    	{
				   listIterator.add("Twinkle");	
				}
		    	else if (string.equals("Raj")) 
		    	{
				   listIterator.set("Sonam");	
				}
		    }
		    System.out.println(linkedList);
		    
		    while(listIterator.hasPrevious())
		    {
		    	String str1=(String)listIterator.previous();
		    	if (str1.equals("Sonam")) 
		    	{
				  listIterator.set("Raj");	
				}
		    }
		    System.out.println(linkedList);
	    }
}
