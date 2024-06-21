package ch19;

import java.util.Scanner;

public class Method1 {

	public static void main(String[] args) 
		{
			Name obj=new Name();
			obj.bank();
			Loan obj1=new Loan();
			obj1.amount();
			
		}

	}
	class Name
	{
		void bank()
		{
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your name");
		String word=s.nextLine();

		System.out.println("Enter your  bank name");
		String sen=s.nextLine();
		

		}
	}

class Loan{
	  void amount()
	  {
		  Scanner s=new Scanner(System.in);
		  System.out.println("Hii Ganesh");
		  System.out.println("Your loan amount is ");
		  double l=s.nextDouble();
		  System.out.println("Your discount is @10%");
		  
		  
		  
	  }
}


