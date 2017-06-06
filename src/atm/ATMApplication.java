//Author: Avril Douglas
//June 6th, 2017

package atm;

import java.util.ArrayList;
import java.util.Scanner;

public class ATMApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Calls the ATM class
		ATM accATM = new ATM();
		
	     int numAccount;
	     int numPin;
	     boolean valid = false;
	     
	     //get user account number & pin number
	     do{
 
	    	 System.out.println("Enter your account number: ");
	    	 Scanner inputNumAcct = new Scanner(System.in); 
	    	 numAccount = inputNumAcct.nextInt();
	    	 if (numAccount == accATM.{ 
	    		valid = true;
	    	 else
	    		 valid = false
	     }while (valid = false);

	     do{
	    	 
	     Scanner inputNumPin = new Scanner(System.in);  
		 System.out.println("Enter your pin number: ");
		 numPin = inputNumPin.nextInt();
	   	 if (numPin) == get
		    		valid = true
		    	 else
		    		 valid = false
		     }while (valid = false);
		 //output
		 
		System.out.println("The User name  is: " + acc.getUserName());
		System.out.println("Account number is: " + acc.getAccNumber());
		System.out.println("Acount balance is: " + acc.getAccBalance());
 
	
	 
		 
		 
	}	 
	
}	 
		 
		 
	