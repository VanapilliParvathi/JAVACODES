package SweetShop;
import java.util.Map;
import java.util.HashMap;

public class Srikrishna implements ShopItems {
	Map<String,Sweet> SweetMap;
	Map<Integer,Coustomer> CoustomerMap;
	
	public Srikrishna() {
		this.SweetMap = new HashMap<>();
		this.CoustomerMap = new HashMap<>();
		
	}
	

	@Override
	public void registercoustomer(String sweet, Coustomer coustomer) {
		// TODO Auto-generated method stub
		CoustomerMap.put(coustomer.getCustomerId(), coustomer);
		
	}

	@Override
	public void putsweets(Sweet sweet) {
		// TODO Auto-generated method stub
		SweetMap.put(sweet.getSweetName(), sweet);
		
	}

	@Override
	public Sweet getsweetinfo(String name) {
		// TODO Auto-generated method stub
		return SweetMap.get(name);
	}
	
	

}
