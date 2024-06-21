package ch19;

public class Range2 {

	public static void main(String[] args) {
		for(int x=1;x<=100;x++)
		{
		
		int num=x,sum=0,pro=1,temp=num;
        while(num>0)
         {
             int rem=num%10;
              sum=sum+rem;
              pro=pro*rem;
               num=num/10;
          }
           if(pro==sum)
          System.out.println(temp+" Power number");

		}
	}

}
