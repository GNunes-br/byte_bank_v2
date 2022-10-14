package byte_bank_v2;

public abstract class Employee {
	
	private String name;
	private String document;
	private double remuneration;
	
	public Employee() {
		
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getDocument() {
		return document;
	}
	
	public void setDocument(String document) {
		this.document = document;
	}
	
	public double getRemuneration() {
		return remuneration;
	}
	
	public void setRemuneration(double remuneration) {
		this.remuneration = remuneration;
	}
	
	public abstract double getBonus();
}
