package data_structure_java_2020;

import java.util.Scanner;



public class Bubble_Sort 
{
       public static void main(String[] args) 
       {
    	   System.out.print("Enter Array Size\n");
    	   @SuppressWarnings("resource")
		Scanner scan = new java.util.Scanner(System.in);
    	   int size = scan.nextInt();
    	   //int[] a = new int[size];
		  String[] a= new String[size];
		  int i,j,flag=0;
		  //int temp;
		  String temp;
		  System.out.print("Enter elements into array \n");
		  for ( i = 0; i < a.length; i++) 
		  {
			//a[i]= scan.nextInt();
			 a[i] =  scan .next();
		}
		  //String s1 = new String(scan.nextLine());
		 // String[] a= s1.split("");
		  
		  
		  for(i=0;i<a.length;i++)
		  {
			  for(j=0;j<a.length-1;j++)
			  {
				  //if(a[j]>a[j+1])
					  if(a[j].compareTo(a[j+1])>0)
				  {
					  temp= a[j];
					  a[j]=a[j+1];
					  a[j+1]=temp;
					  flag=1;
				  }
			  }
			  
			  if (flag==0) 
			  {
				break;
			}
		  }
		  
		  System.out.print("Elements after sorting\n");
		  for(i=0;i<a.length;i++)
		  {
			  System.out.println(a[i] +"");
		  }
		//  System.out.println();
	}
}
