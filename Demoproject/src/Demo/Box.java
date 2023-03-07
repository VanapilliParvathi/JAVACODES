package Demo;

public class Box {
	int length = 10;
	int width = 20;
	private int height=30;
	public static int depth=10;
//	constructor calling
    public Box(int l,int w) {
    	this.length=l;
    	this.width=w;
    }
    public int area() {
    	
    	return length*width;
    }
    public static void print() {
    	System.out.println("In Box class");
    }
}
