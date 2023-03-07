package SweetShop;

public class Sweet {
	public String SweetName;
	public int Quantity;
	public double Amount;
	public String getSweetName() {
		return SweetName;
	}
	public void setSweetName(String sweetName) {
		SweetName = sweetName;
	}
	public int getQuantity() {
		return Quantity;
	}
	public void setQuantity(int quantity) {
		Quantity = quantity;
	}
	public double getAmount() {
		return Amount;
	}
	public void setAmount(double amount) {
		Amount = amount;
	}
	@Override
	public String toString() {
		return "Sweet [SweetName=" + SweetName + ", Quantity=" + Quantity + ", Amount=" + Amount + "]";
	}
	
	

}
