package ch19;

public class Array5 {

	public static void main(String[] args) 
	{ int a[]=new int[] {1,56,42,12,5,64,8,7,54,4,7,6,2,5,8,15,19,22,25};
	 for(int x=0;x<=a.length-1;x++)
	 {
		 for(int y=x+1;y<=a.length-1;y++)
		 {
			 if(a[x]>a[y])
			 {
			 a[x]=a[x]^a[y];
			 a[y]=a[x]^a[y];
			 a[x]=a[x]^a[y];
			 }
		 }
		 System.out.println(a[x]);
	 }
		
	}

}
