package ch19;

public class Array6 {

	public static void main(String[] args) 
	{
		int a[]=new int[] {10,20,30,40,50,60,70,80,90,100};
		int first=0,last=a.length-1,search=70,count=0;
		int mid;
		while(first<=last)
		{
			count++;
			mid=((first+last)/2);
				
			if(a[mid]<search)
				first=mid+1;
			else if(a[mid]==search)
			{
				System.out.println("element found at index "+(mid+1));
				
				break;
			}
			else 
			{
				last=mid-1;
			}
			
		}
		
		if(first>last)
		{
			System.out.println("element not found");
		}
		System.out.println("no of itterations : "+count);
	}

}
