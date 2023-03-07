package Demo;

public class BoxTest {

	public static void main(String args[]) {
//		 passing values to the constructor
		Box B1= new Box(10,20); 
		Box B2= new Box(4,6);
		System.out.println(B1.area());
		System.out.println(B2.area());
//	    System.out.println(B1.height);   Its is private variable we cannot access in other classes
	    System.out.println(B2.length);
	    Box.print(); // Its is static calling
	    //when we use static keyword we cannot create object
	    System.out.println(Box.depth);
	    }
}
