package Demo;
import java.io.*;

public class matrix {
	public static void matrixmethod(int mat[][]) {
		 for(int i=0;i< mat.length; i++) {
			 for(int j=0;j< mat[i].length;j++) {
				 System.out.println(mat[i][j]+" ");
			 }
			 System.out.println();
		 }
		
		
	}
	public static void main(String args[]) 
	throws IOException {
		int mat[][]= {{2,3,4},{45,89,9},{54,67,90}};
		matrixmethod(mat);
		
	}

}
