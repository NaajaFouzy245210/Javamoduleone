package oopsday2.atm;

public class BankofAmerica2 implements BankingIface2 {
	
	private Account[] accounts = new Account[5];
	private int accountIndex = 0;

	public BankofAmerica2() {

	}

	public BankofAmerica2(Account[] accounts) {

		this.accounts = accounts;
	}

	public Account[] getAccounts() {
		return accounts;
	}

	public void setAccounts(Account[] accounts) {
		this.accounts = accounts;
	}

	public void addAccount(Account account) {
		if (this.accountIndex < accounts.length)
			accounts[this.accountIndex++] = account;
		else
			System.out.println("operation not allowed");
	}

	public Account transactionAccount(Account account) {
		return account;
	}

	@Override
	public double withdraw(double amount, int actno) {
		// TODO Auto-generated method stub
		double temBal = 0;
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i].getActno() == actno) {
				temBal = accounts[i].getBalance();
				temBal -= amount;
				accounts[i].setBalance(temBal);
				break;
			}
		}
		return temBal;
	}

	@Override
	public double deposit(double amount, int actno) {
		// TODO Auto-generated method stub
		double temBal=0;
	     for(int i = 0; i< accounts.length; i++) {
	     if (accounts[i].getActno() == actno) {
		temBal = accounts[i].getBalance();
			temBal += amount;
			accounts[i].setBalance(temBal);
			break;
			
		}
	     }
	return temBal;
	}

	@Override
	public double balanceEnquiry(int actno) {
		// TODO Auto-generated method stub
		double temBal = 0;
		for(int i =0; i< accounts.length; i++)
		{
			if(accounts[i].getActno() == actno)
			{
				temBal = accounts[i].getBalance();
				break;
			}
		}
	
		

		return temBal;
	}
	
	public void displayAccount(int actno)
	{
		for(int i=0;i<accounts.length;i++)
		{
			if(accounts[i].getActno()==actno) {
			
				System.out.println(accounts[i].getActno());
				System.out.println(accounts[i].getName());
				System.out.println(accounts[i].getActType());
				System.out.println(accounts[i].getBalance());
				break;
				
			}
			}
		
	}
}
