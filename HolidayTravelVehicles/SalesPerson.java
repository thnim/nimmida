
public class SalesPerson {
	
	private int salesPersonID;
	private String salesPersonName;
	private String salesPersonPhoneNumber;
	
	public void salesPerson() {
		
	}
	
	public void salesPerson(int ID, String name, String phoneNumber) {
		this.salesPersonID = ID;
		this.salesPersonName = name;
		this.salesPersonPhoneNumber = phoneNumber;
	}
	
	public int getSalesPersonID() {
		return this.salesPersonID;
	}
	
	public String getSalesPersonName() {
		return this.salesPersonName;
	}
	
	public String getSalesPersonPhoneNumber() {
		return this.salesPersonPhoneNumber;
	}
	
	public String log() {
		return "ID: " + getSalesPersonID() + "\nName: " + getSalesPersonName() + "\nPhone Number: " + getSalesPersonPhoneNumber() + "\n";
	}
	
	
	
}
