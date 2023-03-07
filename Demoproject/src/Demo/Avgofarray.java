package Demo;
import java.util.Arrays;

public class Avgofarray {
	public static void main(String args[]) {
		
        int[] arr = new int[]{2,5,3,11,45,12};
        Arrays.sort(arr);
        double sum=0;
        for(int i=1;i< arr.length-1;i++) {
        	sum=sum+arr[i];
        }
        double average= (sum)/arr.length-2;
        System.out.println(average);
	}

}
