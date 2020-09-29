package data_structure_java_2020;

import java.util.Scanner;

public class Linera_Search {

	public static void main(String[] args) 
	{
		Scanner scanner= new Scanner(System.in);
	    System.out.println("Enter array size");
	    int size=scanner.nextInt();
	    int[] arr=new int[size];
	    System.out.println("Enter elements into array");
	    for (int i = 0; i < arr.length; i++) {
			arr[i]=scanner.nextInt();
		}
	    System.out.println("Enetr the elements to be search");
	    int search=scanner.nextInt();
	    int temp=0;
	    for(int i=0;i<arr.length;i++)
	    {
	    	if(arr[i]==search)
	    	{
	    		System.out.println("Element present at "+i+" Index");
	    		temp=temp+1;
	    		break;
	    	}
	    }
	    if(temp==0)
	    {
	    	System.out.println("Element cannot be found");
	    }
	    
	}
}
