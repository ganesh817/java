package ch19;

public class Twinprime {

	public static void main(String[] args) 
	{
		int a=17,b=19,counta=0,countb=0,x=1,y=1;
		while(x<=a)
		{
			if(a%x==0)
				counta++;
			     x++;
		}
        while(y<=b)
        {
        	if(b%y==0)
        		countb++;
        	    y++;
        }
        if(counta==2&&countb==2)
        	System.out.println(a+" and "+b+" are Prime numbers");
        if(b-a==2)
        	System.out.println("Twin primes");
	}

}
