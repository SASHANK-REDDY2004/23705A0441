public class Linear_Search {
	public static void main (String[] args) {
		System.out.println("The element is at:"+linearSearch(new int[] {2,3,5,7,8,10,32,45,99},45));
	}
	public static int linearSearch(int[] nums,int target) {
		for(int i=0; i<nums.length; i++) {
			if(nums[i]==target) return i;
		}
		return -1;
	}
}
