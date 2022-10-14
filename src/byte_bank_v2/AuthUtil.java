package byte_bank_v2;

public class AuthUtil {
	
	private int password;
	
	public void setPassword(int password) {
		this.password = password;
	}
	
	public boolean auth(int password) {
		if(this.password == password) {
			return true;
		}
		
		return false;
	}
}
