package atm;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class ATM {
	
	ATMApplication accATMApp = new ATMApplication();
	
	Account accAccount = new Account();
	static double oldBalance, newBalance, deposit, withdraw,
	static amtCurrBal;

	static double oldBalance, newBalance, deposit, withdraw;
	//static int choose;
	static int accI=0;

	public static String validateAccount(String accNum, int pinNum) {
		
		String msgResult = "The account info you entered is invalid.";
		
		//declare arrays
		String accNumber[] = {"059271-10", "078432-11", "093647-12"};
		int pinNumber[] = {4011, 2810, 9764};
		
		for(accI=0; accI < accNumber.length; accI++){
			String resultAcc = accNumber[accI];
		    int resultPin = pinNumber[accI];
		    if (accNum == resultAcc && pinNum == resultPin) {
		        msgResult = " ";
		  //  } else{
		   // 	msgResult = "The account info you entered is invalid"; 
		       } 
			}
		return msgResult;
	}
	
	public static void makeDeposit() {
		double amtDeposit;
		
		Scanner inputDeposit = new Scanner(System.in);
		System.out.println("Enter the deposit amount:");
		amtDeposit = inputDeposit.nextDouble();
		System.out.println("You have deposited: " + amtDeposit);
		amtCurrBal += amtDeposit;
		System.out.println("Your account balance is: " + amtCurrBal);
	}
	
	public static void makeWithdrawal() {
		double amtWithdrawal;
		
	   Scanner inputWithdrawal = new Scanner(System.in);
	   System.out.println("Enter the withdrawal amount: ");
	   amtWithdrawal = inputWithdrawal.nextDouble();
	   System.out.println("Your withdrawal amount: " + amtWithdrawal);
	   amtcurrBal -= amtWithdrawal;
	   System.out.println("Your new balance is: " + amtAfterWithdraw);
	}
	
	public static double showBalance() {
		double prevBalance;
	    System.out.println("Your current balance is: $" + CurrBalance);
	    prevBalance = 0.00;
	    return 1;
	}
		
	
	//NEED TO ADD DEPPOSITS, WITHDRAWALS, BALANCE, OTHER TRANSACTION
	/**	public static int Deposits (double accDeposit) {
		NumberFormat percent = NumberFormat.getPercentInstance();
		percent.setMaximumFractionDigits(2);
		String majorityString = percent.format(majority);
		return accDeposit; */
}


