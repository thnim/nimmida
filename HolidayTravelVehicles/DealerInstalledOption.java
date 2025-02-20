
public class DealerInstalledOption {
	
	private int dealerOptionCode;
	private String dealerOptionDescription;
	private int dealerOptionPrice;
	
	public DealerInstalledOption() {
		
	}
	
	public DealerInstalledOption(int code, String description, int price) {
		this.dealerOptionCode = code;
		this.dealerOptionDescription = description;
		this.dealerOptionPrice = price;
	}
	
	public int getDealerOptionCode() {
		return this.dealerOptionCode;
	}
	
	public String getDealerOptionDescription() {
		return this.dealerOptionDescription;
	}
	
	public int getDealerOptionPrice() {
		return this.dealerOptionPrice;
	}
	
	public String log() {
		return "Dealer Installed Option: " + getDealerOptionCode() + "\nDescription: " + getDealerOptionDescription() + "\nPrice: " + getDealerOptionPrice();
	}
}
