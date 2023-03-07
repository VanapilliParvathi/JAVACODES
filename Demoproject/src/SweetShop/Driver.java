package SweetShop;

public class Driver {
	public static void main(String args[]) {
		
		Srikrishna srikrishna=new Srikrishna();
		Sweet kowa = new Sweet();
		kowa.setSweetName("KOWA");
		kowa.setQuantity(100);
		kowa.setAmount(95);
		
		Sweet laddu =new Sweet();
		laddu.setSweetName("LADDU");
		laddu.setQuantity(50);
		laddu.setAmount(55);
		
		
		Sweet DryfriutLaddu =new Sweet();
		DryfriutLaddu.setSweetName("DryfriutLaddu");
		DryfriutLaddu.setQuantity(25);
		DryfriutLaddu.setAmount(150);
		
		srikrishna.putsweets(kowa);
		srikrishna.putsweets(laddu);
		srikrishna.putsweets(DryfriutLaddu);
		
		Coustomer paru =new Coustomer();
		paru.setCustomerName("paru");
		paru.setAddress("Vizag");
		paru.setPhoneNo(8688080);
		paru.setCustomerId(1001);
		paru.setSweet("Kowa");
		
		System.out.println(srikrishna.getsweetinfo("KOWA"));
		srikrishna.registercoustomer("kowa", paru);
		
		
		
	}

}
