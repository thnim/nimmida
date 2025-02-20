
public class TradeInVehicle {

	private int tradeInSerialNumber;
	private String tradeInModel;
	private int tradeInYear;
	private boolean tradeInAllowance;

	public TradeInVehicle(int serialNumber, String model, int year, boolean tradeInAllowance) {
		this.tradeInSerialNumber = serialNumber;
		this.tradeInModel = model;
		this.tradeInYear = year;
		this.tradeInAllowance = tradeInAllowance;
	}
	
	public int getTradeInSerialNumber() {
		return this.tradeInSerialNumber;
	}
	
	public String getTradeInModel() {
		return this.tradeInModel;
	}
	
	public int getTradeInYear() {
		return this.tradeInYear;
	}
	
	public boolean getTradeInAllowance() {
		return this.tradeInAllowance;
	}
	
	public String log() {
		return "Trade-In Serial Number: " + getTradeInSerialNumber() + "\nModel: " + getTradeInModel() + "\nYear: " + getTradeInYear() +
				"\nAllowance: " + getTradeInAllowance();
	}
}
