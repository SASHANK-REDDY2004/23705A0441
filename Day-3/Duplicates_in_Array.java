public class Duplicates_in_Array {
	public static void main(String[] args) {
		int[] nums= {10,10,20,20,30,40,50,50,60,60,60,70,70,90};
		int i=0;
		for(int j=0; j<nums.length; j++) {
			if(nums[i]!=nums[j]) {
				nums[i+1]=nums[j];
				i++;
			}
		}
		for(int j=0; j<=i; j++) {
			System.out.print(nums[j]+" ");
		}


	}
}