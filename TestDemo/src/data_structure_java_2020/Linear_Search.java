package data_structure_java_2020;

import java.util.Scanner;

public class Linear_Search 
{
	public static void main(String[] args) 
	{
		
	
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter array size");
	int size= scanner.nextInt();
    int[] array = new int[size];
    
    System.out.println("Enter elements into array: ");
    for (int i = 0; i < array.length; i++) {
		array[i]=scanner.nextInt();
	}
    
    System.out.println("Enter the search element");
    int search=scanner.nextInt();
    int temp=0;
    for (int i = 0; i < array.length; i++) {
		if(array[i]==search)
		{
			System.out.println("Elemnt found at "+i+" Index of the array");
		      temp++;
		}
	}
    if (temp==0) 
    {
	System.out.println("Element is not present in the array");	
	}
}
}