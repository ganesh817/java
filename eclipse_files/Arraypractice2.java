package ch19;

 class Arraypractice2 {

	public static void main(String[] args) 
	{
		int a[]=new int[] {10,20,30,40,50};
		for(int t:a)
		{
			System.out.println(t);
		}
		int r=50;
		System.out.println("after removing "+r);
		for(int x=0;x<=a.length-1;x++)
		{
			if(a[x]==r)
				a[x]=0;
			 if(a[x]==0&&x<a.length-1)
			 {
				 int temp=a[x];
				 a[x]=a[x+1];
				 a[x+1]=temp;
			 }
		}
		for(int temp:a)
			System.out.println(temp);
		
		
	}

}
