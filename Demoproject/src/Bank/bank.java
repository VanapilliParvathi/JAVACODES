package Bank;

public interface bank {
	public void registerCustomer(Customer customer);
	public Customer getCustomer(int custId);
	public boolean deposit(Customer customer, int amount);
	public boolean withdrawl(Customer customer, int amount);
	

}
