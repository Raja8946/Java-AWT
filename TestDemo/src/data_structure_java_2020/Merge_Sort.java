package data_structure_java_2020;



public class Merge_Sort 
{
 
int[] array;
  int[] temparr;
  int length;
  public static void main(String[] args) 
  {
	 int[] inputarray= {48,52,19,64,27,14};
	 Merge_Sort ms=new Merge_Sort();
	ms.sort(inputarray);
	System.out.print("The array after sorted is \n");
	for(int j=0;j<inputarray.length;j++)
	{
		System.out.println(inputarray[j]);
	}
	 
  }
  
  public void sort(int inputarray[]) 
  {
	  this.array=inputarray;
	  this.length=inputarray.length;
	  this.temparr=new int[length];
	  dividearr(0, length-1);
	  
  }
	 public void dividearr(int lowerindex, int higherindex) 
	 {
		 if(lowerindex<higherindex)
		 {
	      int middle= lowerindex+(higherindex-lowerindex)/2;
	      dividearr(lowerindex, middle);
	      dividearr(middle+1, higherindex);
	      mergearray(lowerindex,middle,higherindex);
		 }
	}
	 
	 public void mergearray(int lowerindex, int middle,int higherindex) 
	 {
		
	    for(int i=lowerindex;i<=higherindex;i++)
	    {
	    	temparr[i]=array[i];
	    } 
	    /// Merge Sort method-----
	    int i= lowerindex;
		 int j= middle+1;
		 int k= lowerindex;
	    
	    while (i<=middle && j<=higherindex) 
	    {
		     if(temparr[i]<=temparr[j])
		     {
		    	 array[k]= temparr[i];
		    	 i++;
		     }
		     else {
				array[k]= temparr[j];
				j++;
			}
		     k++;
		     
		}
	    while (i<=middle) 
	    {
		  array[k]=temparr[i];
		  k++;
		  i++;
		}
	}
	 
	 
}

