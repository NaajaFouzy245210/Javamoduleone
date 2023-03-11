package oopsday3.atm.menu;
import java.util.Scanner;

import oopsday3.atm.exceptions.InsufficientFundsException;
import oopsday3.atm.exceptions.NegativeAmountException;
public class BankMenu
{	
	BankofAmerica2 boa=new BankofAmerica2();
	
	public BankMenu()
	{
		Account a1 = new Account(101,"john doe","savings",500);	
		Account a2 = new Account(102,"jone doe","savings",700);	
		Account a3 = new Account(103,"joye doe","savings",800);	
		Account a4 = new Account(104,"johnn doe","savings",900);	
		Account a5 = new Account(105,"johno doe","savings",100);	
		
		boa.addAccount(a1);
		boa.addAccount(a2);
		boa.addAccount(a3);
		boa.addAccount(a4);
		boa.addAccount(a5);
	}
	public void menu() throws NegativeAmountException, InsufficientFundsException
	{
		Scanner scanner = new Scanner(System.in);
		int choice =0;
		loop: do
		{
			System.out.println("enter the choice 1 2 3 4 5");
			System.out.println("1. display account");
			System.out.println("2. deposit amount");
			System.out.println("3.withdraw amount");
			System.out.println("4.Display balance");
			System.out.println("5. Exit M E N U");
			
			choice=scanner.nextInt();
			switch(choice)
			{
			case 1:
			{
				System.out.println("enter actno");
				int actno =scanner.nextInt();
				boa.displayAccount(actno);
				break;
			}
		
			case 2:
			{
				System.out.println("enter actno");
				int actno =scanner.nextInt();
				System.out.println("enter amount to deposit");
				int amount = scanner.nextInt();
				
				
				double balance =boa.deposit(amount, actno);
				System.out.println(balance);
				break;
						
			}
			case 3:
			{
				System.out.println("enter actno");
				int actno=scanner.nextInt();
				System.out.println("enter amount");
				double amt=scanner.nextInt();
				double balance=0;
				try{
					double amount = 0;
					balance=boa.withdraw(amount, actno);
					
				}catch(InsufficientFundsException e) {
					e.printStackTrace();
				}
				System.out.println("balance ="+boa.withdraw(amt, actno));
				break;
			}
			case 4:
			{
				System.out.println("enter actno");
				int actno=scanner.nextInt();
				System.out.println("balance ="+boa.balanceEnquiry(actno));
				break;
			}
			case 5:
			{
				break loop;
			}
			}
		}while(choice!=5);
}
	
}
