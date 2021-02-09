package collection_framework_demo_program;

public class Comparable_demo {
	public static void main(String[] args) {
		
		System.out.println("A".compareTo("Z"));   //return -ve
		System.out.println("Z".compareTo("K"));    // return +ve
		System.out.println("A".compareTo("A"));     //return 0
		//System.out.println("A".compareTo(null));    //return RE:-NPE
	}

}
