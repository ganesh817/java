package ch19;

class Method {//first class

	public static void main(String[] args)
	{
		Student obj=new Student();//method declaration
		obj.rev();//method call
	}
}
class Student//2nd class 
	{
		
		void rev()//method implementation
		{
		
		int num=1756,rev=0,temp=num;
		
		
		while(num>0)
		{
			int rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		System.out.println("Reverse number is "+rev);
	   temp=rev;
	   for(;temp>0;temp/=10)
	   {
		 int rem=temp%10;
		
		 switch(rem)
		 {
		 case 1:
			 System.out.print("I ");
			 break;
		 case 2	:
			 System.out.print("II ");
			 break;
		 case 3:
			 System.out.print("III ");
			 break;
		 case 4:
			 System.out.print("IV ");
			 break;
		 case 5:
			 System.out.print("V ");
			 break;
		 case 6:
			 System.out.print("VI ");
			 break;
		 case 7:
			 System.out.print("VII ");
			 break;
		 }
	   }
	}	   
}
	   
		
		
	
