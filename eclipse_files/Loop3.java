package ch19;

public class Loop3 {

	public static void main(String[] args) 
	{       int num=11,count=0;
         for(int x=1;x<=num;x++)
         {
        	 if(num%x==0)
        	 {
        		 count++;
        	 }
        	 
         }
         if(count==2)
         System.out.println(num+" prime number");
         int rev=0,temp=num;
         for(;temp>0;)
         {
        	 int rem=temp%10;
        	 rev=rev*10+rem;
        	 temp=temp/10;
         }
         if(num==rev)
         System.out.println(num+" is palindrome");
         
         System.out.println(num==rev&&count==2?num+" pal-prime":num+" not pal-prime");
          
	}

          

	}


