package data_structure_java_2020;

import java.util.Scanner;

public class Sample_string_taker 
{
    public static void main(String[] args) 
    {
	     System.out.print("Enter array size");
	     @SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
	     int size = scanner.nextInt();
	     String[] string = new String[size];
	     System.out.print("Enter elements into string");
	     for (int i = 0; i < size; i++) 
	     {
		       string[i]=scanner.next();	
		}
	     System.out.print("-----printing String------\n");
	     for (int i = 0; i < string.length; i++) 
	     {
		          System.out.print(string[i]+" ");	
		     /////////////////////////////////////////////
		}
	     
	}
}
