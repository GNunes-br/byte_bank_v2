package byte_bank_v2;

public abstract interface Auth {
	
	public abstract void setPassword(int password);
		
	public abstract boolean auth(int password);
}
