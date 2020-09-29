package data_structure_java_2020;

import java.util.Arrays;
import java.util.Scanner;

public class Binary_Search {
          
	public static void main(String[] args) 
	{
		Scanner dScanner=new Scanner(System.in);
	     System.out.println("Enter array size");
	     int size= dScanner.nextInt();
	     int[] arr= new int[size];
	     System.out.println("Enter elements into array");
	     for (int i = 0; i < arr.length; i++) {
			arr[i]=dScanner.nextInt();
		}
	      Arrays.sort(arr);
	      int li=0;
	      int hi=arr.length-1;
	      int mid=(li+hi)/2;
	      System.out.println("Enter element to be search");
	      int search=dScanner.nextInt();
	      while(li<=hi)
	      {
	    	  if(arr[mid]==search)
	    	  {
	    		  System.out.println("Element at "+mid+" index");
	    		  break;
	    	  }
	    	  else if(arr[mid]<search)
	    	  {
	    		  li=mid+1;
	    	  }
	    	  else {
				hi=mid-1;
			}
	    	  mid=(li+hi)/2;
	      }
	      if(li>hi)
	      {
	    	  System.out.println("Element can not be found");
	      }
	}

}
