package Bank;

import java.util.HashMap;
 
public class HDFCBank implements bank {
	
	HashMap<Integer,Customer> customerMap;
	
	public HDFCBank() {
		this.customerMap =new HashMap<>();
	}

	@Override
	public void registerCustomer(Customer customer) {
		// TODO Auto-generated method stub
		customer.setBankName("HDFC");
		customerMap.put(customer.getCustomerId(),customer);
		
		
	}

	@Override
	public Customer getCustomer(int custId) {
		// TODO Auto-generated method stub
		
		return customerMap.get(custId);
	}

	@Override
	public boolean deposit(Customer customer, int amount) {
		// TODO Auto-generated method stub
		Customer cust= customerMap.get(customer.getCustomerId());
		cust.setBalance(cust.getBalance()+amount);
		customerMap.put(customer.getCustomerId(),cust);
		return true;
	}

	@Override
	public boolean withdrawl(Customer customer, int amount){
		// TODO Auto-generated method stub
		Customer cust= customerMap.get(customer.getCustomerId());
		cust.setBalance(cust.getBalance()-amount);
		customerMap.put(customer.getCustomerId(),cust);
		return true;
	
	}
	
	
	

}
