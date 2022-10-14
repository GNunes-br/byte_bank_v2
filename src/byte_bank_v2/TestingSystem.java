package byte_bank_v2;

public class TestingSystem {

	public static void main(String[] args) {
		
		Manager manager = new Manager();
		
		manager.setPassword(2222);
		
		Admin admin = new Admin();
		
		admin.setPassword(1324);
		
		InternalSystem system = new InternalSystem();
		
		system.auth(manager);
		
		system.auth(admin);
	}
}
