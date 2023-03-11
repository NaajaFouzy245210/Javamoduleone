package oopsday2.atm;

public interface BankingI2 {

	public abstract double withdraw(double amount,int  actno);
	public abstract double deposit(double amount,int  actno);
	public abstract double balanceEnquiry(int  actno);
	
}
