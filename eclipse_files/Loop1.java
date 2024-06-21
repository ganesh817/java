package ch19;

public class Loop1 {

	public static void main(String[] args) {
		  int num=14567,sum=0,pro=1;
          for(;num>0;num=num/10)
           {
             int rem=num%10;
            if(rem%2==0)
                {
                     System.out.println(rem+" is even ");
                     sum=sum+rem;
                 }
             
           else
                 {
                     System.out.println(rem+" is odd ");
                     pro=pro*rem;
                 }
               
           }
                  System.out.println("sum of the even numbers is "+sum);
                  System.out.println("Product of the odd numbers is "+pro);
	}

}
