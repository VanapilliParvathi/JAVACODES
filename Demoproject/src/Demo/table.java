package Demo;
import java.util.Scanner;


public class table {
	public static void main(String args[]) {
		System.out.println("enter number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i=1;
		while(i<=20){
			System.out.println(n*i);
			i=i+1;
			
		}
	}

}
