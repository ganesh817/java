package ch19;

public class Arraymatrix {

	public static void main(String[] args)
	{
		int[] a[]=new int[][] {{1,2,3},{4,5,6},{7,8,9}};
		System.out.println(a.length);
		for(int x=0;x<a.length;x++)
		{
			int sum=0;
			for(int y=0;y<a.length;y++)
			{
				sum=sum+a[x][y];
				
				System.out.print(a[x][y]+" ");
			}
			System.out.println(sum);
				
		}
		System.out.println("after reverse");
		
		
		for(int x=0;x<a.length;x++)
		{
			for(int y=0;y<a.length;y++)
			{
				
			    
				System.out.print(a[y][x]+" ");
			}
			System.out.println();
				
		}
		System.out.println("after adding");
		
		for(int x=0;x<a.length;x++)
		{
			
			for(int y=0;y<a.length;y++)
			{
				
				
				System.out.print(a[x][y]+a[y][x]+" ");
			}
           System.out.println();
			
		}
		System.out.println("diagonal print :");
		
		for(int x=0;x<a.length;x++)
		{
			
			for(int y=0;y<a.length;y++)
			{
				if(a[x]==a[y])
				System.out.print(a[x][y]);
				else
					System.out.print("  ");
			}
			System.out.println();
				
		}
		System.out.println("diagonal :");
		for(int x=0;x<a.length;x++)
		{
			
			for(int y=0;y<a.length;y++)
			{
				if(x+y==a.length-1)
				System.out.print(a[x][y]);
				else
					System.out.print("  ");
			}
			System.out.println();
				
		}
		
		System.out.println("matrix diagonal :");
		
		
		for(int x=0;x<a.length;x++)
		{
			
			for(int y=0;y<a.length;y++)
			{
				if(x+y==a.length-1||x==y)
				System.out.print(a[x][y]+" ");
				else
					System.out.print("  ");
			}
			System.out.println();
				
		}
		System.out.println("max value :");
		for(int x=0;x<a.length;x++)
		{
			int max=Integer.MIN_VALUE;
			for(int y=0;y<a.length;y++)
			{
				if(a[x][y]>max)
				{
					max=a[x][y];
				}
				
				System.out.print(a[x][y]+" ");
				
					
					
			}
			System.out.println(max);
				
		}
		
		System.out.println("min value :");
		for(int x=0;x<a.length;x++)
		{
			int min=a[x][x];
			for(int y=0;y<a.length;y++)
			{
				if(a[x][y]<min)
				{
					min=a[x][y];
				}
				
				System.out.print(a[x][y]+" ");
				
					
					
			}
			System.out.println(min);
				
		}
		

	}

}
