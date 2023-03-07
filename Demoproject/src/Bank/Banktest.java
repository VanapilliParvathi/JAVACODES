package Bank;

public class Banktest {
public static void main(String args[]) {
	
//	create customer object
	
	Customer paru = new Customer();
	paru.setAadhar(98989767);
	paru.setAddress("vizag");
	paru.setBalance(1000);
	paru.setCustomerId(100);
	paru.setNomine("manasa");
//	paru.setBankName("ICIC");
	
//	creating 2nd customer object
	Customer manasa =new Customer();
	manasa.setAadhar(755653765);
	manasa.setAddress("hyderbad");
	manasa.setBalance(2000);
	manasa.setCustomerId(200);
	manasa.setNomine("pooja");
	
	
//	create bank object
	HDFCBank hdfc = new HDFCBank();
	hdfc.registerCustomer(paru);
	hdfc.registerCustomer(manasa);
//	hdfc.getCustomer(100);
	hdfc.deposit(paru, 200);
	hdfc.withdrawl(paru, 300);
	System.out.println(hdfc.getCustomer(100).getBalance());
	System.out.println(hdfc.getCustomer(100).getBankName());
    System.out.println(hdfc.getCustomer(200).getBalance());
	 boolean val =hdfc.deposit(paru,200);
	 System.out.println(val);
    
}
}
