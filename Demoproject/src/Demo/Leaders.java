package Demo;


public class Leaders {
	public static void main(String args[]) {
		int[] arr = new int[]{21,4,20,9,2,3};
		
		for(int i=0;i< arr.length;i++) {
			int j;
			for(j=i+1;j<arr.length;j++) {
			if(arr[i]<=arr[j]) {
				break;
			}
			}
			if(j==arr.length) {
				System.out.println(arr[i]+ " ");
			}
			
	}

}
}