package ch19;
import java.util.Scanner;
public class Loop {

	
		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        
		        System.out.print("Enter the base (m): ");
		        int number = scanner.nextInt();
		        
		        
		        System.out.print("Enter the exponent (n): ");
		        int power = scanner.nextInt();
		        
		               int result = 1;
		        
		        
		        for (int i = 0; i < power;i++)//0<3 1<3 2<3 3<3
		        {
		            result =result* number;// 1*2=2 2*2=4 4*2
		        }
		        
		                System.out.println(number + "^" + power + " = " + result);
		    }
		


	}


