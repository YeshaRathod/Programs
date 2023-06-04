package example_2;
import java.util.Scanner;
import java.io.*;

public class Atm {
	
	static double balance = 0;
	static final double min_balance= 1000 ;
	
	public static void main(String[] args)
	{
		try(Scanner scanner = new Scanner(System.in)){
			while(true) {
				System.out.println("1. Deposite");
				System.out.println("2. Withdraw");
				System.out.println("3. Check Balance");
				System.out.println("4. Exit");
				System.out.println("Enter Your Choice");
				int choice = scanner.nextInt();
				
				switch(choice) {
				case 1:
					System.out.println("Enter the amount which you want to deposite :");
					Double deposite_amount = scanner.nextDouble();
				    deposite(deposite_amount);
					break;
					
				case 2:
					System.out.println("Enter the amount which you want to withdraw :");
					int withdraw_amount = scanner.nextInt();
					withdraw(withdraw_amount);
					break;
					
				case 3:
					System.out.println("Your Current Balance :");
				
					break;
					
				case 4:
					System.out.println("Do you want to EXIT ?");
					break;
				
			    default:
			    	System.out.print("THANK YOU !!!");
				}
			}
		}
}				

	private static void deposite(Double amount) {
		// TODO Auto-generated method stub
		if(amount<=0) {
			System.out.println("Ivalid amount for deposite");
			return;
		}
		else {
			balance = balance + amount;
			System.out.println("Deposit of $" + amount + " successful.");
	        checkBalance();		
		}
	}

	private static void withdraw(int amount) {
		// TODO Auto-generated method stub
		if(amount<=0) {
			System.out.print("Invalid amount for withdraw ");
		    return;
		}
		if (balance- amount <=min_balance) {
			System.out.println("Insufficient funds. Minimum balance should be maintained.");
            return;			
		}
		 balance -= amount;
	        System.out.println("Withdrawal of $" + amount + " successful.");
	        checkBalance();
	}
	public static void checkBalance() {
        System.out.println("Current balance: $" + balance);
    }

	
}
