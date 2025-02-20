
public class Invoice {
	
	private int invoiceNumber;
	private int invoiceCustomerID;
	private int invoiceSalesPersonID;
	private int invoiceVehicleSerialNumber;
	private int invoiceTradeInSerailNumber;
	private int totalPrice;
	private int taxAmount;
	private int licenseFee;
	
	public Invoice() {
		
	}
	
	public Invoice(int invoice, int customerID, int salesPersonID, int vehicleSerialNumber, int tradeInSerialNumber, int price, int tax, int licenseFee) {
		this.invoiceNumber = invoice;
		this.invoiceCustomerID = customerID;
		this.invoiceSalesPersonID = salesPersonID;
		this.invoiceVehicleSerialNumber = vehicleSerialNumber;
		this.invoiceTradeInSerailNumber = tradeInSerialNumber;
		this.totalPrice = price;
		this.taxAmount = tax;
		this.licenseFee = licenseFee;
	}

	public int getInvoiceNumber() {
		return this.invoiceNumber;
	}
	
	public int getInvoiceCustomerID() {
		return this.invoiceCustomerID;
	}
	
	public int getInvoiceSalesPersonID() {
		return this.invoiceSalesPersonID;
	}
	
	public int getInvoiceVehicleSerialNumber() {
		return this.invoiceVehicleSerialNumber;
	}
	
	public int getInvoiceTradeInSerailNumbe() {
		return this.invoiceTradeInSerailNumber;
	}
	
	public int getTotalPrice() {
		return this.totalPrice;
	}
	
	public int getTaxAmount() {
		return this.taxAmount;
	}
	
	public int getLicenseFee() {
		return this.licenseFee;
	}
	
	public String log() {
		return "Invoice Number: " + getInvoiceNumber() + "\nCustomerID: " + getInvoiceCustomerID() + "\nSalesPersonID: " + getInvoiceSalesPersonID() + 
				"\nVehicle Serial Number: " + getInvoiceVehicleSerialNumber() + "\nTrade-In Serial Number: " + getInvoiceTradeInSerailNumbe() +
				"\nTotal Price: " + getTotalPrice() + "\nTaxAmount: " + getTaxAmount() + "\nLicense Fee: " + getLicenseFee();
	}
}
	