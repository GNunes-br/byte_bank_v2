package byte_bank_v2;

public class TestingAccounts {
	
	public static void main(String[] args) {
		
		CheckingAccount checkingAccount = new CheckingAccount(111, 111);
		checkingAccount.deposit(100.00);
		
		SavingsAccount savingsAccount = new SavingsAccount(222, 222);
		savingsAccount.deposit(200.00);
		
		checkingAccount.transfer(10.00, savingsAccount);
		
		System.out.println("Saldo conta corrente = " + checkingAccount.getBalance());
		System.out.println("Saldo conta poupanca = " + savingsAccount.getBalance());
	}
}
 