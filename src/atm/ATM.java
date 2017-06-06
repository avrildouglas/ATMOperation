package atm;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class ATM {
	
	ATMApplication accATMApp = new ATMApplication();
	
	Account accAccount = new Account();
	
	ArrayList<Integer> accNumber = new ArrayList<Integer>();
	ArrayList<Integer> pinNumber = new ArrayList<Integer>();
   
	int accI=0;


	public static boolean[] validateAccAccount(int accnumber) {
		NumberFormat percent = NumberFormat.getPercentInstance();
		percent.setMaximumFractionDigits(2);
		String majorityString = percent.format(majority);
		return majorityString;
	}
	public static boolean[] validateAccPin(int accpin) {
		NumberFormat percent = NumberFormat.getPercentInstance();
		percent.setMaximumFractionDigits(2);
		String majorityString = percent.format(majority);
		return majorityString;
	}
	
	public static int Deposits. (int accDeposit) {
		NumberFormat percent = NumberFormat.getPercentInstance();
		percent.setMaximumFractionDigits(2);
		String majorityString = percent.format(majority);
		return majorityString;
	}
	
	public static int Withdrawals(int accDeposit) {
		NumberFormat percent = NumberFormat.getPercentInstance();
		percent.setMaximumFractionDigits(2);
		String majorityString = percent.format(majority);
		return majorityString;
	}


}
