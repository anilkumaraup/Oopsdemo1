package exceptiondemo;

import java.util.Scanner;

public class DivisionDemo {

	public static void main(String[] args) {
		
		double a, b, result;
        Scanner input = new Scanner(System.in);

         System.out.println("Input two integers :");
         a = input.nextDouble();
         b = input.nextDouble();
         
         try //statements to be monitored which may throw exceptionS
         {
        	 result = a / b ;
        	 System.out.println("Result = "+ result);
         }
         catch(ArithmeticException e) // Exception thrown is handled in catch block
         {
        	 System.out.println("Divided by Zero Error - Enter non-zero value");
        	 System.out.println("Exception Description :"+e.getMessage());
        	 System.out.println("Exception Name & description :"+e.toString());
        	 // Details about exception Name, Description, Line number of code which generated Exception
        	 e.printStackTrace();
         }
         finally // clean-up operations
         {
        	 input.close();
        	 System.out.println("In Finally Block-Program excecution ended");
         }
	}

}
