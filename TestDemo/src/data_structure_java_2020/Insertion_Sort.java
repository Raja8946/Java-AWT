package data_structure_java_2020;

import java.util.Scanner;

public class Insertion_Sort 
{
     public static void main(String[] args) 
     {
	       @SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
	       System.out.print("Enter the array size\n");
	       int size= scanner.nextInt();
	       
	       int[] a= new int[size];
	       int temp,i,j;
	       System.out.print("Enter elements into array\n");
	       for(i=0;i<a.length;i++)
	       {
	    	   a[i]=scanner.nextInt();
	    	   
	       }
	       
	       for(i=1;i<a.length;i++)
	       {
	    	   temp=a[i];
	    	   j=i;
	    	   
	    	   while(j>0 && a[j-1]>temp)
	    	   {
	    		   a[j]=a[j-1];
	    		   j=j-1;
	    	   }
	    	   a[j]=temp;
	       }
	       System.out.print("Array afteer sorted\n");
	       for(i=0;i<a.length;i++)
	       {
	    	   System.out.println(a[i] +" ");
	       }
	       
	}
}
