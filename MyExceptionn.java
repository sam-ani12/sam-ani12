package exception;

import java.util.Scanner;

public class MyExceptionn {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
			        System.out.println("Enter number: ");
			        int a =sc.nextInt();
			        if(a>100) {
			            System.out.println("fine");
			        }else {
			            try {
			                throw new MyException("enter value greater than 100");
			            } catch (Exception e) {
			                System.out.println(e.getMessage());
			            }
			        }
			        
			        
			    }

			 

			}

			 

			//custom exception  - user defined exception 
			//that is not previously avaivalble
			class MyException extends Exception {
			    public MyException() {

			  }

			 

			    MyException(String message) {
			        super(message);
			    }
			


}
