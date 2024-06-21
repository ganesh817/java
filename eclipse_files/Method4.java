package ch19;
import java.util.Arrays;

public class Method4 {

	public static void main(String[] args)
	{
		int[] a=new int[] {1,23,6,4,67,56,35,12,11};
		  
		Arrays.sort(a);
		for(int temp:a)
			System.out.print(temp+" ");
		
		
			int search=35,count=0,first=0,last=a.length,mid;
			while(first<=last)
			{
				count++;
				mid=first+last/2;
				if(a[mid]<search)
					first=mid+1;
				else if(a[mid]==search)
				{
					System.out.println("element found at "+(mid+1));
					break;
				}
				else
					last=mid-1;
				
			}
			if(first>last)
				System.out.println("element not found ");
			System.out.println("no of iterations : "+count);
				
		
		
	}
}














