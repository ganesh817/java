package ch19;

public class Practicearray1 {

	public static void main(String[] args) 
	{
		int a[]=new int[] {2,56,56,23,78,45,78,45,11,45,25,25,25,25,1,11,12,13};
		boolean b[]=new boolean[a.length];
		int count=1,sum=0;
		for(int x=0;x<a.length;x++)
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
			if(count>1)
			{
				System.out.println(a[x]);
				sum+=a[x];
			}
			
		}
		System.out.println(sum);
		
		

	}

}
