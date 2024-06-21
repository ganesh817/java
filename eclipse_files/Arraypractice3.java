package ch19;

public class Arraypractice3 {

	public static void main(String[] args) 
	{
		int a[]=new int[] {1,2,3,4,5};
		int sum=0;
		for(int x=0;x<a.length;x++)
		{
			sum=sum+a[x];
		}
		System.out.println("sum is "+sum);
		
		for(int y=0;y<a.length;y++)
		{
			int print=sum/a[y];
			System.out.print(print+" ");
		}
		
		
	}

}
