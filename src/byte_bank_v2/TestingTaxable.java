package byte_bank_v2;

public class TestingTaxable {
	
	public static void main(String[] args) {
		
		CheckingAccount checkingAccount = new CheckingAccount(222, 333);
		checkingAccount.deposit(100.0);
		
		LifeInsurance lifeInsurance = new LifeInsurance();
		
		TaxCalculator taxCalculator = new TaxCalculator();
		
		taxCalculator.register(checkingAccount);
		taxCalculator.register(lifeInsurance);

		System.out.println(taxCalculator.getTaxSum());
	}
}
