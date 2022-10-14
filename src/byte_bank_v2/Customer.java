package byte_bank_v2;

public class Customer implements Auth {
	
	AuthUtil authUtil;
	
	public Customer() {
		authUtil = new AuthUtil();
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
