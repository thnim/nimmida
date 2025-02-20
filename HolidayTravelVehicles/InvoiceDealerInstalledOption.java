
public class InvoiceDealerInstalledOption {
	
	private int invoceDealerOptionNumber;
	private int invoiceDealerOptionCode;
	
	public InvoiceDealerInstalledOption() {
		
	}
	
	public InvoiceDealerInstalledOption(int invoiceNumber, int dealerOptionCode) {
		this.invoceDealerOptionNumber = invoiceNumber;
		this.invoiceDealerOptionCode = dealerOptionCode;
	}
	
	public int getInvoceDealerOptionNumber() {
		return this.invoceDealerOptionNumber;
	}
	
	public int getInvoiceDealerOptionCode() {
		return this.invoiceDealerOptionCode;
	}
}
