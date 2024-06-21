package ch19;

public class Array1 {

	public static void main(String[] args) 
	{
		int arr[]=new int[] {1,2,3,4,5,6,7,8,9};
		System.out.println("Size of an array is "+arr.length);
		

	for(int x=0;x<arr.length;x++)
	{
		System.out.println(arr[x]);
	}
    int sum=0;
    for(int x=arr.length-1;x>=0;x--)
    {
    	System.out.println(arr[x]);
    	sum=sum+arr[x];
    }
    System.out.println("sum is "+sum);
    
    System.out.println("----------------------------------------------");
    //copy from a to b
    int b[]=new int[arr.length];
    for(int x=0;x<arr.length;x++)
    {
    	b[x]=arr[x];
    	
    }
    for(int x=0;x<b.length;x++)
    {
    	System.out.println(b[x]);
    }
    System.out.println("-----------------------------------------------");
    for(int x=0,y=arr.length-1;x<=arr.length-1;x++,y--)
    {
    	b[x]=arr[y];
    	
    }
    for(int x=0;x<b.length;x++)
    {
    	System.out.println(b[x]);
    }
    System.out.println("------------------------------------------");
    System.out.println("--------------------------------------------------");
   
   
	}
	
}
