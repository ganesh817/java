package ch19;

public class Range3 {

	public static void main(String[] args) {
		for(int x=1;x<=5000;x++)
		{
			int num, temp, n1, n2, count = 0,n3 = 0;
	     
	      num=x;temp=num;

	           while (temp > 0) {
	         count++;
	         temp = temp / 10;
	      }

	      
	           
	          if (count % 2 == 0) {
	         temp = num;
	         
	                 n1 = temp % (int) Math.pow(10, count / 2);
	         
	                  n2 = temp / (int) Math.pow(10, count / 2);
	         
	                  n3 = (int) Math.pow((n1 + n2), 2);
	         if (num == n3)
	          {
	            
	          System.out.println(num+" is a Tech Number.");
	         }
	         else
	         {
	                        
	            System.out.println(num+" is not a Tech Number.");
	         }
	      }
	      else
	      {
	         
	                 System.out.println(num+" is not a Tech Number.");
	      }

		}

	}

}
