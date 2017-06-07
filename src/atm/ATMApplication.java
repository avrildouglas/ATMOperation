//Author: Avril Douglas
//June 6th, 2017

package atm;

import java.util.ArrayList;
import java.util.Scanner;


/**public class ATM {
static Scanner keyboard = new Scanner(System.in);
static String acctNum, pwd, result;
static double oldBalance, newBalance, deposit, withdraw;
static int choose;*/

public class ATMApplication {
	//static
	static Scanner inputAcctInfo = new Scanner(System.in);
	static String numAccount;
	static int numPin;
	static String outcome;
		
	//Calls the ATM class
	ATM accATM = new ATM();
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//get user account number & pin number
		for (int chkAn = 0; chkAn < 3; chkAn++) {
		    System.out.println("Enter your account number: ");
		    numAccount = inputAcctInfo.nextLine();
		    System.out.println("Enter your four digit pin: ");
		    numPin = inputAcctInfo.nextInt();
		    outcome = 
		    		//validateAccount(numAccount, numPin);
		    if (!outcome.equals("The account info you entered is invalid.")) {
		        break;
		    //3 attempts allowed
		    } else if (chkAn == 2) {
		     System.out.println("You are only allowed 3 attempts!! Account locked!! Call technical support!!");
		        return;
		  }    
		    
	
	// Need to ADD OUTPUT results
		    
		    
		 //output
		 
	//	System.out.println("The User name  is: " + acc.getUserName());
	//	System.out.println("Account number is: " + acc.getAccNumber());
	//	System.out.println("Acount balance is: " + acc.getAccBalance());
 
	


			    }
		
		
		
	 
		 
		 
	}	 
	
}	 
		 
		 
	