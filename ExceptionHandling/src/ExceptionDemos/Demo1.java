package ExceptionDemos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner sc=new Scanner(System.in);
   try {
   int input1=sc.nextInt();
   int input2=sc.nextInt();
      }
   catch(InputMismatchException e)
   {
	   System.out.println("please enter only digits");
   }
//   try 
//   {
//	 System.out.println(input1/input2);  
//   }
//   catch(ArithmeticException e)
//   {
//	System.out.println("Do not divide by zero");   
//   }
//   catch(InputMismatchException e)
//   {
//	   System.out.println("please enter only digits");
//   }
	}

}

