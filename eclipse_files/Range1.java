package ch19;

public class Range1 {

	public static void main(String[] args) {
		   for(int x=1;x<=100;x++) 
		   {
			   int start=x,temp=x,sum=0;          
		       int pow=(int)Math.pow(start,2);
		       while(pow>0) 
		        { 
		            int rem=pow%10;
		               sum=sum+rem;
		               pow=pow/10;
		         }
		              if(sum==temp)
		              System.out.println(temp+" Evil number");
		              
		        
		              
		   }

		
	}

	}
