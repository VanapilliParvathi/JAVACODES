package Demo;
//ENCAPSULATION
public class Student {
	public String name;
	public int rolNumber;
	public String Address;
	public int classNum;
	
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public int getRolNumber() {
		return rolNumber;
	}
	public void setRolNumber(int rolNumber) {
		this.rolNumber = rolNumber;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String Address) {
		this.Address = Address;
	}
	public int getClassNum() {
		return classNum;
	}
	public void setClassNum(int classNum) {
		this.classNum = classNum;
	}
	public void print() {
		System.out.println("IN student class");
	}
//	public void aadhar() {                                         METHOD OVERLOADING
//		System.out.println("Aadhar number is not applicable");       
//	}
	public void aadhar() {                                         // METHOD OVERRIDING
		System.out.println("Aadhar number is not applicable");       
	}
}
