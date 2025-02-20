
public class Customer {
	private int customerID;
	private String customerName;
	private String customerAddress;
	private String customerPhoneNumber;
	
	public Customer() {
		
	}
	
	public Customer(int ID, String name, String address, String phoneNumber) {
		this.customerID = ID;
		this.customerName = name;
		this.customerAddress = address;
		this.customerPhoneNumber = phoneNumber;
	}
	
	public int getCustomerID() {
		return this.customerID;
	}
	
	public String getCustomerName() {
		return this.customerName;
	}
	
	public String getCustomerAddress() {
		return this.customerAddress;
	}
	
	public String getCustomerPhoneNumber() {
		return this.customerPhoneNumber;
	}
	
	public String log() {
		return "ID: " + getCustomerID() + "\nName: " + getCustomerName() + "\nAddress: " + getCustomerAddress() + "\nPhone Number: " + getCustomerPhoneNumber() + "\n";
	}
	
}
