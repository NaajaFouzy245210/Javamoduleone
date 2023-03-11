package oopsday2.atm;

public class BankTransaction2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Account a1 = new Account(101,"john doe","savings",500);	
	Account a2 = new Account(102,"jone doe","savings",700);	
	Account a3 = new Account(103,"joy doe","savings",800);	
	Account a4 = new Account(104,"johnn doe","savings",900);	
	Account a5 = new Account(105,"johno doe","savings",100);	
	
	BankofAmerica2 boa= new BankofAmerica2();
	boa.addAccount(a1);
	boa.addAccount(a2);
	boa.addAccount(a3);
	boa.addAccount(a4);
	boa.addAccount(a5);
	
	System.out.println(boa.balanceEnquiry(103));
	double result = boa.deposit(100,103);	
	System.out.println(result);
	result= boa.withdraw(50,103);
	System.out.println(result);
		
		
	}

}