package ch19;
import java.util.*;

public class Array2 {

	public static void main(String[] args)
	{
		int a[]=new int[5];
		int max=Integer.MIN_VALUE;
		System.out.println(max);
		Random s=new Random();
		System.out.println("Enter the array elements");
		for(int x=0;x<=a.length-1;x++)
		{
			a[x]=s.nextInt(1,100);
		}
	      for(int x=0;x<a.length;x++)
		    {
	    	  System.out.println(a[x]);
			     if(max<a[x])
			     {
			    	 max=a[x];
			     }
             
	        }
	      System.out.println("Max value is "+max);
		
	//	for(int temp:a)
	//	{
	//		System.out.println(temp);
	      
	//	}
	      System.out.println("----------------------------------");
	      int min=Integer.MAX_VALUE;
	      System.out.println(min);
	      Random n=new Random();
			System.out.println("Enter the array elements");
			for(int x=0;x<=a.length-1;x++)
			{
				a[x]=n.nextInt(1,100);
			}
		      for(int x=0;x<a.length;x++)
			    {
		    	  System.out.println(a[x]);
				     if(min>a[x])
				     {
				    	 min=a[x];
				     }
	             
		        }
		      System.out.println("Min value is "+min);
		      
		      
		      System.out.println("------------------------------------------");
			
		
		
	}

}
