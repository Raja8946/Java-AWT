package data_structure_java_2020;

import java.util.Scanner;

public class Selection_Sort 
{
    public static void main(String[] args) 
    {
	     @SuppressWarnings("resource")
		Scanner scanner= new Scanner(System.in);
	     System.out.print("Enter the array size\n");
	     int size= scanner.nextInt();
	     //int min,temp=0;
	     //int[] array=new int[size];
	     int min;
	     String temp="";
	     String[] array= new String[size];
	     int i,j;
	     System.out.print("Enter elements into arraay\n");
	     for(i=0;i<array.length;i++)
	     {
	    	// array[i]=scanner.nextInt();
	    	 array[i]= scanner.next();
	     }
	     for(i=0;i<array.length;i++)
	     {
	    	 min=i;
	    	 for(j=i+1;j<array.length;j++)
	    	 {
	    		// if(array[j]<array[min])
	    		 if(array[j].compareTo(array[min])<0)
	    		 {
	    			 min=j;
	    		 }
	    	 }
	    	 temp=array[i];
	    	 array[i]=array[min];
	    	 array[min]=temp;
	     }
	     System.out.print("Array after sorting\n");
	     for(i=0;i<array.length;i++)
	     {
	    	 System.out.println(array[i] +" ");
	     }
	}
}
