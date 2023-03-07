package Demo;

import java.util.*;

public class SortingArray {
	public static void sorting(int arr[]) {
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
    public static void main(String args[]) {
    	int[] arr= new int[]{0,1,2,1,0,1,0};
    	sorting(arr);
    }
}
