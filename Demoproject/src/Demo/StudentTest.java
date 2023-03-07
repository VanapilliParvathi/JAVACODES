package Demo;
// OBJECT CREATING FOR CLASSES
public class StudentTest {
	public static void main(String args[]) {
		StudentADD st1 = new StudentADD();
		StudentADD st2 = new StudentADD ();
//		Student st3= new StudentADD();    here we are creating studentadd class object
		Student st3= new Student();
		st1.setName("Paru");
		st2.setName("manasa");
		st1.setRolNumber(100);
		st2.setRolNumber(200);
		st1.setAadharNumber(1235458);
		System.out.println(st1.getRolNumber());
		System.out.println(st1.getName());
		System.out.println(st2.getName());
		
		st1.print();
//		System.out.println(st1.getAadharNumber());
	    st1.printAadhar();
//	    st1.aadhar();           method overloading calling
//	    st1.aadhar(651564451);
	    st1.aadhar();
	    st3.aadhar();       //method overriding calling
	    

}
}
