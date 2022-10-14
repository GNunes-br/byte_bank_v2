package byte_bank_v2;

public class Admin extends Employee implements Auth {
	
	AuthUtil authUtil;
	
	public Admin() {
		authUtil = new AuthUtil();
	}

	@Override
	public double getBonus() {
		return 50;
	}
	
	@Override
	public void setPassword(int password) {
		this.authUtil.setPassword(password);
	}
	
	@Override
	public boolean auth(int password) {
		return this.authUtil.auth(password);
	}

}
