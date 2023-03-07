package Demo;
//INHERITANCE
public class StudentADD extends Student{
	private int AadharNumber;
	

	public void setAadharNumber(int aadharNumber) {
		AadharNumber = aadharNumber;
	}


	public int getAadharNumber() {
		return AadharNumber;
	}
	public void printAadhar() {
		System.out.println(AadharNumber);
	}
//    public void aadhar(int number) {                                  METHOD OVERLOADING
//    	System.out.println("aadhar number in ADD:"+number);
//    }
	public void aadhar() {                                         
		System.out.println("Aadhar number in studentADD");       
	}
}
