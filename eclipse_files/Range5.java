package ch19;

public class Range5 {

	public static void main(String[] args) 
	{
		for(int x=1;x<=100;x++)
		{
		int num=x;
        int pro=num*num;
    
       int rem=pro%100;
       if(rem==num)
     System.out.println(num+"Automatic number");

		}
	}

}
