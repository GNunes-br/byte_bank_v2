package byte_bank_v2;

public class Manager extends Employee implements Auth {	
	
	AuthUtil authUtil;
	
	public Manager() {
		authUtil = new AuthUtil();
	}
	
	@Override
	public double getBonus() {
		return super.getRemuneration();
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
