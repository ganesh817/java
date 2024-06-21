package ch19;

public class Arrayfrequency {

	public static void main(String[] args) 
	{
		int[] a=new int[] {11,23,15,18,45,45,62,23,98,11,11,23,65,85,78,96,96};
		boolean b[]=new boolean[a.length];
		int count=1;
		for(int x=0;x<b.length;x++)
		{
			count=1;
			if(b[x]==true)
				continue;
			
			for(int y=x+1;y<a.length;y++)
			{
				if(a[x]==a[y])
				{
					count++;
					b[y]=true;
				}
			}
			/*
			 * if(count>1)
			 * 
			 * System.out.println(a[x]);
			 * 
			 * if(count==1) System.out.println(a[x]);
			 */
			
			System.out.println(a[x]+" "+count);
			
			
				
		}
		
	}

}
